package Assignment;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A23_Actitime_Create_DeleteUser {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-9c778ne/login.do");
		
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
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
		Thread.sleep(2000);
		
		WebElement user = driver.findElement(By.xpath("//a[text()='Verma, Swapnil (TestEngg)']"));
		System.out.println(user.getText());
		
		user.click();
		driver.findElement(By.xpath("//input[@value='Delete This User']")).click();
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
