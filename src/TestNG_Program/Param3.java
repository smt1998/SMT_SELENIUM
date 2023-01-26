package TestNG_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Param3 {
	WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void Launch(String browser1) {

		if (browser1.contains("Chrome")) {

			driver = new ChromeDriver();
		
		} else if (browser1.contains("edge")) {

			driver = new EdgeDriver();

		
		} else {

			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

	}

	@Test
	public void userName() {

		driver.findElement(By.id("email")).sendKeys("sumit@123");
	}

	@AfterClass
	public void tearsdown() throws InterruptedException {
		Thread.sleep(4000);
		//driver.close();
	}
}

