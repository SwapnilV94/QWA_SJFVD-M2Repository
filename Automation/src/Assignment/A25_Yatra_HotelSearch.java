package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class A25_Yatra_HotelSearch {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
				
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.yatra.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Hotels']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='BE_hotel_destination']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//div[@class='viewport']/descendant::li[text()='P'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='viewport']/descendant::li[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='hotel_checkin_date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@title='Sunday, 21 January 2024']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='hotel_checkout_date']")).click();
		driver.findElement(By.xpath("//td[@title='Tuesday, 23 January 2024']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='txt-ellipses hotel_passengerBox travellerPaxBox']")).click();
		
		for (int i = 0; i<=2 ;i++)
		{
			driver.findElement(By.xpath("(//span[@class='ddSpinnerPlus'])[1]")).click();
			Thread.sleep(1000);
		}
		
	//	for (int i = 0; i<=1 ;i++)
	//	{
	//		driver.findElement(By.xpath("(//span[@class='ddSpinnerPlus'])[2]")).click();
	//		Thread.sleep(1000);
	//	}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Search Hotels']")).click();
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/yatraSearch.png");
		Files.copy(src, dest);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
