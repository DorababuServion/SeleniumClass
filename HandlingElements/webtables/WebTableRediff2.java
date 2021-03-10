package HandlingElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableRediff2 {

	public static void main(String args[]){
		
		
		System.setProperty("webdriver.chrome.driver", "C://Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://money.rediff.com/gainers/bse/daily/");
		
		WebElement pager=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/div[4]"));
		
		List<WebElement> pager_groups=pager.findElements(By.tagName("a"));
		
		System.out.println(pager_groups.size());//No of groups 6
		
		//Reading group link texts into array
		String groups[]=new String[pager_groups.size()]; //Create array with same size of groups
		
		for(int i=0;i<pager_groups.size();i++) // Read all the group links text value into String array
		{
			groups[i]=pager_groups.get(i).getText();
		}
		
		for(String g:groups)
			{
				System.out.println(g);//Printing group name
				System.out.println("----------------------");
				
				driver.findElement(By.linkText(g)).click(); //click on group link
				
				int rows=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr")).size();//total rows
				int cols=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th")).size();//total columns
				
					for(int r=1;r<=rows;r++) //represents rows in a table
					{
						for(int c=1;c<=cols;c++) //represents columns in a table
						{
							
						String value=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+r+"]/td["+c+"]")).getText();
						System.out.print(value+"     ");	
						}
						System.out.println();
					}
			}
					
	}
	
}