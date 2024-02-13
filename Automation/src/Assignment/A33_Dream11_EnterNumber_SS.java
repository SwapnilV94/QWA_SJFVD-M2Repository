package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A33_Dream11_EnterNumber_SS {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.dream11.com/");
		Thread.sleep(2000);
	
	    d.switchTo().frame(0);
	    d.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("3456789345");
		Thread.sleep(1000);
		d.findElement(By.xpath("//a[text()='GET APP LINK']")).click();
		
		
	}

}
