package seleniumpck;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SSClass2 {
WebDriver driver;

	public void capturescreenshot(WebDriver driver, String Name) throws IOException {
		
// step1:- location find 
		
	String path= System.getProperty("user.dir")+"\\SCREENSHOT\\"+Name+".jpg";
//	       varname       method     dir_Folder     folderName   capImgName SSformate
	
// step 2. using take a Screenshot Reference
	TakesScreenshot TSS= (TakesScreenshot) driver;
//	interface       var =                  driver var= context webDriver inteface
	
// Step-3 
	
	File sourceFile =TSS.getScreenshotAs(OutputType.FILE);
//  CLASS  VAR            method         interface    FILE
	
//(	function = method)
	
// step-4  using file object
	
	File       destinationFile = new File            (path);
//	classname   var_Name         keyword  classname   path
	
// step-5 using file handler
	
	FileHandler.copy(sourceFile, destinationFile);
//  class_Name function ()==return type void
	// IO exception occures ==> FileHandler
	
	System.out.println("SS CAPTURE");
	
	
	}
	
	public void launch() throws InterruptedException, IOException {
		
		//1. lauch instance of chrome
		
	driver= new ChromeDriver();	
	
	//2. to maximize the window
	
	driver.manage().window().maximize();
	
	//3. to open the webpage
	driver.get("https://vctcpune.com/selenium/practice.html");
	// step4. Scrolling
	
	JavascriptExecutor js      =(JavascriptExecutor) driver;
//	interface          var_Name                     driver var= context webDriver inteface	
	
	js.executeScript("window.scrollBy(0,600)");
//var_name  method  function  method (x ,y ) 
	Thread.sleep(2000);
	
	
	capturescreenshot(driver,"WSS1");
	
	
	}


	public static void main(String[] args) throws InterruptedException, IOException {
		
		SSClass2 dio =new SSClass2();
		dio.launch();
	}

}















