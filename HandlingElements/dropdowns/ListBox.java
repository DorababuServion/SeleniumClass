package HandlingElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C://Program Files/eclipse/geckodriver-v0.9.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();  //FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		Select listb=new Select(driver.findElement(By.xpath(".//*[@id='fruits']")));
		
		listb.selectByIndex(3);
		listb.selectByValue("banana");
		listb.selectByVisibleText("Apple");
		
		
		List <WebElement> options=listb.getOptions();
		
		System.out.println(options.size());  // count no.of elements
		
		for(WebElement i:options)
		{
			System.out.println(i.getText());
			
		}
		
		
	}

}
