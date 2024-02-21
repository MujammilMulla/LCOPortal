package LcoPortal.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewActivationPage {

	@FindBy (xpath = "//input[@placeholder='Enter box number']")
	private WebElement newActivationEdt;
	
	@FindBy (xpath = "//button[text()='Submit']")
	private WebElement submitBtn;
	
	@FindBy (xpath = "//input[@name='firstName']")
	private WebElement firstNameEdt;
	
	@FindBy (xpath = "//input[@name='lastName']")
	private WebElement lastNameEdt;
	
	@FindBy (xpath = "//input[@name='address']")
	private WebElement billingAddressEdt;
	
	@FindBy (xpath = "//input[@name='installationAddress']")
	private WebElement installationAddressEdt;
	
	@FindBy (xpath = "//input[@name='pin']")
	private WebElement pincodeEdt;
	
	@FindBy (xpath = "//input[@name='mobile']")
	private WebElement mobileEdt;
	
	
	public WebElement getNewActivationEdt()
	{
		return newActivationEdt;
	}
	
	public WebElement getSubmitBtn() {
		return submitBtn;
	}



	public NewActivationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
