package testpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Practice2 {
  
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
System.out.println("launch");
	}
	
	
	@BeforeClass 
	public void y() {
		System.out.println("test case y");
	}
	
	@BeforeClass
	public void z() {
		System.out.println("test case z");
	}
	
	
	@Test (priority=1)
  public void T() {
		System.out.println("Test T1");
  }
	
	
	@Test
	  public void A() {
			System.out.println("Test A1");
	  }
}
