package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment11 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='FormValidation']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='requiredfield']")).sendKeys("Type something");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password");
		driver.findElement(By.xpath("//input[@name='confirmpass']")).sendKeys("Password");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("swapnil@gmail.com");
		driver.findElement(By.xpath("//input[@name='url']")).sendKeys("https://demoapps.qspiders.com/formValidation?sublist=0");
		driver.findElement(By.xpath("//input[@name='digits']")).sendKeys("8269");
		driver.findElement(By.xpath("//input[@name='number']")).sendKeys("8269265904");
		driver.findElement(By.xpath("//input[@name='alphanum']")).sendKeys("swapnil94");
		driver.findElement(By.xpath("//input[@name='minLength']")).sendKeys("swapRV");
		driver.findElement(By.xpath("//input[@name='maxLength']")).sendKeys("swapRV");
		driver.findElement(By.xpath("//input[@name='rangeLength']")).sendKeys("swapnil");
		driver.findElement(By.xpath("//input[@name='minValue']")).sendKeys("6");
		driver.findElement(By.xpath("//input[@name='maxValue']")).sendKeys("6");
		driver.findElement(By.xpath("//input[@name='rangeValue']")).sendKeys("50");
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
		submitButton.submit();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
