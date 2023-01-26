package seleniumpck;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SS {
	public void WriteData(String value, int R, int C) throws IOException {
		// Step-1 locate the path
		String path = System.getProperty("user.dir") + "\\DATA\\WriteData.xlsx";

		// Step-2 use File class
		File file = new File(path);

		// step-3 using FileInputStream to read the data
		FileInputStream fis = new FileInputStream(file);

		// find the workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// find the sheet
		XSSFSheet sheet = wb.getSheetAt(0);

		// create row
		XSSFRow row = sheet.createRow(R);

		// create cell
		XSSFCell cell = row.createCell(C);

		// set cell value
		cell.setCellValue(value);

		// using file output stream class
		FileOutputStream fos = new FileOutputStream(path);

		wb.write(fos);
	}

	public static void main(String[] args) throws IOException {
		System.out.println("main method");
		SS dio = new SS();

		String[] val = { "sumit", "sandip", "vilas", "sunanda", "wasnik" };

		int row = 0;
		int col = 0;
		for (String var : val) {

			dio.WriteData(var, row, col);
			row++;
		}

	}
}
