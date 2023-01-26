package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Anna1 {
	WebDriver driver;
	SoftAssert sa;
	Select sel;

	@BeforeClass
	public void launch() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://vctcpune.com/selenium/practice.html");

	}

	@Test
	public void verifyRadioButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("Windows.scrollBy(0,800)");
		WebElement RadioButton = driver.findElement(By.xpath("//input[contains(@value,'Radio1')]"));

		RadioButton.click();
		Assert.assertTrue(true, "RadioButton is not clickable");
		System.out.println("Radio Button is Clickable");
		

	}

	/*
	 * @Test public void GetUrl() { String URl = driver.getCurrentUrl();
	 * System.out.println(URl); String ExpectedUrl =
	 * "https://vctcpune.com/selenium/practice.html"; Assert.assertEquals(URl,
	 * ExpectedUrl); System.out.println("GetURl test case is successsfully pass"); }
	 */

	@Test
	public void GetTitle() {
		String Title = driver.getTitle();
		System.out.println(Title);
		String ExpectedTitle = "Practice Page";

		sa = new SoftAssert();
// SOftAssert Class object Creation.		

		sa.assertNotEquals(Title, ExpectedTitle);
		System.out.println("Assignment No. 1");
		System.out.println("GetTitle test case is successsfully Verified");
		sa.assertAll();
	}


	@AfterClass
	public void logout() throws InterruptedException {

		Thread.sleep(3000);
		driver.close();
	}

}
