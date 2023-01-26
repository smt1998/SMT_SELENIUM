package seleniumpck;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		// to find the element
		WebElement input =driver.findElement(By.xpath("// input[@ id='name']"));
		input.sendKeys("velocity");
		Thread.sleep(3000);
		
		WebElement confirmButton =driver.findElement(By.xpath("// input[@ id='confirmbtn']"));
		confirmButton.click();
		Thread.sleep(3000);
		
		Alert alertbutton= driver.switchTo().alert();
		alertbutton.dismiss();
		Thread.sleep(3000);
	
		
		
		
		
		
		
		
		
	}
	}
