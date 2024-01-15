package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A12_Qspider_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	
		//Identify the dropdown
		WebElement dropdown = driver.findElement(By.id("select3"));
		
		//Create object of select class
		Select s = new Select (dropdown);
		
		//Use select by visible text
		s.selectByVisibleText("Canada");
		Thread.sleep(2000);
		s.selectByVisibleText("Germany");
		Thread.sleep(2000);
		s.selectByVisibleText("Poland");
		Thread.sleep(2000);
		s.selectByVisibleText("China");
		Thread.sleep(2000);
		s.selectByVisibleText("United Kingdom");
		Thread.sleep(2000);
		s.selectByVisibleText("India");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
