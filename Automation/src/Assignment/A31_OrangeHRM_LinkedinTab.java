package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A31_OrangeHRM_LinkedinTab {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		//JavascriptExecutor js = (JavascriptExecutor)d;
		//WebElement scrollTill = d.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']"));
		//js.executeScript("arguments[0].scrollIntoView(true)",scrollTill);
		Thread.sleep(2000);
		
		
		d.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']")).click();
		d.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']")).click();
		d.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
		d.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']")).click();
		
		
		
		Thread.sleep(2000);
		Set<String> all_id = d.getWindowHandles();
		for(String id:all_id)
		{
			d.switchTo().window(id);
			if(d.getCurrentUrl().equals("https://www.linkedin.com/company/orangehrm"))
					{
				       System.out.println(d.getCurrentUrl());
				       break;
					}
			else
			{
				d.close();
				Thread.sleep(1000);
			}
		}
		
	}

}
