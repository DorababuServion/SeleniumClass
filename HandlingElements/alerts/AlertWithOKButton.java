package HandlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOKButton {

	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//*[@id='OKTab']/button")).click(); // Clicking on the button
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept(); // close alert box by clicking on OK button
		
	}

}
