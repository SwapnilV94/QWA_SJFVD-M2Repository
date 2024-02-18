package BatchExecution;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant{
	static WebDriver driver;
	
	@BeforeClass
	public void setup() throws IOException {
		Flib lib = new Flib();
		String browser = lib.getDataFromProperty(PROPPATH, "Browser");
		String url = lib.getDataFromProperty(PROPPATH, "Url");
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}else if (browser.equals("edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
			else {
				System.out.println("Invalid Browser");
			}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESECOND));
		driver.get(url);
		}
	
	/*@BeforeMethod
	public void login() throws IOException
	{
		BaseTest test = new BaseTest();
	    test.setup();
	
	Flib lib = new Flib();
	String username = lib.getDataFromProperty(PROPPATH, "Username");
	String password = lib.getDataFromProperty(PROPPATH, "Password");
	
	test.driver.findElement(By.name("username")).sendKeys(username);
	test.driver.findElement(By.name("pwd")).sendKeys(password);
	test.driver.findElement(By.id("loginButton")).click();
}
*/
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	@AfterMethod(enabled = false)
	public void logout()
	{
		driver.findElement(By.className("logout")).click();
	}
	
	}


