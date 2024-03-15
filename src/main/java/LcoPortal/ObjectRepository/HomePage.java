package LcoPortal.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy (xpath = "//img[@alt='avatarImg']")
	private WebElement userImg;
	
	@FindBy (xpath = "//span[text()='Logout']")
	private WebElement logoutBtn;
	
	@FindBy (xpath = "//span[text()='New Activation']")
	private WebElement newActivation;
	
	@FindBy (xpath = "//span[text()='Reports']")
	private WebElement reports;

	@FindBy (xpath = "//span[text()='Operations']")
	private WebElement operations;
	
	public WebElement getUserImg() {
		return userImg;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	public WebElement getOperations() {
		return operations;
	}

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getNewActivation() {
		return newActivation;
	}
	
	public WebElement getReports() {
		return reports;
	}

	public void logout()
	{
		userImg.click();
		logoutBtn.click();
	}
}
