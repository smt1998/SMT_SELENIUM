package pratice_purpose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PP {

	public static void main(String[] args) {
		  WebDriver driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.myntra.com/");
		String Title= driver.getCurrentUrl();
		System.out.println(Title);
		
		String ExpectedTitle="Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		
		if(Title.equals(ExpectedTitle)){
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test case fail");
		}
	}
	
	
}

// expected resut=Actual result