package pack10am;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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



public class Headlesstesting_7jul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");  // setting for headless mode of execution
		
			
		WebDriver driver=new ChromeDriver(options); 
			       
		driver.get("https://testautomationpractice.blogspot.com/");
				
		String act_title=driver.getTitle();
		
		
		System.out.println(act_title);
		
		
//		if(act_title.equals("Automation Testing Practice"))
//		{
//			System.out.println("Test Passed");
//		}
//		else
//		{
//			System.out.println("Test Failed");
//		}
		
		
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
