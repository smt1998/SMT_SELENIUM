package seleniumpck;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P18 {

	WebDriver driver;
	
public String ExcelReader(String name, int r,int c) throws IOException {

//	Step-1 locate path
	String path=System.getProperty("user.dir")+"//DATA//TestData.xlsx";
	
//  Step-2 Create File class object
	File fs=new File(path);
	
//	Step-3 Using File Input Stream to read the data
	FileInputStream fis=new FileInputStream(fs);
	
//  Step-4 by using poi library
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	
// Step-5 locate sheet
	XSSFSheet sheet =wb.getSheet(name);
	
// Step-6 locate row
	XSSFRow row=sheet.getRow(r);
	
// Step-7 locate cell
	XSSFCell cell=row.getCell(c);
	
// Step- read Value form cell
	String value=cell.getStringCellValue();
	
	return value;
}
public void launch() throws IOException, InterruptedException {
	
	// Step-1 launch instance of chrome
	
	driver=new ChromeDriver();
	
//	 Step-2 maximize the window
	driver.manage().window().maximize();
	
	// step-3 open webpage
	driver.get("https://www.facebook.com/");
	
	// find Element
	driver.findElement(By.id("email")).sendKeys(ExcelReader("Sheet1",0,0));
	Thread.sleep(2000);
	
	driver.findElement(By.id("pass")).sendKeys(ExcelReader("Sheet1",0,0));
	Thread.sleep(2000);
	
	driver.quit();
	
	
}
public static void main(String[] args) throws IOException, InterruptedException {
	P18 dio=new P18();
	dio.launch();
	
}
	
}
