package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1_PageFactory {
	WebDriver driver;

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//*[@type='submit']")
	WebElement login;

	public LoginPage1_PageFactory(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements( driver,this);
	}

	public void enterCred() {

username.sendKeys("Admin");
password.sendKeys("admin123");

	}

	public void loginButton() {

	login.click();

	}

	public String getPageTitle() {
		return driver.getTitle();

	}

}
