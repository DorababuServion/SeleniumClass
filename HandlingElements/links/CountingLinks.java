package HandlingElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		int noOfLinks=driver.findElements(By.tagName("a")).size();
		System.out.println(noOfLinks);

		//capture text from links
		List <WebElement>links=driver.findElements(By.tagName("a"));
		
		for(WebElement e:links)
		{
			System.out.println(e.getText()); // Extracting text value from link element
		}
		
		
	}

}
