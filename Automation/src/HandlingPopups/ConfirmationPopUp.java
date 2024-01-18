package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/alert/confirm?sublist=1");
		Thread.sleep(2000);
		driver.findElement(By.id("buttonAlert5")).click();
		
		//handling confirmation pop-up
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
