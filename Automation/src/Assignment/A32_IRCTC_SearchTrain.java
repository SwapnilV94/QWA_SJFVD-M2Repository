package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class A32_IRCTC_SearchTrain {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");

		WebDriver d = new ChromeDriver(opt);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		d.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("Pune");
		d.findElement(By.xpath("//span[text()=' PUNE JN - PUNE ']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("Jabalpur");
		d.findElement(By.xpath("(//strong[text()='(JABALPUR)'])[1]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		d.findElement(By.xpath("//a[text()='31']")).click();

		Thread.sleep(1000);
		d.findElement(By.id("journeyClass")).click();
		d.findElement(By.xpath("//span[text()='Sleeper (SL)']")).click();
		Thread.sleep(1000);
		d.findElement(By.id("journeyQuota")).click();
		d.findElement(By.xpath("//li[@aria-label='LADIES']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[text()='Search']")).click();
		Thread.sleep(1000);
		TakesScreenshot ts = (TakesScreenshot)d;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/TrainSearch.png");
		Files.copy(src, dest);
		Thread.sleep(2000);
		d.quit();		
		
;
		
		
	}

}
