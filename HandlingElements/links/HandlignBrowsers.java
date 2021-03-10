package HandlingElements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlignBrowsers {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//*[@id='Tabbed']/a/button")).click(); // opens multiple browsers
		
		Set <String> s=driver.getWindowHandles(); // ID of the browser window in string format
		
		for(String i:s)
		{
			String title=driver.switchTo().window(i).getTitle();
			System.out.println(title);
			if(title.equals("Frames & windows"))
			{
				driver.close();
			}
			
		}

	}

}
