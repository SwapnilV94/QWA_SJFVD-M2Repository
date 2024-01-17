package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByRect {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com/india");
		WebElement element =driver.findElement(By.xpath("//h5[text()='Coimbatore Restaurants']"));
	    Rectangle rect = element.getRect();
	    int x = rect.getX();
	    int y = rect.getY();
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy("+x+","+y+")");
	    Thread.sleep(2000);
	    driver.quit();
	    
	    
	    
		
	}

}
