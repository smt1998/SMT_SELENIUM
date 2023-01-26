package seleniumpck;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SCREENSHOT {

	WebDriver driver;

	public void ScreenShotCapture(WebDriver driver,String name ) throws IOException {
		// step-1 to give the path
		
    String path    =System.getProperty("user.dir")+"\\SCREENSHOT\\"+name+".jpg";	
//         varname =        method     (directory)+  foldername    
    
    System.out.println(path);
    
		// step-2 using take screenshot reference 
    TakesScreenshot TSS=(TakesScreenshot) driver;
    // interface           interface
    // step-3
    File sourceFile = TSS.getScreenshotAs(OutputType.FILE);
  //Class  filename  = vName  method sel   method- fomatetype
    
    // step-4 using file object==> create object of File Class
    
    File destinationFile=new      File       (path);
// Class  var.Name    =  keyword  classaname (argument)
		
    // step-5 using find handler
    
    FileHandler.copy(sourceFile, destinationFile);
//   class      method 
    
    System.out.println("Sreenshot captured");

	
	}
	
	public void launch() throws IOException, InterruptedException {
 //1. launch instance
		driver= new ChromeDriver();
		
// 2.maximize the window
		driver.manage().window().maximize();

// 3. to open the webpage
		driver.get("https://vctcpune.com/selenium/practice.html");
		
// 4. for scrolling ===> JavascriptExecutor
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
     js.executeScript("window.scrollBy(0,700)");
     
 // 5. to take screenshot
     ScreenShotCapture(driver,"image2");
     
 // step6- close
     
     Thread.sleep(8000);
     driver.close();
		
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		SCREENSHOT dio=new SCREENSHOT();
		dio.launch();
		System.out.println("SUCCESSFULLY TAKE A SCREENSHOT");
	}
}
