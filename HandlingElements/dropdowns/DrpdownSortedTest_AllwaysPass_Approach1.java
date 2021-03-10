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

public class DrpdownSortedTest_AllwaysPass_Approach1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement element = driver.findElement(By.xpath("//*[@id=\"animals\"]"));
		Select se = new Select(element);
		
		ArrayList originalList = new ArrayList();
		
		for (WebElement e : se.getOptions()) {
			originalList.add(e.getText());
		}
		System.out.println("originalList:"+ originalList);
				
		ArrayList tempList=originalList;
		Collections.sort(tempList); //When you change one list, it changes the other list as well.
				
		System.out.println("originalList:"+ originalList);
		System.out.println("tempList:"+ tempList);
		
		//So the test gets pass all the time because the sequence in the originalList and tempList is going to be same.
		//If you are following above process then your test never fails, bacause When you change one list, it changes the other list as well.
		
		if(originalList==tempList)
		{
			System.out.println("Dropdown sorted");
		}
				
	}

}
