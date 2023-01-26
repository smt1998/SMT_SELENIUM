package seleniumpck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PRACTICE {

	public static void main(String[] args) throws InterruptedException {

// 1. to create instance of a chrome

		WebDriver driver = new ChromeDriver();
Thread.sleep(5000);
// 2. to maximize the window
		driver.manage().window().maximize();
Thread.sleep(4000);
//3. to open the url in the webbrowser

driver.get("https://www.facebook.com/");
Thread.sleep(4000);
// to find the path and the elements by using find elements

WebElement usernameTextBox= driver.findElement(By.name("email"));
usernameTextBox.sendKeys("vishalumale@gmail.com");

// to find the element by id and give it input and inter the password
WebElement passTextBox= driver.findElement(By.id("pass"));
Thread.sleep(2000);
passTextBox.sendKeys("vishal@123");

	
// to find the elements by using the classname
WebElement login=driver.findElement(By.name("login"));
login.click();

Thread.sleep(5000);
	driver.close();
	}
}
