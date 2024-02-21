package com.TimeSheetManagementToolProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import PomPages.LoginPage;

public class InvalidLoginTest extends BaseTest{
	
	@Test
	public void invalidLogin() throws EncryptedDocumentException, IOException
	{
		Flib lib = new Flib();
		int rc = lib.getRowCount(EXCELPATH, INVALIDSHEETNAME);
		for (int i =1; i<=rc;i++)
		{
			String username = getDataFromExcelFile(EXCELPATH, INVALIDSHEETNAME, i, 0);
			String password = getDataFromExcelFile(EXCELPATH, INVALIDSHEETNAME, i, 1);
			LoginPage lp = new LoginPage(driver);
			lp.invalidLoginIntoActitime(username, password);
			
			
		}
	}

}
