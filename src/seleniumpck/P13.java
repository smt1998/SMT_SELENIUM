package seleniumpck;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// scrolling in the webpage
public class P13 {
	public static void main(String[] args) throws InterruptedException {
//		step-1 launch the instance of chrome
		WebDriver driver = new ChromeDriver();
		
//		step-2 to maximize the windows
		driver.manage().window().maximize();
		
//		step-3 to open the webpage
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);
		
//		step-4 scrolling pixel
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
        js.executeScript("window.scrollBy(0,600)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,600)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(2000);
        
	
	}

}
