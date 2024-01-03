package com.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/india");
	String title =driver.getTitle();
	String url =driver.getCurrentUrl();
	System.out.println("Title : "+title);
	System.out.println("Current url : "+url);
	Thread.sleep(2000);
	driver.quit();
}
}
