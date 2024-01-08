package com.Assignment;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A15_MytraMouseOver {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		WebElement women = driver.findElement(By.xpath("//a[@data-group='women']"));
		Actions act = new Actions(driver);
		act.moveToElement(women).perform();
		Thread.sleep(2000);
		
		driver.quit();
			
			
		}
	}
