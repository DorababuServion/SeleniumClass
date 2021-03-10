package HandlingElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksValidation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","C://Program Files/eclipse/geckodriver-v0.9.0-win64/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize(); // maximize the windows
		
		
		List <WebElement> links=driver.findElements(By.tagName("a")); // capturing all the links
		
		System.out.println("Non of Links Present:"+ links.size()); // Non of links
		
				
		String linkTexts[]=new String[links.size()];
		
		int i=0;
		
		for(WebElement e:links)
		{
			linkTexts[i]=e.getText(); // capture the text from web elements(links)
			i++;
		}
		
		
		for(String s: linkTexts)   // reading link text from the string array
		{
			System.out.println(s);
			
			driver.findElement(By.linkText(s)).click();
			
			if (driver.getTitle().equals("Under Construction: Mercury Tours"))
			{
				System.out.println(s+ " " + "Page is Under construction");
			
			}
			
			else
			{
				System.out.println(s+" "+"Page is working");
			}
			
			driver.navigate().back(); // this will goto home page to validate other links
			
		}
			
		

	}

}
