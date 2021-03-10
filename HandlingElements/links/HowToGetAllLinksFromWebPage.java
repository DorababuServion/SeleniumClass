package HandlingElements;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToGetAllLinksFromWebPage {
	WebDriver driver;
	
	@Test
	public void enterText() throws InterruptedException, ParseException{

		System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		
		// navigate to site
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		// An implicit wait tells WebDriver to poll the DOM for a certain amount of time when trying to find an element
		// or elements if they are not immediately available.
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// to get all links from given web page
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		
		// create array list object
		ArrayList<String> data = new ArrayList<String>();
		
		// run for loop
		for(int i =0; i<links.size();i++){
			System.out.println(links.get(i).getText());
			// add href attribute data in arrayList
			data.add(links.get(i).getAttribute("href"));
			// every link has href attribute
			System.out.println(links.get(i).getAttribute("href"));
		}
		
		// print size of array
		System.out.println(data.size());
		
	}
}
