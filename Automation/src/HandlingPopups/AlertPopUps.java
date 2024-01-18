package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUps {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/alert?sublist=0");
		driver.findElement(By.id("buttonAlert2")).click();
		
		//handling alert pop-up
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
