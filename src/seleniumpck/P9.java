package seleniumpck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P9 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement userId=driver.findElement(By.tagName("input"));
		
				
//	varname. method    class locator ( "string value")
		
	driver.findElement(By.id("email"));
		
	WebElement Passbutton	=driver.findElement(By.name("pass"));

	WebElement Passbutton23	=driver.findElement(By.className(""));
		
		
		
		/*
		 * String url=driver.getCurrentUrl();
		 * System.out.println("this is my current page url"); System.out.println(url);
		 * 
		 * String exceptedurl="https://vctcpune.com/selenium/practice.html";
		 * System.out.println();
		 * 
		 * if(exceptedurl.equals(exceptedurl)) { System.out.println("test case pass");
		 * 
		 * }else { System.out.println("test case fail");
		 * 
		 * }
		 */
	
	
		Thread.sleep(10000);
		driver.close();
		
	}
	
}
