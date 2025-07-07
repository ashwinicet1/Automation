package pack10am;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chromium.ChromiumDriver;



public class Configproperties_7jul {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		
		Properties prop1=new Properties();
		
		String path=System.getProperty("user.dir")+"/testdata/config.properties";
		
	//	/Users/ashwinikumar/Selenium14Feb2025/Automation/testdata/config.properties
		
		FileInputStream file1= new FileInputStream(path);
		
		prop1.load(file1);
		
	String	appurl=prop1.getProperty("AppURL");
		
	System.out.println(appurl);
	
	
	driver.get(appurl);
	
	
	String  username1=prop1.getProperty("username");
	String password1=prop1.getProperty("password");
		
	driver.findElement(By.name("username")).sendKeys(username1);
	driver.findElement(By.name("password")).sendKeys(password1);
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
		/*
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//driver.get();
		*/
		
		
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//driver.close();
	//	driver.quit();
		
		//   System.out.println(
		
	}

}
