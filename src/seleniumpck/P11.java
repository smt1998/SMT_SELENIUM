package seleniumpck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P11 {
	
	public static void main(String[] args) throws InterruptedException {

		// step 1  lauch instance of chrome
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(2000);

		
		WebElement DCD=driver.findElement(By.id("doubleClickBtn"));
		Actions act=new Actions (driver);
      
		act.doubleClick(DCD).perform();
		
		Thread.sleep(5000);
		
		String Text=driver.findElement(By.id("doubleClickBtn")).getText();
		System.out.println(Text);
		if(Text.contains("double click")) {
			System.out.println("test case pass");
		}else {
			System.out.println("test case fail");
		}
		
		}
	}

	/*
	 * string int action
	 * 
	 * 
	 * 
	 * //1. single click click(); =====()void argument() //2. double click
	 * doubleclick(); //3. right click contextclick();
	 * 
	 */


