package seleniumpck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {
	public static void main(String[] args) throws InterruptedException {

		/*
		 * // step 1. create a instance of chrome WebDriver driver = new ChromeDriver();
		 * Thread.sleep(3000); //step 2 to maximize the windows
		 * driver.manage().window().maximize(); // to hold the opration at thread sleep
		 * Thread.sleep(3000); // step3. to open the url or get the url
		 * driver.get("https://www.facebook.com/"); Thread.sleep(3000); // step.4 to
		 * find the webElement WebElement usernameTextBox =
		 * driver.findElement(By.name("email")); // step.5 to gives the input to the
		 * element/ textbox/module usernameTextBox.sendKeys("sumit@gmail.com");
		 * Thread.sleep(3000); // step6.to find the WebElement of id with the help of By
		 * class WebElement password = driver.findElement(By.id("pass"));
		 * password.sendKeys("smt@123"); Thread.sleep(3000);
		 * 
		 * WebElement login =driver.findElement(By.id("u_0_5_S0")); login.click();
		 * Thread.sleep(3000);
		 * 
		 * driver.close();
		 * 
		 */
// 1. create a instance of a chrome
		WebDriver driver= new ChromeDriver();
// 2. to maximize the windows
		driver.manage().window().maximize();
// 3. to get current url of webpage
		driver.get("https://www.facebook.com/");
// 4. to add sleep method 
		Thread.sleep(1000);
// 5. to add navigation method 
		// 1. to --- it is use to add the new url into the webpage
		driver.navigate().to("https://www.youtube.com/watch?v=18fr9ZnXiUo&list=RDMM18fr9ZnXiUo&start_radio=1");
	
		Thread.sleep(1000);
		// 2. navigate back -- to navigate back to the one step we have to use back navigation
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		// 3. navigate forward--- to navigate the forward we have to use the forward navigation
		driver.navigate().forward();
	    Thread.sleep(1000);
	    
	    // 4. to fefreash the page we have to use refresh navigation.
	    driver.navigate().refresh();
	    
	    Thread.sleep(1000);
	    
	    // to get the tile of the current webpage
	    String title=driver.getTitle();
	    System.out.println(title);
	    
	    String ExpectedTitle=" Full Song - Garibi Jari Tya | Lyrics |Ramai Bhim Geet - YouTube";
	    
	   if (ExpectedTitle.equals(title)) {
		   System.out.println("test case is pass");
	   }else {
		   System.out.println("test case is fail");
	   }
//	    		https://www.youtube.com/watch?v=18fr9ZnXiUo&list=RDMM18fr9ZnXiUo&start_radio=1
	    
	    Thread.sleep(5000);
	    
	    // to get the current page url 
	    String url=driver.getCurrentUrl();
	    System.out.println(url);
	    Thread.sleep(5000);
	    
	    
	    
		// to close the webDriver we have to use the close() function.
		driver.close();
		
		
		
		
	}
}
