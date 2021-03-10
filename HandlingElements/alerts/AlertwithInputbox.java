package HandlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertwithInputbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();//button1

		driver.findElement(By.xpath("//*[@id='Textbox']/button")).click(); //button2
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().sendKeys("welcome");
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
	}

}
