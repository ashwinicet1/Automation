package pack10am;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chromium.ChromiumDriver;



public class Windows_21jun1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		
	     Set<String>	handles=driver.getWindowHandles();
		
		
	     System.out.println(handles);
	     //[D24F4826BB8D1D618F72C9B6BA3C11A6, F39E53B10BA19AB1EBFBC6ADDB868125]
	  //   [F533318CF0D21ADCBA759C0A093FE5A1, 9EC055B8C0A440278A0AEB26BC63D22A]

	     // First window - Title -  OrangeHRM
	     // Second window title - "Human Resources Management Software | OrangeHRM HR Software "
	     
	     
	     for(String x:handles)
	     {
	    	 
	    	 driver.switchTo().window(x);
	    	 
	    	String title= driver.getTitle();
	    	
	    	System.out.println(title);
	    	 
	    		if(title.equals("Human Resources Management Software | OrangeHRM HR Software")) 
	    		{
	    			driver.findElement(By.xpath("//input[@id='Form_submitForm_action_request']")).click();
	    			
	    		}
	    		
	    		if(title.equals("OrangeHRM"))
	    		{
	    			driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	    			
	    		}
	   
	     }
	     
	     
	     
	     
	     
	     
	     
	     
	    // driver.switchTo().window(null)
	     
	     
	     
		
		//driver.findElement(By.xpath("//input[@id='Form_submitForm_action_request']")).click();
		
		
		
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
