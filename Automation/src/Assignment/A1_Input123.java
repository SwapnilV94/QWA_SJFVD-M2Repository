package Assignment;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A1_Input123 {
	static WebDriver driver ;
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		if (number==1)
		{
			driver = new ChromeDriver();
		}
		else if (number==2)
		{
			driver = new FirefoxDriver();
		}
		else if (number==3)
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Invalid Browser");
		}
		
		driver.quit();
	}

}
