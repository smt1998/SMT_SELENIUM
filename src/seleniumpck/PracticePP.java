package seleniumpck;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticePP {

	WebDriver driver;
	List<String> listofdata;
	public static int rowIndex = 0;

	public List<String> excelReader(String sheetname) throws IOException {
//	step-1 locate the path
		String Path = System.getProperty("User.dir") + "\\DATA\\TestData.xlsx";

// step-2 file class to handle the path 
		File file = new File(Path);

// step-3 using file input stream to read the data 
		FileInputStream fis = new FileInputStream(file);

// step-4 using POI library class to handle the workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);

// step-5 locate the sheet
		XSSFSheet sheet = wb.getSheet(sheetname);

// create list object
		listofdata = new ArrayList<String>();

		for (int r = 0; r <= sheet.getLastRowNum(); r++) {

// step-6 locate the row
			XSSFRow row = sheet.getRow(r);

			for (int col = 0; col <= 1; col++) {

// step-7 locate the cell
				XSSFCell cell = row.getCell(col);

// step-8 read value from the cell
				listofdata.add(cell.getStringCellValue());

			}
		}

		return listofdata;

	}
	
	
	public void launch() throws InterruptedException {
		// step-1 launch instance of chrome
		driver=new ChromeDriver();
		
		// step-2 maximize the window
		driver.manage().window().maximize();
		
		// step-3 to open the webpage 
		driver.get("https://www.facebook.com/");
		
		// step-4 enter the value username
		driver.findElement(By.id("email")).sendKeys(listofdata.get(rowIndex));
		
		Thread.sleep(2000);
		// step-5 enter the value of password
		driver.findElement(By.id("pass")).sendKeys(listofdata.get(rowIndex+1));
		
		rowIndex +=2;
		
		Thread.sleep(8000);
		
		
		
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		
		PracticePP dio=new PracticePP();
		dio.excelReader("Sheet1");
		
		for(int i=0;i<3;i++) {
			dio.launch();
			Thread.sleep(2000);
		}
		
	}

}



// ACTIONS CLASS METHOD
//A) FOR MOUSE
//1. Double click() ===> to double click
//2. click()        ===> to single click
//3. Context Click  ===> to Right click
//4. ClickAndHold() 
//5. DragAndDrop()


//B) For KeyBoard

//1. sendKeys();

//C) perform()
//D) build()
//E) Release()
//F) MoveByOffset()

// WINDOW HANDLING AND TAB HANDLING
//1. getWindowHandle();
//2. getWindowHandles();
//3. newWindow()



































