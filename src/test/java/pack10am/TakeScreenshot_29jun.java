package pack10am;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chromium.ChromiumDriver;



public class TakeScreenshot_29jun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		TakesScreenshot ts=driver;
		
		
		//1. Current page full screenshot:
		/*
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		
		
		File targetfile=new File(System.getProperty("user.dir")+"/screenshots/fullpagesatbatch1.png");
		
		
		sourcefile.renameTo(targetfile); // copy sourcefile to target file
		*/
		
		//2. Take screenshot of specific section:
		
		WebElement featured1=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		

		File sourcefile=featured1.getScreenshotAs(OutputType.FILE);
		
		
		File targetfile=new File(System.getProperty("user.dir")+"/screenshots/featredproducts_satbatch1.png");
		
		sourcefile.renameTo(targetfile); // copy sourcefile to target file
		
		
		
		
		
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
