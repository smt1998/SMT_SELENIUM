package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	WebDriver driver;

	@BeforeClass
	public void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");

	}
	
	@Test
	public void GetUrl() {
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		String ExpectedURl="https://vctcpune.com/selenium/practice.html";
		Assert.assertEquals(URL,ExpectedURl,"Not Getting Expected Result");
		System.out.println("GetUrl test case is successfully pass");
	}
	
	@Test
	public void GetTitle() {
		String Title=driver.getTitle();
		System.out.println(Title);
		String ExpectedTitle="Practice Page";
		Assert.assertNotEquals(Title, ExpectedTitle,"Getting Expected Tilte");
		System.out.println("GetTitle test case is successfully pass");
		
		
	}
	@Test
	public void GetTitle22() {
		String Title=driver.getTitle();
		System.out.println(Title);
		String ExpectedTitle="Practice Page";
		Assert.assertTrue(ExpectedTitle,"is not enabled");
Assert.assertTrue(false, ExpectedTitle);

		
	}
	
	
	
	
	@AfterClass
	public void logout() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
}
