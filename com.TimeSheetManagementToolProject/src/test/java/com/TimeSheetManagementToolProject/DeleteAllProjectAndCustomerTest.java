package com.TimeSheetManagementToolProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import PomPages.HomePage;
import PomPages.LoginPage;
import PomPages.OpenTasksPage;
import PomPages.ProjectAndCustomerPage;

public class DeleteAllProjectAndCustomerTest extends BaseTest{
	
	@Test
	public void deleteAllProjectAndCustomer() throws EncryptedDocumentException, IOException
	{
		String username= lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 0);
		String password = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoActitime(username, password);
		
		//click on task link
		HomePage hp = new HomePage(driver);
		hp.clickOnTaskLink();
		
		//click on project and customer
		OpenTasksPage otp = new OpenTasksPage(driver);
		otp.clickOnProjectAndCustomerButton();
		
		//delete all
		ProjectAndCustomerPage pncp = new ProjectAndCustomerPage(driver);
		pncp.clickOnDeleteAll();
				
	}

}