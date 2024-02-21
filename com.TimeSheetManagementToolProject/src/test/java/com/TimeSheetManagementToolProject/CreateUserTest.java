package com.TimeSheetManagementToolProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import GenericLib.WorkLib;
import PomPages.CreateNewUserPage;
import PomPages.CreateUserPage;
import PomPages.HomePage;
import PomPages.LoginPage;

public class CreateUserTest extends BaseTest {

	@Test
	public void createUser() throws EncryptedDocumentException, IOException, InterruptedException {

		String username = getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 0);
		String password = getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoActitime(username, password);
		HomePage hp = new HomePage(driver);
		hp.clickOnUserLink();
		CreateUserPage cup = new CreateUserPage(driver);
		cup.clickOnCreateNewUser();
		CreateNewUserPage cnu = new CreateNewUserPage(driver);
		WorkLib wlib = new WorkLib();
		String username1 = lib.getDataFromExcelFile(EXCELPATH, USERDATA, 1, 0);
		System.out.println(username1);
		String password1 = lib.getDataFromExcelFile(EXCELPATH, USERDATA, 1, 1);
		String fn = lib.getDataFromExcelFile(EXCELPATH, USERDATA, 1, 2);
		String ln = lib.getDataFromExcelFile(EXCELPATH, USERDATA, 1, 3);
		cnu.createUser(username1 + wlib.randomNo(), password1, fn + wlib.randomNo(), ln + wlib.randomNo());

	}

}
