package testpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice1 {
	
	WebDriver driver;
	@BeforeClass
	public void launch() throws InterruptedException {
		
		
		 driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		Thread.sleep(10000);
	}
	
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println(" BeforeMethod ");
		
	}
	
	
	
  @Test
  public void loginButton() {
	   WebElement logbutton= driver.findElement(By.xpath("//*[@name='login']"));
	   
	   Assert.assertTrue(logbutton.isEnabled());
	   
	   System.out.println("Test case pass ");
	   
	   
  }
  
	@Test
	public void S() {
		System.out.println("test case S");
	}
  @AfterMethod
  public void tearDown() {
	  
	  driver.close();
	  
	  
  }
  
}














