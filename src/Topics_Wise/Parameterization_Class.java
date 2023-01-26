package Topics_Wise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;



public class Parameterization_Class {
	WebDriver driver;

	@BeforeClass
	public void preCondition() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}
	@Test
	public void enterCread(String input) {
		
		driver.findElement(By.id("gmail")).sendKeys(input);
	
	
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
	Thread.sleep(4000);
		
		
	}
}
