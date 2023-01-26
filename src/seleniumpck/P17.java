package seleniumpck;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class P17 {
public static void main(String[] args) throws InterruptedException {
	
	// step-1 launch instance of the chrome
	
	WebDriver driver=new ChromeDriver();
	
	// step-2 maximize window
	driver.manage().window().maximize();
	
	// step-3 open webpage
	driver.get("https://vctcpune.com/selenium/practice.html");
	
	Thread.sleep(2000);
	
	// scrolling
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	WebElement OpenTab=driver.findElement(By.xpath("//a[contains(@id,'opentab')]"));
	
	
	js.executeScript("arguments[0].scrollIntoView();",OpenTab);
	
	Thread.sleep(3000);
	
	OpenTab.click();
	String child=driver.getWindowHandle();
	System.out.println(child);
	
	System.out.println("get allTab window ID");
	Set<String> allTab=driver.getWindowHandles();
	
	System.out.println(allTab);
	
Thread.sleep(2000);

     driver.switchTo().newWindow(WindowType.TAB);
     driver.get("https://www.facebook.com/");
	
	Thread.sleep(10000);

}
	
}
