package PomPackage;

import java.io.IOException;

public class InvalidLoginActitime extends BaseTest{
	
	public static void main(String[] args) throws IOException {
		
		BaseTest test = new BaseTest();
		test.setup();
		LoginPage lp = new LoginPage( driver);
		Flib lib = new Flib();
		
		int rowcount = lib.getRowCount(EXCELPATH, INVALIDSHEET);
		
		for (int i =1; i<rowcount ; i++) {
			
			lp.loginIntoActitime(lib.getDataFromExcelSheet(EXCELPATH, INVALIDSHEET, i, 0),
					  lib.getDataFromExcelSheet(EXCELPATH, INVALIDSHEET, i, 1));
			test.tearDown();
		}
		
		}
		
	

}
