package seleniumpck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6 {
	public static void main(String[] args) throws InterruptedException {
		// write a sample script for selenium to launch the instance
		// 1. launch the instance of chrome
		WebDriver driver = new ChromeDriver();

		// 2.TO MAXIMIZE THE WINDOWS
		driver.manage().window().maximize();
		//3. TO OPEN THE WEBPAGE
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/login/");
		// 4. TO FIND THE ELEMENTNAME ON THE WEBPAGE
		WebElement usernameFB = driver.findElement(By.className("email"));
		// to add some input to the textbox
		usernameFB.sendKeys("swapnilbhau@gmail.com");
		Thread.sleep(3000);
		//5. TO FIND THE ELEMENT -- PASSWORD BOX
		WebElement userpass= driver.findElement(By.id("pass"));
		userpass.sendKeys("bhau@12345");
        Thread.sleep(3000);		
		//6. TO FIND THE ELEMENT BUTTON
        WebElement loginButton= driver.findElement(By.className("loginbutton"));
      	Thread.sleep(5000);
      	// to close the browser
      	driver.close();
		
		

	}
}
