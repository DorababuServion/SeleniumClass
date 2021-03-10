package HandlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/SeleniumPractice/sample.html");
		
		int rows=driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();  //5
		int cols=driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/th")).size(); //3
		
		System.out.println(rows);
		System.out.println(cols);
		
		//System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[3]")).getText());
		
		System.out.println("Product"+" "+"Article"+" "+"Price");
		
		for(int r=2;r<=rows;r++) //3
		{
			for(int c=1;c<=cols;c++) //1 2 3
			{
				String value=driver.findElement(By.xpath("/html/body/table/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
		
	}

}
