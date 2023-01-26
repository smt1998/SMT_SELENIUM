package seleniumpck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassB {
public static void main(String[] args) throws InterruptedException {
	
	// instance of method
	WebDriver dio=new ChromeDriver();
	
	
	WebDriver var=new ChromeDriver();
	// TO MAXIMIZE THE WINDOWS
	dio.manage().window().maximize();
	
	//to open the web pages
	dio.get("https://translate.google.co.in/");
	
	// to set a time limit to the given link
	Thread.sleep(10000);
	
	
	// to stop the method.....
	dio.close();

	
}
}
