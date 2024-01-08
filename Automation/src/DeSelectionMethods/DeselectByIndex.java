package DeSelectionMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndex {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
		
		//identify multi select dropdown
		WebElement dropdown = driver.findElement(By.id("select3"));
		
		//create object of select class
		Select s = new Select(dropdown);
		
		s.selectByValue("India");
		s.selectByValue("China");
		Thread.sleep(2000);
		
		//deselect the option by using deselect value
		s.deselectByValue("India");
		s.deselectByValue("China");
	}

}
