package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewUserPage extends BaseClass{

	public CreateNewUserPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement usTextfield;
	
	@FindBy(xpath="//input[@name='passwordText']")
	private WebElement pwdTextfield;
	
	@FindBy(xpath="//input[@name='passwordTextRetype']")
	private WebElement reTypepwdTextfield;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstNameTextfield;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastNameTextfield;
	
	@FindBy(xpath="//input[@value='   Create User   ']")
	private WebElement createUserButton;

	public WebElement getUsTextfield() {
		return usTextfield;
	}

	public WebElement getPwdTextfield() {
		return pwdTextfield;
	}

	public WebElement getReTypepwdTextfield() {
		return reTypepwdTextfield;
	}

	public WebElement getFirstNameTextfield() {
		return firstNameTextfield;
	}

	public WebElement getLastNameTextfield() {
		return lastNameTextfield;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}
	
	public void createUser(String username ,String password, String firstName,String lastName) throws InterruptedException {
		
		usTextfield.sendKeys(username);
		Thread.sleep(2000);
		pwdTextfield.sendKeys(password);
		Thread.sleep(2000);
		reTypepwdTextfield.sendKeys(password);
		
		firstNameTextfield.sendKeys(firstName);
		
		lastNameTextfield.sendKeys(lastName);
		createUserButton.click();
	}
	
	//create one more new  page create new project and then create method understood
	
	//ok do it if you are not able to do just ping me
	// done
	

}
