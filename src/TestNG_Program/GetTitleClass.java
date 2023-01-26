package TestNG_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleClass {
	
	public static void main(String[] args) {
		
	
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String Title= driver.getTitle();
	System.out.println(Title);
	
	String ExpectedTitle="Facebook";
	
	if(Title.contains(ExpectedTitle)) {
		System.out.println("Test Case Pass");
	}else {
		System.out.println("Test case fail");
	}

	}
}
