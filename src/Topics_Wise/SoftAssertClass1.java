package Topics_Wise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertClass1 {
	WebDriver driver;

	@BeforeClass
	public void launch() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

	}

	@Test
	public void getTitle() {
		String Title = driver.getTitle();

		System.out.println(Title);

		String ExpectedTitle = "Facebook ? log in or sign up";
		
		Assert.assertEquals(Title, ExpectedTitle);
		

	}	
	
	@Test 
	public void logButton() {
		Boolean logBtn=driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		
		// create soft assert class 
	 SoftAssert sa =new SoftAssert();
	 
		sa.assertFalse(logBtn);
		System.out.println("login button is not clickable");
		System.out.println("you have delebrately stop the test cases here so pls check and again...");
	}

	@AfterClass
	public void tearDown() throws InterruptedException {

		Thread.sleep(2000);
		
		driver.close();

	}

}
