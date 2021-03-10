package HandlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePicker3 {
	WebDriver driver;
	
	@Test
	public void enterText() throws InterruptedException{
		
		String month = "November 2018";
		String day = "20";
		
		System.setProperty("webdriver.chrome.driver", "C://Drivers/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.phptravels.net/");
		
		driver.findElement(By.xpath("//*[@id=\"dpd1\"]")).click();
		
		Thread.sleep(2000);
		
		while(true){
			String text = driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div/table/thead/tr/th[2]")).getText();
			System.out.println(text);
			if(text.equals(month)){
				break;
			}
			else{
				driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div/table/thead/tr/th[3]")).click();
			}
		}
		
		driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div/table/tbody/tr/td[contains(text(),'21')]")).click();
		
		
	}
}
