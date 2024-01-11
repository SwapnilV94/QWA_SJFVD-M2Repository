package com.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A17_QspiderDragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/dragDrop/dragToCorrect?sublist=1");
		Thread.sleep(3000);
		WebElement drag1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement drag2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement drop1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement drag3 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement drag4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
        WebElement drop2 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));			
	    Actions act = new Actions(driver);
	    act.dragAndDrop(drag1, drop1).perform();
	    Thread.sleep(2000);
	    act.dragAndDrop(drag2, drop1).perform();
	    Thread.sleep(2000);
	    act.dragAndDrop(drag3, drop2).perform();
	    Thread.sleep(2000);
	    act.dragAndDrop(drag4, drop2).perform();
	    
	    Thread.sleep(2000);
	    driver.quit();
	    
	}

}
