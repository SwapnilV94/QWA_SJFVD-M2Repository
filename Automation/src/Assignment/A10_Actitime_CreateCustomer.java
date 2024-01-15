package Assignment;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A10_Actitime_CreateCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r =  new Random();
		int no = r.nextInt(1000);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://desktop-9c778ne/login.do");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.findElement(By.xpath("//a[contains(@class,'tasks')]")).click();
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Bank"+no);
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Banking Domain");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		driver.quit();
		
	}

}
