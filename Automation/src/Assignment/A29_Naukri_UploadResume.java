package Assignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A29_Naukri_UploadResume {
	public static void main(String[] args) throws InterruptedException, IOException {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.naukri.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='What is your name?']")).sendKeys("Kanchachina");
	driver.findElement(By.xpath("//input[@placeholder='Tell us your Email ID']")).sendKeys("Kancha94@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Create a password for your account']")).sendKeys("Kancha@123");
	driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("7003898567");
	driver.findElement(By.xpath("//div[@data-val='fresher']")).click();
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement scrollTill = driver.findElement(By.xpath("//input[@name='currentCity']"));
	js.executeScript("arguments[0].scrollIntoView(true)",scrollTill);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='currentCity']")).sendKeys("Pune");
	driver.findElement(By.xpath("//li[@title='Pune, Maharashtra']")).click();
	
	Runtime.getRuntime().exec("./AutoIT/ResumeUpload_Naukri.exe");
	driver.findElement(By.xpath("(//i[@class='ico resman-icon resman-icon-check-box'])[2]")).click();
	driver.findElement(By.xpath("//button[text()='Register now']")).click();
	Thread.sleep(2000);
	driver.quit();
	
	}

}
