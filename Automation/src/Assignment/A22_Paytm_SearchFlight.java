package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class A22_Paytm_SearchFlight {
	public static void main(String[] args) throws InterruptedException, IOException {
		
	    //launching browser
		WebDriver driver = new ChromeDriver();
		
		//maximizing window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//launch the application
		driver.get("https://paytm.com/");
		
		//Thread.sleep(2000);
		
		//explicit type casting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		//scroll till element
		WebElement flight = driver.findElement(By.xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']"));
		js.executeScript("arguments[0].scrollIntoView(false)", flight);
		Thread.sleep(2000);
		
		//click the element
		flight.click();
		
		//enter from source
		driver.findElement(By.id("srcCode")).click();
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.id("text-box")).sendKeys("PNQ");
		driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
		
		//enter to source
		driver.findElement(By.id("destCode")).click();
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.id("text-box")).sendKeys("Jabalpur");
		driver.findElement(By.xpath("//div[text()='Jabalpur, Madhya Pradesh, India']")).click();
		
		//click on departure date
		driver.findElement(By.id("departureDate")).click();
		driver.findElement(By.xpath("(//div[text()='23'])[1]")).click();
		
		// click on traveler class
		driver.findElement(By.xpath("//span[text()='1 Traveller']")).click();
		
		//select 4 adults
		for (int i = 0; i < 3; i++) {
		driver.findElement(By.xpath("(//img[@alt='add-icon'])[1]")).click();
		Thread.sleep(2000);
		}
		
		// click on flight search button
	    driver.findElement(By.id("flightSearch")).click();
	    
	    //all flight elements in console
	 	List<WebElement> allFlights = driver.findElements(By.xpath("//div[@class='_5Cbbf']"));
	 	for (WebElement flights : allFlights) {
		System.out.println(flights.getText());
		System.out.println("________________________________________");
	 	}
	 	
	 	//take screenshot
	 	TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/flights.png");
		Files.copy(src, dest);
		
	}

}
