package pack10am;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chromium.ChromiumDriver;



public class Tabledata_10jul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");		
		
		
		
		for(int i=1;i<=4;i++)
		{
		
			//String	header1=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th[i]")).getText();
			
			
			
			
			String	header1=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th["+i+"]")).getText();
		
	
			System.out.print(header1+"\t\t");
			//System.out.print(" ");
		}
	
		System.out.println();
		
		
		//^^ Header printing code
		
		
		
		for(int j=2;j<=7;j++)
		{
		
			for(int i=1;i<=4;i++)
			{
				String	tabledata1=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+j+"]/td["+i+"]")).getText();
			
				
				//String	tabledata1=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[3]/td[1]")).getText();
				//String	tabledata1=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[3]/td[2]")).getText();
				
		
				System.out.print(tabledata1+"\t\t");
				//System.out.print(" ");
			}
		
			System.out.println();
		
		
		}
		
		
		
		
		
		
		
		
		
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//driver.close();
		driver.quit();
		
		//   System.out.println(
		
	}

}
