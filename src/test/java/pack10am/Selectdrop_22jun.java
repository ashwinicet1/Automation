package pack10am;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
//import java.util.List;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chromium.ChromiumDriver;



public class Selectdrop_22jun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		WebElement countryselect=driver.findElement(By.id("country"));
		
		
		Select options=new Select(countryselect); 
		
		//options.selectByVisibleText("United Kingdom");
		
		
		//options.selectByValue("brazil");
		
		//options.selectByIndex(9);
		
		List<WebElement>	listofcountries= options.getOptions();
		/*
		
		for(int i=0;i<10;i++)
		{
			
			String 	countryname=listofcountries.get(i).getText();
			System.out.println(countryname);
		}
		*/
		
		for( WebElement  x:listofcountries)
		{
			
			
			String countryname=x.getText();
			System.out.println(countryname);
			
		}
		
		
		
		
//	String 	countryname=listofcountries.get(5).getText();
		
		//System.out.println(countryname);
		
		
	//String	title=driver.findElement(By.className("title")).getText();
		
		//System.out.println(title);
		
		
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
