package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Way1 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.apple.com/in/iphone/");
		//explicit type casting
		TakesScreenshot ts = (TakesScreenshot) driver;
		//to use getScreenshot method
		File src = ts.getScreenshotAs(OutputType.FILE);
		//create a new file and pass the path where you want to store the ss
		File desc = new File("./screenshot/iphone.png");
		//copy from scr to desc
		Files.copy(src, desc);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
