package com.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4b3e4wrxds_b&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=617721280315&hvpos=&hvnetw=g&hvrand=3036435263865957106&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301536&hvtargid=kwd-311187680635&hydadcr=5841_2362028&gclid=EAIaIQobChMI_ZqO3MO7gwMV0KRmAh3mSAGBEAAYASAAEgI1Y_D_BwE");
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.quit();
	}

}
