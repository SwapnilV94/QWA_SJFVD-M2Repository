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

import com.google.common.io.Files;

public class A21_NetflixSS_PageAndElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@role='button']")).click();
		Thread.sleep(2000);
		//screenshot of web page
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/netflix.png");
		Files.copy(src, dest);
		//screenshot of web element
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		File src1 = signin.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./screenshot/signin.png");
		Files.copy(src1, dest1);
		
		Thread.sleep(2000);
		driver.quit();
	}
}
