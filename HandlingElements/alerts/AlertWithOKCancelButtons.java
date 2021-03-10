package HandlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOKCancelButtons {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
				
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();//clcik on OK & Cancel link

		driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click(); // click on button
				
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept(); // close alert box by clicking on OK button
		
		String r=driver.findElement(By.xpath("//*[@id='demo']")).getText(); //capture label
		
		if(r.equals("You pressed Ok")) // Validating OK button message
		{
			System.out.println(" test PASSED with OK button");
		}
		else
		{
			System.out.println(" test FAILED with OK button");
		}
		
		driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click(); // click on button
		Thread.sleep(5000);
		
		driver.switchTo().alert().dismiss(); // close alert box by clicking on Cancel button
			
		
		r=driver.findElement(By.xpath("//*[@id='demo']")).getText(); //capture label
		
		
		if(r.equals("You Pressed Cancel")) // validating Cancel button message
		{
			System.out.println(" test PASSED with CANCEL button");
		}
		else
		{
			System.out.println(" test FAILED with CANCEL button");
		}
		
		
	}

}
