package seleniumpck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// to get title of webpage

		driver.get("https://www.myntra.com/");

		// store a title in string
		String title = driver.getTitle();

		// to print the title of webpage
		System.out.println(title);

		String outputTitle = "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";  // true

		
		
		if (outputTitle.equals(title)) {
			System.out.println("test case pass");

		} else {
			System.out.println("test case fail");
			
		}

		
		
		
		
		
		
	}

}
