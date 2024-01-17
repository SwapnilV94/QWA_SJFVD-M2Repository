package SS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddToCart_And_Remove {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(6000);
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("kiranbhivade@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password@123");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		Actions act = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("//a[@id='men']"));
		act.moveToElement(men).perform();
		Thread.sleep(2000);
		WebElement tshirt = driver.findElement(By.xpath("//a[text()='T-shirts']"));
		act.moveToElement(tshirt).perform();
		Thread.sleep(2000);
		tshirt.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='add to cart'])[2]")).click();
		driver.findElement(By.xpath("//a[@name='cart']")).click();
		
		
	}

}
