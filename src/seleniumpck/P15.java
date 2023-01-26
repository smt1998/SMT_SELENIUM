package seleniumpck;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class P15 {
// take a screenshot by using the TakeScreenShot Reference
	
	WebDriver driver;
	public void TakeSS(WebDriver driver ,String name) throws IOException {	
//		Step-1 give the path 
		String path=System.getProperty("user.dir")+"//SCREENSHOT"+name+".jpg";
		
//  	Step-2 using takeScreenShot Reference 
		TakesScreenshot ss= (TakesScreenshot) driver;
		
//    step-3  give the source file
		File souceFile=ss.getScreenshotAs(OutputType.FILE);
		
//		Step-4 using file object create object of class
		File file=new File(path);

//		using the file handler
		FileHandler.copy(souceFile, file);
	
//		add comment to select the class 
		System.out.println("take a screenshot successfully");
		
		
	}
	
	
	public void Launch() throws IOException, InterruptedException {
		// step-1 launch instance of chrome
		driver=new ChromeDriver();
		
		// Step-2 maximize the windows 
		driver.manage().window().maximize();
		
		// step-3- open the webpage
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
//		step-4 calling the method take a screenshot
		TakeSS(driver,"FB");
		Thread.sleep(2000);
		System.out.println("get a screenshot");
		driver.close();
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		P15 dio=new P15();
		dio.Launch();
	}
	
	
	
	
	
}