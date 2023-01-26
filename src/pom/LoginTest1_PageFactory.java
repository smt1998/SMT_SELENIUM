package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest1_PageFactory {

	WebDriver driver;
	LoginPage1_PageFactory lp;
	@BeforeClass
	
	
	public void initBrowser() {
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// implicit wait 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      		
		 lp=new LoginPage1_PageFactory(driver);
	}
	
	
	@Test
	public void VerifyTitle() {
		
		Assert.assertTrue(lp.getPageTitle().contains("range"));
	}
	
	
	@Test 
	public void login() throws InterruptedException {
		lp.enterCred();
		Thread.sleep(2000);
		lp.loginButton();
		
	}
	
	@AfterClass
	public void tearDown () {
		
		System.out.println("AFTER CLASS METHOD");
		
		driver.close();
	}
	
	
	
}
