package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://demoapps.qspiders.com/button/buttonDoubleClick?sublist=2");
		Thread.sleep(4000);
		Actions act = new Actions(driver);
		act.doubleClick(driver.findElement(By.id("btn20"))).perform();
		Thread.sleep(3000);
		act.doubleClick(driver.findElement(By.id("btn21"))).perform();
		Thread.sleep(3000);
		driver.quit();
	}
}
