package HandlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//login
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Admin-->Usermanagement-->User
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).click(); //ADMIN
		driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']")).click(); //Usermanagement
		driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']")).click(); //users
		
		
		int rows=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size();
		
		int count=0;
		for(int r=1;r<=rows;r++)
		{
			String status=driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+r+"]/td[5]")).getText();
			
			if(status.equals("Enabled"))
			{
				count++;  //1 2 3
			}
		}
		
		System.out.println("No of users enabled:"+count);
		
		System.out.println("No of users disabled:"+ (rows-count));
		

	}

}
