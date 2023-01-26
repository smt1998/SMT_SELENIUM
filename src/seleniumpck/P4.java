
// GET CURRENT URL AND TITLE OF GIVEN WEBPAGE...........
package seleniumpck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/downloads/");

		Thread.sleep(2000);

		String title = driver.getTitle();

		String ExpectedTitle = "Downloads | Selenium";
        System.out.println("TITLE OF CURRENT WEB PAGE");
		System.out.println(title);
     
		if (ExpectedTitle.equals(title)) {
			System.out.println("test1 case pass");
		} else {
			System.out.println("test1 case is fail");
		}
		System.out.println();
		System.out.println("URL OF CURRENT WEB PAGE");
     String url=driver.getCurrentUrl();
     System.out.println(url);
     
     String ExpectedUrl="https://www.selenium.dev/downloads/";
     
     if(ExpectedUrl.equals(url)) {
    	 System.out.println("test2 case pass");
     } else {
    	 System.out.println("test2 case is fail");
     }
     
     Thread.sleep(5000);
     
     driver.close();
		
		

	}
}


          























