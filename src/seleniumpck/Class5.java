package seleniumpck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class5 {
public static void main(String[] args) throws InterruptedException {
	// 1. launch the instance of chrome
	WebDriver driver= new ChromeDriver();
	// maximize the windows
	driver.manage().window().maximize();
	// 3. to open the webpage
	driver.get("https://www.facebook.com/login/");
	//4. to find the elements username
	WebElement usernameTextBox=driver.findElement(By.name("email"));
	usernameTextBox.sendKeys("abc@gmail.com");
    Thread.sleep(2000);
    // 5. to find the elements password box
    WebElement passBox=driver.findElement(By.id("pass"));
    passBox.sendKeys("smt@123456");
    Thread.sleep(4000);
    // 6. to find the element button in webpage
    WebElement loginButton= driver.findElement(By.id("loginbutton"));
    
   
    // to click on the login button
    loginButton.click();
    Thread.sleep(4000);
    // to close browser
    driver.close();    
	
}
}
