package seleniumpck;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10 {
	public static void main(String[] args) throws InterruptedException {
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://vctcpune.com/selenium/practice.html");
JavascriptExecutor js= (JavascriptExecutor) driver;

WebElement radio1=driver.findElement(By.xpath("//*[@for='radio1'])"));
	    radio1.click();
	    
	}
}
