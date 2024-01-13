package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A19_RobotClass_GoogleInspect { 
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		Actions act = new Actions(driver);
		
		act.contextClick().perform();
		Robot r = new Robot();
		
		for (int i=0 ;i<=9;i++)
		{
			
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			r.keyRelease(KeyEvent.VK_DOWN);
		
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
