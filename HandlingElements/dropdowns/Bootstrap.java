package HandlingElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bootstrap {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		//First name
		driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input")).sendKeys("john");
		
		//last name
		driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input")).sendKeys("Kim");
		
		//address
		driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea")).sendKeys("canada");
		
		//email
		driver.findElement(By.xpath("//*[@id='eid']/input")).sendKeys("abc@gmail.com");
		
		//phone
		driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input")).sendKeys("23456678");
		
		//gender
		driver.findElement(By.cssSelector("input[value=FeMale]")).click(); //female
		
		//Hobies
		driver.findElement(By.cssSelector("input[value=Cricket]")).click();
		driver.findElement(By.cssSelector("input[value=Hockey]")).click();
		
		//Language selection - Boostrap dropdown
		
		driver.findElement(By.xpath("//*[@id='msdd']")).click();
		List <WebElement>langs=driver.findElements(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul/li/a"));
		System.out.println(langs.size()); // find the number of list otems/options
		
		langs.get(1).click();  //index starts from 0
		langs.get(3).click();
		langs.get(5).click();
		
		Thread.sleep(3000);
		
		//skills
		Select skills=new Select(driver.findElement(By.xpath("//*[@id='Skills']")));
		skills.selectByIndex(3);
		
		//country -dropdown
		Select country=new Select(driver.findElement(By.xpath("//*[@id='countries']")));
		country.selectByValue("Algeria");
		
		//select country - boostrap box
		
		driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span")).click();
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Japan");
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.RETURN);
	}

}
