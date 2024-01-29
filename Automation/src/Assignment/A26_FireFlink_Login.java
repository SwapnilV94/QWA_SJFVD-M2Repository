package Assignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A26_FireFlink_Login {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//	driver.get("https://www.fireflink.com/");
		driver.get("https://app.fireflink.com/signin");
		Thread.sleep(10000);
	//	driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		driver.findElement(By.name("emailId"));
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		driver.findElement(By.xpath("//button[text()='Sign in']"));
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
