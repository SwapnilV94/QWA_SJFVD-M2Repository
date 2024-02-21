package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import GenericLib.BaseTest;

public class CreateNewProjectPage extends BaseClass{
	
	public CreateNewProjectPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//select[@name='customerId']")
	private WebElement customerDropdown;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement projectNameTextField;
	
	@FindBy(xpath="//input[@name='createProjectSubmit']")
	private WebElement createProjectButton;

	public WebElement getCustomerDropdown() {
		return customerDropdown;
	}

	public WebElement getProjectName() {
		return projectNameTextField;
	}

	public WebElement getCreateProjectButton() {
		return createProjectButton;
	}
	
	public void createCustomerAndProject(String customerName,WebDriver driver, String projectName) throws InterruptedException {
		CreateNewCustomerPage page = new CreateNewCustomerPage(driver);
		page.getCustomerNameTextField().sendKeys(customerName);
		page.getCreateCustomerButton().click();
		ProjectAndCustomerPage pp = new ProjectAndCustomerPage(driver);
		pp.clickOnCreateNewProjectButton();
		Select s = new Select(customerDropdown);
		customerDropdown.click();
		s.selectByVisibleText(customerName);
		projectNameTextField.sendKeys(projectName);
		createProjectButton.click();
	

    }
}