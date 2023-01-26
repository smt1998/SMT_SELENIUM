package parametrization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Para1 {
  
	WebDriver driver;
	
	@BeforeClass
	public void launch() {
		 driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.facebook.com/");
		 
	}
	
@Parameters("username")
	
@Test
public void usernameEnter(String id) {

	driver.findElement(By.id("email")).sendKeys(id);
	
	
}

@AfterClass

public void TearDown() throws InterruptedException {
	Thread.sleep(5000);
	driver.close();
}








	
}
