package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A34_Google_AllFrames {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		//click on google apps
		d.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
			
		//switch to frame by using index
		//d.switchTo().frame(1);
				
		//switch to frame by using name attribute value
		d.switchTo().frame("app");
				
		//click on google maps
		d.findElement(By.xpath("//span[text()='Maps']")).click();
		
		Thread.sleep(2000);
		d.quit();
	}

}
