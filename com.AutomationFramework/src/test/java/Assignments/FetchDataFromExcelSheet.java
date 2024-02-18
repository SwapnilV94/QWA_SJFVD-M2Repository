package Assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class FetchDataFromExcelSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("src/test/resources/DataFetch");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Valid");
		Row row = sheet.getRow(1);
		org.apache.poi.ss.usermodel.Cell cell = row.getCell(0);
		String username = cell.getStringCellValue();
		System.out.println(username);
		
		
		
	}

}
