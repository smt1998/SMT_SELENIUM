package seleniumpck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12 {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement Username=driver.findElement(By.id("https://www.facebook.com/"));
		
		Username.sendKeys("prachi");
		Thread.sleep(2000);
		
		WebElement password=driver.findElement(By.name("email"));
		
		password.sendKeys("12345");
		Thread.sleep(2000);
		
		
		WebElement login=driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
		login.click();
		
		Thread.sleep(2000);
		driver.close();
		
		
	
	}
	
	
	
	
	
	
}
