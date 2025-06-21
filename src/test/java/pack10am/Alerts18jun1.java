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



public class Alerts18jun1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		/*
		
	WebElement	button1=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		
		
	button1.click();
	
	
	Thread.sleep(5000);
	
	
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		
		
		//driver.switchTo().alert();
		
		   Alert  alert1 =driver.switchTo().alert();
		
		
		   alert1.accept();
		*/
		//-------------------------------------------------
		   
		   /*
		   driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		   
			
		   Alert  alert1 =driver.switchTo().alert();
		
		   Thread.sleep(5000);
			
		   
		 //  alert1.dismiss();
		   alert1.accept();
		   */
		   //----------------------------------
		   
		   
		   driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		   
		   
		   Alert  alert1 =driver.switchTo().alert();
		   
		   Thread.sleep(5000);
		   
		   
		   alert1.sendKeys("Welcome");
		   
		   Thread.sleep(5000);
		   
		   
		   alert1.accept();
		   
		   
		   
		   
		   
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
