package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A9_2_Flipkart_iPhonePrice {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains(@class,'Pke')]")).sendKeys("iPhone",Keys.ENTER);
		List<WebElement> allName = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	//	List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		
		for (WebElement name : allName)
		{
			String iPhone = name.getText();
			String iPhonePrice = driver.findElement(By.xpath("//div[text()='"+iPhone+"']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
			System.out.println(iPhone+" : "+iPhonePrice);
		}
		driver.quit();
	}

}
