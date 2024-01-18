package Assignment;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A24_Qspiders_AuthenticationLink {
	public static void main(String[] args) throws InterruptedException, AWTException  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		Thread.sleep(2000);
		Robot r = new Robot();
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}

}
