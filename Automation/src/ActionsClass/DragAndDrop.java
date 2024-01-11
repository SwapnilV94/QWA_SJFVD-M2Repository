package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		driver.get("https://demoapps.qspiders.com/dragDrop/dragToCorrect?sublist=1");
		WebElement drag1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement drop1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
				
	    Actions act = new Actions(driver);
	    act.dragAndDrop(drag1, drop1).perform();
	    
	    Thread.sleep(2000);
	    driver.quit();
	    
	    
	}

}
