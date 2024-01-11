package KeyBoardStrokeHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysEnum {
	
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//launch actitime application
		driver.get("http://desktop-9c778ne/login.do");
		//identify username textfield & use keys Enum
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
		Thread.sleep(2000);
		//close all the browser
		driver.quit();
	}

}
