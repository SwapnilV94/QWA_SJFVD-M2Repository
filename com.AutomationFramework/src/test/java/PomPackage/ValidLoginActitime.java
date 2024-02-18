package PomPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class ValidLoginActitime extends BaseTest{
	
	public static void main(String[] args) throws IOException {
		
		BaseTest test = new BaseTest();
		test.setup();
		LoginPage lp = new LoginPage( driver);
		Flib lib = new Flib();
		lp.loginIntoActitime(lib.getDataFromExcelSheet(EXCELPATH, SHEETNAME, 1, 0),
				  lib.getDataFromExcelSheet(EXCELPATH, SHEETNAME, 1, 1));
		test.tearDown();
	}
	

}
