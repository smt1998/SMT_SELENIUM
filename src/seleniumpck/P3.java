package seleniumpck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {
public static void main(String[] args) throws InterruptedException {
	//1. to create a instance of a chrome
	WebDriver driver=new ChromeDriver();
	Thread.sleep(5000);
	//2. to maximize the windows
	driver.manage().window().maximize();
	Thread.sleep(5000);
	//type ==1 to open the given page url
	driver.get("https://www.facebook.com/");
	// to find the linkText of the given webpage
	WebElement link1= driver.findElement(By.linkText("Forgotten password?"));
	link1.click();
	Thread.sleep(5000);
	
	// to navigate the back we will use here backword navigation
	driver.navigate().back();
     Thread.sleep(5000);
	// type==2  to find the element by using patiallinktext.
	WebElement link2=driver.findElement(By.partialLinkText("Forgotten"));	
	link2.click();
	Thread.sleep(5000);
	
	// to close the web browser we have to use close method here
	driver.close();
	
	
	
	
	
	
}
}
