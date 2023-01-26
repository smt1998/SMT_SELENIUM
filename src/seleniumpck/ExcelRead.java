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

public class ExcelRead {

	WebDriver driver;

	public String ExcelReader(String Name, int r, int col) throws IOException {
		// step-1 locate path

		String path = System.getProperty("user.dir") + "\\DATA\\TestData.xlsx";

		// step-2 create file class object
		File fs = new File(path);

		// step-3 using file input stream to read data
		FileInputStream fis = new FileInputStream(fs);

		// step-4 using POI library classes ==> to handle workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// step-5 locate sheet
		XSSFSheet sheet = wb.getSheet(Name);

		// step-6 to locate the row
		XSSFRow row = sheet.getRow(r);

		// step-7 to locate the col
		XSSFCell cell = row.getCell(col);

		// step-8 read value from cell
		String value = cell.getStringCellValue();

		return value;

	}

	public void lauch() throws InterruptedException, IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(ExcelReader("Sheet1", 0, 0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ExcelReader("Sheet1", 0, 1));

		// driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(ExcelReader("sheet1",
		// 1, 0));
		Thread.sleep(8000);
		driver.close();

	}

	public static void main(String[] args) throws InterruptedException, IOException {
		ExcelRead dio = new ExcelRead();
		dio.lauch();

	}

}
