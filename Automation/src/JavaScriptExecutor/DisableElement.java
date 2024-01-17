package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/?scenario=1");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		js.executeScript("document.getElementById('name').value='Swapnil'");
		
		Thread.sleep(2000);
		js.executeScript("document.getElementById('email').value='swapnil@gmail.com'");
		
		Thread.sleep(2000);
		js.executeScript("document.getElementById('password').value='Swapnil'");
		
		Thread.sleep(2000);
		driver.quit();


		

	}

}
