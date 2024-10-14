package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteTheDataToExcel {

	public static void main(String[] args) throws Throwable 
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/WriteTheData.xlsx");
		
		Workbook workBook = WorkbookFactory.create(fis);
		Sheet sheet = workBook.getSheet("Sheet1");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Bhagyalakshmi");
		
		FileOutputStream fes = new FileOutputStream("./src/test/resources/WriteTheData.xlsx");
		workBook.write(fes);
		workBook.close();


	}

}
