package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		
	PageFactory.initElements(driver, this);
	
	}
	@FindBy(name="username")
	private WebElement usernameTextField;
	
	@FindBy(name="pwd")
	private WebElement passwordTextField;
	
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement loggedInCheckbox;

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getLoggedInCheckbox() {
		return loggedInCheckbox;
	}
	
	//pom utilization
	
	public void loginIntoActitime(String username , String password ) {
	
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loggedInCheckbox.click();
		loginButton.click();	
		
	}
	
	public void InvalidLoginIntoActitime(String username , String password) {
	
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();	
	}
	}

	
	
