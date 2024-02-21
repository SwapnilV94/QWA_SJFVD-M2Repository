package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[@class='content users']")
	private WebElement userLink;
	
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement taskLink;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutButton;

	public WebElement getUserLink() {
		return userLink;
	}

	public WebElement getTaskLink() {
		return taskLink;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	public void clickOnUserLink() {
		
		userLink.click();
	}
	
    public void clickOnTaskLink() {
		
		taskLink.click();
	}
    
    public void clickOnLogoutButton() {
		
		logoutButton.click();
	}
	
}
