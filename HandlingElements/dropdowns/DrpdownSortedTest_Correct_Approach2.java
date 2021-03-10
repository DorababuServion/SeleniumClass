package HandlingElements;

//Ref Link: https://chercher.tech/java/dropdown-sorting?fbclid=IwAR3QQnxHJlrI_YrjUVRKnULjTrBqlmv5KzXq0VkCM0-p16UgxJmeAGYL-3o

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DrpdownSortedTest_Correct_Approach2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);

		WebElement element = driver.findElement(By.xpath("//*[@id=\"animals\"]"));
		
		Select se = new Select(element);
				
		ArrayList originalList = new ArrayList();
		ArrayList tempList = new ArrayList();
		
		for (WebElement e : se.getOptions()) {
			originalList.add(e.getText());
			tempList.add(e.getText());
		}

		System.out.println("this is originalList before Sorting"+ originalList);
		System.out.println("this is tempList before Sorting"+ tempList);
		
		Collections.sort(tempList);
		
		System.out.println("this is originalList after Sorting"+ originalList);
		System.out.println("this is tempList after Sorting"+ tempList);
				
		if(originalList==tempList)
		{
			System.out.println("Dropdown sorted");
		}
		else
		{
			System.out.println("Dropdown Not sorted");
			
		}
	}
}
