package LcoPortal.ObjectRepository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import LcoPortal.GenericUtilities.WebDriverUtility;


public class LoginPage extends WebDriverUtility{

	@FindBy (xpath = "//input[@name='UserName']")
	private WebElement usernameEdt;
	
	@FindBy (xpath = "//input[@name='PassWord']")
	private WebElement passwordEdt;
	
	@FindBy (xpath = "//div[@class='recaptcha-checkbox-border']")
	private WebElement verificationCheckbox;

	@FindBy (xpath = "//button[text()='Sign in']")
	private WebElement loginBtn;
	
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}



	public WebElement getPasswordEdt() {
		return passwordEdt;
	}



	public WebElement getVerificationCheckbox() {
		return verificationCheckbox;
	}

	

	public WebElement getLoginBtn() {
		return loginBtn;
	}



	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void loginToApplication(WebDriver driver, String username,String password) //throws InterruptedException
	{
		usernameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		
		loginBtn.click();
	}
}
