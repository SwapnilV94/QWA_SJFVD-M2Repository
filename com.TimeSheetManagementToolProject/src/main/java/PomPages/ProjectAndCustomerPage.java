package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectAndCustomerPage extends BaseClass{

	public ProjectAndCustomerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@value='Create New Customer']")
	private WebElement createNewCustomerButton;
	
	@FindBy(xpath="//input[@value='Create New Project']")
	private WebElement createNewProjectButton;
	
	@FindBy(xpath="//a[text()='All']")
	private WebElement selectAllButton;
	
	@FindBy(xpath="//input[@value='Delete Selected']")
	private WebElement deleteSelectedButton;
	
	@FindBy (id="deleteButton")
	private WebElement deleteThisCustomerButton;

	public WebElement getCreateNewCustomerButton() {
		return createNewCustomerButton;
	}

	public WebElement getCreateNewProjectButton() {
		return createNewProjectButton;
	}

	public WebElement getSelectAllButton() {
		return selectAllButton;
	}

	public WebElement getDeleteSelectedButton() {
		return deleteSelectedButton;
	}

	public WebElement getDeleteThisCustomerButton() {
		return deleteThisCustomerButton;
	}
	
	public void clickOnCreateNewCustomerButton() {
		
		createNewCustomerButton.click();
	}
	
    public void clickOnCreateNewProjectButton() {
		
		createNewProjectButton.click();
	}
    
    public void clickOnDeleteAll() {
    	
    	selectAllButton.click();
    	deleteSelectedButton.click();
    	deleteThisCustomerButton.click();
    }
}
