package FrameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByIndex {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.dream11.com/");
		Thread.sleep(2000);
		
		//switch to frame by using index
		d.switchTo().frame(0);
		
		//enter mobile number
		d.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("1234567891");
		Thread.sleep(2000);
		d.quit();
	}

}
