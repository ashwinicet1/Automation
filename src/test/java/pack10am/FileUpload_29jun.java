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



public class FileUpload_29jun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		//For single file upload:
		//driver.findElement(By.id("filesToUpload")).sendKeys("/Users/ashwinikumar/Downloads/File1.txt");
		
		//Multiple files upload
		
		String file1="/Users/ashwinikumar/Downloads/File1.txt";
		String file2="/Users/ashwinikumar/Downloads/File2.txt";
		String file3="/Users/ashwinikumar/Downloads/File3.txt";
		
		
		
		driver.findElement(By.id("filesToUpload")).sendKeys(file1+"\n"+file2+"\n"+file3);
		
		
		
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
