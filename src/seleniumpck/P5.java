package seleniumpck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5 {
public static void main(String[] args) throws InterruptedException {
	
	//1.  to open web browser  (  to launch a webpage )
	
	WebDriver    driver      = new                ChromeDriver();
// (interface) (variableName) = keyword(object)       (class)
	
	
//2. to maximize the window
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);

// to get current url of webpage
	
	driver.get("https://vctcpune.com/selenium/practice.html");
	
	Thread.sleep(3000);
	
// NAVIGATION
//	1. TO  2. BACK  3. FORWORD 4. REFRESH
	
// 1. TO = IT USE TO ADD NEW URL IN TO THE PAGE
	
driver.navigate().to("https://www.facebook.com/");

Thread.sleep(3000);
// 2. to navigate back

driver.navigate().back();
Thread.sleep(2000);

// to navigate the forward

driver.navigate().forward();
Thread.sleep(2000);

// to refresh the web page

driver.navigate().refresh();

Thread.sleep(4000);
			
driver.close();
		

// get title..............
			
			
			
			
			
			
			
			
			
			
			
	
}
}
