package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A8_AirVistaraTrip {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.airvistara.com/in/en/travel-information/vistara-exclusives/vistara-direct?gclid=CjwKCAiA-bmsBhAGEiwAoaQNmiQi-F0tduAhyW_wvjQ3gi2lZQ0tJ1bpI1V6kbW2Kut-TC4NWibEqRoCtU4QAvD_BwE&utm_source=google&utm_medium=Search&utm_campaign=PMX_Brand_Dom_Search_Nov_22&ef_id=CjwKCAiA-bmsBhAGEiwAoaQNmiQi-F0tduAhyW_wvjQ3gi2lZQ0tJ1bpI1V6kbW2Kut-TC4NWibEqRoCtU4QAvD_BwE:G:s&s_kwcid=AL!596!3!659805002549!p!!g!!vistara%2520online%2520booking&s_kwcid=AL!596!3!659805002549!p!!g!!vistara+online+booking&gad_source=1");
	    driver.findElement(By.xpath("//button[contains(text(), 'Accept All')]")).click();
		driver.findElement(By.xpath("//div[@id='oneway-trip-container']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Select Departure City']")).sendKeys("Pune",Keys.ENTER);
	    driver.findElement(By.xpath("//input[@placeholder='Select Arrival City']")).sendKeys("Delhi",Keys.ENTER);
	    driver.findElement(By.xpath("//input[@id='departCalendar']")).click();
	    driver.findElement(By.xpath("//div[@id='nextYr']")).click();
	    driver.findElement(By.xpath("(//td[@class='  everymundo'])[4]")).click();
	    driver.findElement(By.xpath("//button[@id='book-flight-widget']")).click();
	    driver.quit();
	    
	    
	}

}
