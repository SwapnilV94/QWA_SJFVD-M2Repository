package com.SearchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//input[contains(@class,'Pke')]")).sendKeys("iPhone",Keys.ENTER);
		List<WebElement> alliPhone = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for (WebElement iPhone : alliPhone)
		{
			System.out.println(iPhone.getText());
		}
		Thread.sleep(2000);
		driver.quit();
		
	}

}
