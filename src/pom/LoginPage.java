package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	

	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By login = By.xpath("//*[@type='submit']");

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	public void enterCred() {

		driver.findElement(username).sendKeys("Admin");
		driver.findElement(password).sendKeys("admin123");

	}

	public void loginButton() {

		driver.findElement(login).click();

	}

	public String getPageTitle() {
		return driver.getTitle();

	}

}
