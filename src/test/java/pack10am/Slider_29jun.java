package pack10am;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chromium.ChromiumDriver;



public class Slider_29jun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/p/page3.html");
		
		WebElement slider1=driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
		
		
		Actions slideraction=new Actions(driver);
		
		slideraction.dragAndDropBy(slider1, 100, 0).perform();
		
		
		
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
