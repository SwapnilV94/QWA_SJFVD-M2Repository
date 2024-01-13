package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9_1 {
	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//input[contains(@class,'Pke')]")).sendKeys("iPhone",Keys.ENTER);
		List<WebElement> allName = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		
		for (int i=0 ; i< allName.size() ; i++)
		{
			String name	= allName.get(i).getText();
			for (int j=i ; j<=i; j++)
			{
				String price = allPrice.get(j).getText();
				System.out.println(name+ " : "+ price);
			}
		}
		//Thread.sleep(4000);
		
		driver.quit();
	}

}
