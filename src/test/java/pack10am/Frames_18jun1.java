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



public class Frames_18jun1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		
	WebElement	frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		
	
	driver.switchTo().frame(frame1);
	
	
		driver.findElement(By.name("mytext1")).sendKeys("Welcome");
		
		
		driver.switchTo().defaultContent(); //To come out of frame.
		
	WebElement	frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		

	driver.switchTo().frame(frame2);
	
	
	
	driver.findElement(By.name("mytext2")).sendKeys("Thankyou");
	
		
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
