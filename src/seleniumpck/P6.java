package seleniumpck;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6 {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://vctcpune.com/selenium/practice.html");
	Thread.sleep(1000);
	
//	scrolling - javascriptexecutor
	
	JavascriptExecutor js= (JavascriptExecutor)driver ;
		
	js.executeScript("window.scrollBy(0,700)");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,-700)");
	
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	
	driver.close();
	
	
	
	
	
	
	
	WebDriver driver1 = new ChromeDriver();                  in
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://vctcpune.com/selenium/practice.html");
	Thread.sleep(1000);
	
	
//	             ***********METHODS IN SELENIUM*************************    
//	1. manage();     ====> return type to manage METHOD (instance of options interface)
//	  a) minimize   b) maximize
//	2.get();          ====> return type void( to open the  webpage)
//	3. close();       ====> return type void( to close the webpage)
//	4.navigate();      ====> return type navigation
//	   1. to            ====> return type navigate (we can switch to the new web page)
//	   2. back();       ====> return type navigate (we can switch to the privious webpage) 
//	   3. forward      ====> return type navigate (we can switch to the next webpage) 
//	   4. refresh      ====> return type navigate (we can refresh webpage) 
//	5. getTitle();     ====> return type STRING VALUES (it gives the title of current webpage ) 
//	6. getCurrentUrl(); ====> return type STRING VALUES (it gives the URl of current webpage ) 
//	7. find Element();   ====> return type WebElement (it gives the WebElement present on current webpage ) 
//	8. find Elements();  ====> return type list of WebElement (it gives the list of WebElement present on current webpage ) 
	
//             *******************LOCATORS IN SELENIUM************************
	
	
//  1. Tagname          (driver.findElement(By.tagname(value);     < ancher symbol
//	   ** by using attributs  **
//	2 name   
//	3 id   
//	4 classname

	
//   *******BASE ON LINKEDTEXT********
//	5. LinkedText();
//	6. Partial LinkedText();
	
//	*********based on expression ******
//	7. css selectors
//	 A)  tagName with Id ==>  (tagName#id)
//	 B)  tagName with ClassName ===> (tagName.ClassName)
//	 C)  tagName with any attributes ==>  (tagName[attribute= 'values']);
	
//  8. X-path
//	A) Absolute X-path  (not reccomended )
//	B) relative X-path ( // tagname[@ atrributeName='value']);
//  C) By using Text   (// tagname[ Text()='value']);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
