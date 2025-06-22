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



public class Multiselect_22jun1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.className("multiselect-selected-text")).click();
		
		
		//driver.findElement(By.xpath("//input[@value='jQuery']")).click();
		
		
		
		//List<WebElement>   listwebelements=driver.findElements(By.xpath("//input[@type='checkbox']"));
		List<WebElement>   listwebelements=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']/li/a/label/input"));
		
		
		for( WebElement  x:listwebelements)
		{
			x.click();
		
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
