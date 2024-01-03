package com.SearchContext;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//input[contains(@class,'Pke')]")).sendKeys("iPhone",Keys.ENTER);
		WebElement element = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
		element.click();
		Thread.sleep(3000);
		driver.quit();
	}

}
