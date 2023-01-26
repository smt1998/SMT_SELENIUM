package seleniumpck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SClass1 {

	public static void main(String[] args) throws InterruptedException {

//1. to open a chrome browser
		// instance of chorme browser

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);

//2. to maximize the window

		driver.manage().window().maximize();
		Thread.sleep(3000);

// 3. to open the webpage

		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

// 4. find element  
		// 1. NAME

		WebElement usernameTextBox = driver.findElement(By.name("email"));
		Thread.sleep(2000);

		// to insert any input into the texbox or oject/ webelement

		usernameTextBox.sendKeys("prachi@gmail.com");

// 2. ID

		WebElement passwordTextBox = driver.findElement(By.id("pass"));

		passwordTextBox.sendKeys("Prachi@1995");
		Thread.sleep(3000);

// 3. classname
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
		Thread.sleep(3000);
		driver.close();

//4. 	css
		WebElement loginbutton= driver.findElement(By.cssSelector(null))
		
		
		
		
	}
}
