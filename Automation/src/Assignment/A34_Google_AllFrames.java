package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A34_Google_AllFrames {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.google.co.in/");
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[text()='Stay signed out']")).click();
		d.switchTo().frame("app");
		d.findElement(By.xpath("//a[@href='https://www.google.co.in/intl/en/about/products']")).click();
		d.findElement(By.xpath("//span[text()='Maps']")).click();
	}

}
