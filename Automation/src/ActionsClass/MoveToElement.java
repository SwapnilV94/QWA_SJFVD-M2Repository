package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.flipkart.com/");
		// driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		 WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		 Actions act = new Actions(driver);
		 act.moveToElement(fashion).perform();
	}

}
