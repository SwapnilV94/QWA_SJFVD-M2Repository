package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A30_Flipkart_ProductTab_AddToCart {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iPhone",Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		
		Set<String> all_id = driver.getWindowHandles();
		
		for (String id : all_id)
		{
			driver.switchTo().window(id);
			if (driver.getTitle().equals("APPLE iPhone 14 ( 128 GB Storage ) Online at Best Price On Flipkart.com"))
			{
				break;
			}
		}
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
