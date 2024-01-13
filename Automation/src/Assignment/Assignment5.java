package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("adrija_9497");
		driver.findElement(By.name("password")).sendKeys("Nik_nono73");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
	}

}
