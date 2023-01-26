package seleniumpck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {
public static void main(String[] args) throws InterruptedException {

	// instance of chrome
WebDriver driver=new ChromeDriver();

// to maximize the windows
driver.manage().window().maximize();

// open web page
driver.get("https://www.youtube.com/watch?v=18fr9ZnXiUo&list=RD18fr9ZnXiUo&start_radio=1");

// CLOSE BROWSER
Thread.sleep(15000);	

driver.close();

}
}
