package TestNG_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

	WebDriver driver;

	@Test
	public void Launch() {

		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");

	}

	@Test
	public void GetUrl() {
		String URL = driver.getCurrentUrl();
		System.out.println(URL);

		String ExpectedTitle = "https://www.myntra.com/";
		Assert.assertEquals(URL, ExpectedTitle,"Test Case Pass");
	}

	@Test
	public void logout() {

		System.out.println("test case logout");
	}
}
