package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile {

	public static void main(String[] args) throws Exception {

		// Specify the location of the file

		File src = new File("/Users/paraggaurav/Downloads/TestData.xlsx");

		// Load file

		FileInputStream file = new FileInputStream(src);

		// Load workbook

		XSSFWorkbook wb = new XSSFWorkbook(file);

		// load work sheet

		XSSFSheet sh = wb.getSheet("Sheet1");

		// Print the loaded sheet name

		System.out.println(sh.getSheetName());

		// Print selenium from excel sheet
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());

		// Print selenium from excel sheet
		System.out.println(sh.getRow(1).getCell(0).getStringCellValue());

	}

}
