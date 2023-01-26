package parametrization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Brower_Testing {

	WebDriver driver;

	@Parameters("Browser")
	@BeforeClass
	public void init(String Browser1) {
		if (Browser1.contains("Chrome")) {

			driver = new ChromeDriver();

		} else if (Browser1.contains("edge")) {

			driver = new EdgeDriver();

		} else {

			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

	}
	
	@Test
	public void username() {
		driver.findElement(By.id("email")).sendKeys("sumit@123");
		
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
	
	
	

}
