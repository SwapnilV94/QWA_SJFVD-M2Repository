package DesignBaseTestUsingAnnotation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvalidLogin extends BaseTest{
	
	@Test
	public void invalidLogin() throws IOException {
		
	  //BaseTest test = new BaseTest();
	  //  test.setup();
	
	Flib lib = new Flib();
	String username = lib.getDataFromProperty(PROPPATH, "InvalidUserName");
	String password = lib.getDataFromProperty(PROPPATH, "InvalidPassword");
	
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.name("username")).click();
		
	}

}
