package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Listeners;

import GenericLib.CustomListener;

/**
 * 
 * @author Swapnil
 *
 */


public class LoginPage extends BaseClass{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
		@FindBy(name = "username")
		private WebElement usernameTextField;
		
		@FindBy(name ="pwd")
		private WebElement passwordTextField;
		
		@FindBy(id="loginButton")
		private WebElement loginButton;

		public WebElement getUsernameTextField() {
			return usernameTextField;
		}

		public WebElement getPasswordTextField() {
			return passwordTextField;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}
		
		//login into actitime
		public void loginIntoActitime (String username, String password)
		{
			usernameTextField.sendKeys(username); 
			passwordTextField.sendKeys(password);
			loginButton.click();
		}
		
		public void invalidLoginIntoActitime (String username, String password)
		{
			usernameTextField.sendKeys(username); 
			passwordTextField.sendKeys(password);
			usernameTextField.clear();
			loginButton.click();
		}
}
