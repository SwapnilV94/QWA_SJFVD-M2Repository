package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Actitime_Login_CreateUser_Logout_TestNG {
	WebDriver driver = new ChromeDriver();
	@Test(priority = 1)
		public void login() {
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("http://desktop-9c778ne/login.do");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	}
	
	@Test(priority = 2)
	public void createUser() {
		
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("TestEngg");
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("Password@123");
		WebElement d1 = driver.findElement(By.xpath("//select[@name='active']"));
		Select s = new Select(d1);
		s.selectByVisibleText("enabled");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Swapnil");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Verma");
		driver.findElement(By.xpath("//input[@name='overtimeTracking']")).click();
		driver.findElement(By.id("ext-gen20")).click();
		
		driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
	}
	
	@Test(dependsOnMethods = "login", priority = 3)
	public void logout()
	{
		driver.findElement(By.xpath("//a[@class='logout']")).click();
	}

}
