package HandlingElements;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://goo.gl/RVdKM9");
		
		driver.manage().window().maximize();
		
			
		String year="2018";
		String month="March";
		String date="25";
		
		driver.findElement(By.xpath("//*[@id='q20']/img")).click(); // clcik on date picker Icon
		
		Thread.sleep(3000);
		
		//selectCurrentDate();
		//selectFutureDate(month,date);
		selectPastDate(month,date);
	}
	
	
	//current date
	static void selectCurrentDate()
	{
		Calendar cal=Calendar.getInstance();
		int date=cal.get(Calendar.DATE);
		
		String d=String.valueOf(date); // convert int to String format
		
		driver.findElement(By.linkText(d)).click(); // current date
	}
	
	
	//Select Future Month & Date
	static void selectFutureDate(String m, String d)
	{	
		//Selecting Future Month & Date
			
		Calendar cal=Calendar.getInstance();
		int currentMonth=cal.get(Calendar.MONTH)+1;
		
		for(int i=currentMonth;i>=1;i++)
		{
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click(); //right arrow
			String mon=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span")).getText(); // CAPTURE MONTH
			if(mon.equals(m))
			{
				driver.findElement(By.linkText(d)).click(); // select date
				break;
			}
	}
	}	
	
	
	//Select Past Month & Date
	static void selectPastDate(String m, String d)
	{
		Calendar cal=Calendar.getInstance();
		int currentMonth=cal.get(Calendar.MONTH)+1;
		
		//Selecting Previous Month & Date
				for(int i=currentMonth;i>=1;i--)
				{
					driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[1]/span")).click(); //left arrow
					String mon=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span")).getText(); // CAPTURE MONTH
					if(mon.equals(m))
					{
						driver.findElement(By.linkText(d)).click(); // select date
						break;
					}
				}
				
	}
}
