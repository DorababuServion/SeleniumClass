package HandlingElements;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownwithIgnoreCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Select speed = new Select(driver.findElement(By.id("speed"))); //SPEED DROP DOWN

		String visibletext = "MEDIUM";

		switch (visibletext.toLowerCase())  //Any texts converts to lower case
		{
		case "fast":
			speed.selectByVisibleText("Fast");
			break;

		case "faster":
			speed.selectByVisibleText("Faster");
			break;

		case "slow":
			speed.selectByVisibleText("Slow");
			break;

		case "slower":
			speed.selectByVisibleText("Slower");
			break;

		case "medium":
			speed.selectByVisibleText("Medium");
			break;

		default:
			speed.selectByVisibleText("Slower");
		}

	}

}
