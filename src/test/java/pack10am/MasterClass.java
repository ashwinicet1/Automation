package packself;

//Below pacakages need to be imported for running Selenium code:
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chromium.ChromiumDriver;

public class MasterClass 
{
	public static void main(String[] args) 
{	/*   Has all commands  */

/* Chromedriver is a class which is implemented from Webdriver Interface.
 * We have to create an object named 'driver' for the ChromeDriver class.
 * From now onwards 'driver' object created will be used to perform actions on the web page 
 * like clicking on buttons, filling values in boxes etc..
 * On running the below code, Chrome browser will be opened.
 */
		ChromeDriver driver=new ChromeDriver();
		
/* 'get' is a method of Chromedriver class. For this method we have to give the
 * webpage URL(https://demo.nopcommerce.com) as the parameter. On running the below command, chrome browser
 * will be opened with the given Webpage URL.
 */		
		
		driver.get("https://demo.nopcommerce.com");
		
/* Any button, or link or textbox or anything in the webpage is called a web element.
 * There are different ways of accessing the web elements. Accessing web elements means like
 * if we want to click on a button or a link or type some data in the text boxes.
 * 
 * Below are the methods available for accessing a web element.
 * By id 	attribute
 * By name	attribute
 * By class	attribute
 * By tagname
 * By linktext
 * By partial linktext
 * 
 * By cssSelector
 * By xpath 
*/			

/* 	***********Finding an element by the 'id' attribute.***************************
 * Open the webpage, right click on the element which you want to locate.
 * Click on Inspect. It will open the DOM(Document Object Model) structure pointing
 * towards the element which you had chosen.
 * From that record, look for the 'id' attribute. Attributes are type,class,id,autocomplete, name,placeholder,aria-label for the below record.
 * For example from the below record, 'id' attribute is "small-searchterms".
 * <input type="text" class="search-box-text ui-autocomplete-input" id="small-searchterms" autocomplete="off" name="q" placeholder="Search store" aria-label="Search store">
 * Below is the format for using id attribute for finding element:
 * By.id("value of the id attribute value")
 * Below is the command used to identify the web element with id attribute.
 */		
		
		
		driver.findElement(By.id("small-searchterms"));
		// findElement is the method in ChromeDriver class which will locate the element whose details we are giving in the parameters of this method.

/* The above element is a text box. In order to type some text in the box, we have to use
 * the sendkeys("Text to be typed in") method.
 * Below is the way to type a text 'Phone' in the text box.
 * */		 		
		driver.findElement(By.id("small-searchterms")).sendKeys("Phone");
		
/* ******************Finding an element by the 'name' attribute.*********************
* Open the webpage, right click on the element which you want to locate.
* Click on Inspect. It will open the DOM(Document Object Model) structure pointing
* towards the element which you had chosen.
* From that record, look for the 'name' attribute.
* For example from the below record, 'name' attribute is "q".
* <input type="text" class="search-box-text ui-autocomplete-input" id="small-searchterms" autocomplete="off" name="q" placeholder="Search store" aria-label="Search store">
* Below is the format for using name attribute for finding element:
* By.name("value of the name attribute value")
* Below is the command used to identify the web element with name attribute 
* and type a text 'Headphone'.
*/		
				
		driver.findElement(By.name("q")).sendKeys("Headphone");
		

/* ******************Finding an element by the 'class' attribute.*********************
* Open the webpage, right click on the element which you want to locate.
* Click on Inspect. It will open the DOM(Document Object Model) structure pointing
* towards the element which you had chosen.
* From that record, look for the 'class' attribute.
* For example from the below record, 'class' attribute is "search-box-text ui-autocomplete-input".
* But we should not use the whole value. We should use only the value before the space which is "search-box-text".
* <input type="text" class="search-box-text ui-autocomplete-input" id="small-searchterms" autocomplete="off" name="q" placeholder="Search store" aria-label="Search store">
* Below is the format for using class attribute for finding element:
* By.className("value of the class attribute value before space")
* Below is the command used to identify the web element with class attribute 
* and type a text 'mobile'.
*/
		
		driver.findElement(By.className("search-box-text")).sendKeys("mobile");
		

/* ******************Finding elements by tagname.*********************
* Open the webpage, right click on the element which you want to locate.
* Click on Inspect. It will open the DOM(Document Object Model) structure pointing
* towards the element which you had chosen.
* From that record, look for the tag.
* For example from the below record, the value of tag is 'input.
* <input type="text" class="search-box-text ui-autocomplete-input" id="small-searchterms" autocomplete="off" name="q" placeholder="Search store" aria-label="Search store">
* Elements which are expecting some input from user like text box, radio button, checkboxes will have 'input' as the tag.
* For elements which are of type link will have 'a' tagname.
* For elements which are images, will have 'img' as the tag name.
* If for example user wants to know how many places are there where user can give input, 
* command can be written to find all elements which have 'input' as the tag name.
* Below is the format for using tagname to find elements:
* By.tagName("name of tag. eg input")
* Below is the command used to identify the web elements with tabname as input. 
* and store all the elements in a variable named 'links'.
*/


		List<WebElement> links=driver.findElements(By.tagName("input"));
		// findElements() method returns variable of type List<WebElement>.
		// This return type can be seen by hovering the mouse over the findElements() method.
		// All the webelements with 'input' as tagname will get stored in 'links' variable.
		
		System.out.println(links.size());
		// This command will print the size of links. This way we can know how many web elements are there with 'input' as tagname.
		// List is an interface from which ArrayList class is created. ArrayList class implements List Interface.
		// So we can use the .size() method of ArrayList to find the size.
		

/* ******************Finding an element by the linktext.*********************
* This type of element search can be used only on elements which have links.
* Open the webpage, right click on the element which you want to locate.
* Click on Inspect. It will open the DOM(Document Object Model) structure pointing
* towards the element which you had chosen.
* From that record, confirm if it has an href attribute.
* For example in the below record from a web element which is a link, href attribute can be seen.
* <a href="/computers">Computers </a>
* From this record, look for the inner text. Here 'Computers' is the inner text.
* This inner text we will be using to find the element by linktext
* Below is the format for finding element using linktext:
* By.linkText("Value of inner text")
* Below is the command used to identify the web element with linktext
* and clicking on the link.
*/

		driver.findElement(By.linkText("Computers")).click();
		

/* ******************Finding an element by the partial linktext.*********************
* This type of element search can be used only on elements which have links.
* Open the webpage, right click on the element which you want to locate.
* Click on Inspect. It will open the DOM(Document Object Model) structure pointing
* towards the element which you had chosen.
* From that record, confirm if it has an href attribute.
* For example in the below record from a web element which is a link, href attribute can be seen.
* <a href="/computers">Computers </a>
* From this record, look for the inner text. Here 'Computers' is the inner text.
* If we want to search for the element without giving the full inner text value. 
* For example instead of 'Computers', we want to give only 'Compute', we can use partial link text.
* Below is the format for finding element using partial linktext:
* By.partialLinkText("Value of partial inner text")
* Below is the command used to identify the web element with partial linktext
* and clicking on the link.
*/
		
		
		driver.findElement(By.partialLinkText("Compute")).click();
		
		
/* ******************Finding an element by the cssSelector.*********************
* This time of element search involves combination searchs. eg tagname and id.
* This is used to narrow down the search to one element when there are elements with same attribute values.
* Below are the 4 types of cssSelector combinations:
* tag id				tag#id
* tag class				tag.classname
* tag attribute 		tag[attribute="value"]
* tag class attribute 	tag.classname[attribute="value"]
*/		
		
/* ********cssSelector combination: tag and id*************************************
* Below is the format for tagname and id.
* 	tag#id       Tagname should be followed by # and then id value.
* For example from the below record, the value of tag is 'input' and id is 'small-searchterms'.
* <input type="text" class="search-box-text ui-autocomplete-input" id="small-searchterms" autocomplete="off" name="q" placeholder="Search store" aria-label="Search store">
*/		
		
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Laptop");
		
/* ********cssSelector combination: tag and classname*************************************
* Below is the format for tagname and classname.
* 	tag.classname       Tagname should be followed by '.' and then class value.
* For example from the below record, the value of tag is 'input' and id is 'search-box-text'.
* <input type="text" class="search-box-text ui-autocomplete-input" id="small-searchterms" autocomplete="off" name="q" placeholder="Search store" aria-label="Search store">
*/		

		
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Macbook");
		
		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Macbook");
		// Tagname is not mandatory. In above statement no tag is present. But '.' should be present.

		
/* ********cssSelector combination: tag and attribute*************************************
* Below is the format for tagname and attribute combination.
* 	tag[attribute="value"]       
* Any of the attribute values can be used
* For example from the below record, the value of tag is 'input' and value of placeholder attribute is  is 'Search store'.
* THe value of the attribute should be given in single quotes ''.
* <input type="text" class="search-box-text ui-autocomplete-input" id="small-searchterms" autocomplete="off" name="q" placeholder="Search store" aria-label="Search store">
*/		

		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Tablet");
		
		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Tablet");
		// Tagname is not mandatory. In above statement no tag is present. 

		
		
		
		
/* ********cssSelector combination: tag,classname and attribute*************************************
* Below is the format for tagname,classname and attribute combination.
* 	tag[attribute="value"]       
* Any of the attribute values can be used
* For example from the below record, the value of tag is 'input',class name is 'search-box-text' and value of name attribute is 'q'.
* THe value of the attribute should be given in single quotes ''.
* <input type="text" class="search-box-text ui-autocomplete-input" id="small-searchterms" autocomplete="off" name="q" placeholder="Search store" aria-label="Search store">
*/		
		
		
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("ipad");
				
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("ipad");
		// Tagname is not mandatory. In above statement no tag is present. But '.' should be present.

		
		
/* ********Find element by xpath*************************************
* Below is the format for xpath
* 	//tagname[@attribute='Value']
*  Tagname is not mandatory.Instead of that * can be given. It means any value of tagname.
* 	//*[@attribute="value"]     
* Any of the attribute values can be used
* For example from the below record, the value of tag is 'input'and value of id attribute is small-searchterms.
* THe value of the attribute should be given in single quotes ''.
* <input type="text" class="search-box-text ui-autocomplete-input" id="small-searchterms" autocomplete="off" name="q" placeholder="Search store" aria-label="Search store">
*/		
					
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Lenovo");
		
		driver.findElement(By.xpath("//input[@id='small-searchterms'][@placeholder='Search store']")).sendKeys("Phone");
		// Two attributes can be combined as above to narrow down the search.
		
		//driver.findElement(By.xpath("//input[@id='small-searchterms' or @placeholder='Search store']")).sendKeys("Phone");
		

		
		
/* ********Important notes*********************************************************************
 * 1) When using inner text for linktext, donot take the space. Need to remove the space and pass the parameter in
 *  double quotes. Also when using By.classname, do not take the whole class attribute with space. Only take the one
 *  till the beginning of space.
 *  For xpath, its the opposite. Space should be considered both while using inner text(Using text()) and for search by class attribute(@class=].
 * 2)Tags
	For search boxes, or checkboxes wherever user has to give input, “input” tag is used.
	Eg: <input type="text" class="search-box-text ui-autocomplete-input" id="small-searchterms" autocomplete="off" name="q" placeholder="Search store" aria-label="Search store" data-last-active-input="">

	For images, “img” tag is used
	<img alt="nopCommerce demo store" src="https://demo.nopcommerce.com/Themes/DefaultClean/Content/images/logo.png">

	For links, ,”a” tag is used:
	<a href="/computers">Computers </a>
	href attribute contains the link. 'Computers' is the inner text.
 *
 *
*/	
		
		
		
		
		//sangee.pushpa3@gmail.com
		
}

}
