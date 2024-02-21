package com.TimeSheetManagementToolProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import GenericLib.WorkLib;
import PomPages.CreateNewProjectPage;
import PomPages.HomePage;
import PomPages.LoginPage;
import PomPages.OpenTasksPage;
import PomPages.ProjectAndCustomerPage;


public class CreateCustomer_ProjectTest extends BaseTest {
	
	@Test
	public void createCustomerAndProject() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String username = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 0);
		String password = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoActitime(username, password);
		
		//click on task link
		HomePage hp = new HomePage(driver);
		hp.clickOnTaskLink();
		
		//click on project and customer
		OpenTasksPage otp = new OpenTasksPage(driver);
		otp.clickOnProjectAndCustomerButton();
		
		//click on create new customer
		ProjectAndCustomerPage pacp = new ProjectAndCustomerPage(driver);
		pacp.clickOnCreateNewCustomerButton();
		
		Flib lib = new Flib();
		WorkLib wlib = new WorkLib();
		String customerName = lib.getDataFromExcelFile(EXCELPATH, CUSTOMERSHEET, 1, 0)+wlib.randomNo();
		String projectName = lib.getDataFromExcelFile(EXCELPATH, CUSTOMERSHEET, 1, 1)+wlib.randomNo();
		
		//create customer and project
		CreateNewProjectPage cnpp = new CreateNewProjectPage(driver);
		cnpp.createCustomerAndProject(customerName,driver, projectName);
	}
	
	

}
