package seleniumpck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4 {
public static void main(String[] args) throws InterruptedException {
	// to interlink with web
	WebDriver sumit=new ChromeDriver();
	
	// to maximize the windows
	sumit.manage().window().maximize();
	
	// to open the url
	sumit.get("https://codingspeedtest.com/?language=javascript");
	
	// to set a timing to the url
	Thread.sleep(50000);
	
	// to stop the operation
	
	sumit.close();
	
}
}
