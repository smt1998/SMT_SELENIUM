package TestNG_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Param1 {
	
	WebDriver driver;
  @BeforeClass
  public void preCondition()  {
	  driver =new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.facebook.com/");
	  
	  
  }
  
  @Parameters("userinput")
  @Test 
  public void userName(String name)  {
	  
	  driver.findElement(By.id("email")).sendKeys(name);
  }
  
  @AfterClass
  public void tearsdown() throws InterruptedException {
	  Thread.sleep(4000);
	  driver.close();
  }
  
  
}
