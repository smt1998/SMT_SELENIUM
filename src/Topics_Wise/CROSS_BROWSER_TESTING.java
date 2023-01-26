package Topics_Wise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CROSS_BROWSER_TESTING {
	WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void launch(String Browser1) throws InterruptedException {

		if (Browser1.contains("Chrome")) {
			driver = new ChromeDriver();

		} else if (Browser1.contains("Edge")) {

			driver = new EdgeDriver();

		} else {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

	}

	@Test
	public void username() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("sumit123@gmail.com");
		Thread.sleep(2000);
	}

	@AfterClass
	public void tearDown() throws InterruptedException {

		Thread.sleep(2000);
		driver.close();

	}

}
