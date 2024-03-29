package LcoPortal.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LcoPortal.GenericUtilities.WebDriverUtility;

public class NewActivationPage extends WebDriverUtility {

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
	
	@FindBy (xpath = "(//div[@class='select__input-container css-19bb58m'])[1]")
	private WebElement customerTypeDropdown;
	
	@FindBy (xpath = "//div[@id='react-select-2-option-0']")
	private WebElement customerTypeDropdownValues;
	
	
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]")
	private WebElement groupTypeDropdown;
	
	@FindBy (xpath = "//div[@id='react-select-3-listbox']")
	private WebElement groupTypeDropdownValues;
	
	@FindBy (xpath = "(//div[@class='select__value-container css-hlgwow'])[3]")
	private WebElement distictTypeDropdown;
	
	
	@FindBy (xpath = "(//div[@class='select__value-container css-hlgwow'])[4]")
	private WebElement cityTypeDropdown;
	
	@FindBy (xpath = "(//div[@class='select__value-container css-hlgwow'])[5]")
	private WebElement idTypeDropdown;
	
	public WebElement getNewActivationEdt()
	{
		return newActivationEdt;
	}
	
	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	
    

	public WebElement getGroupTypeDropdownValues() {
		return groupTypeDropdownValues;
	}

	public WebElement getFirstNameEdt() {
		return firstNameEdt;
	}

	public WebElement getLastNameEdt() {
		return lastNameEdt;
	}

	public WebElement getBillingAddressEdt() {
		return billingAddressEdt;
	}

	public WebElement getInstallationAddressEdt() {
		return installationAddressEdt;
	}

	public WebElement getPincodeEdt() {
		return pincodeEdt;
	}

	public WebElement getMobileEdt() {
		return mobileEdt;
	}

	public WebElement getCustomerTypeDropdown() {
		return customerTypeDropdown;
	}

	public NewActivationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCustomerTypeDropdownValues() {
		return customerTypeDropdownValues;
	}

	public WebElement getGroupTypeDropdown() {
		return groupTypeDropdown;
	}

	public WebElement getDistictTypeDropdown() {
		return distictTypeDropdown;
	}

	public WebElement getCityTypeDropdown() {
		return cityTypeDropdown;
	}

	public WebElement getIdTypeDropdown() {
		return idTypeDropdown;
	}

	public void newActivation(WebDriver driver) throws Throwable
	{
		getNewActivationEdt().sendKeys("abcd121234567890");
		getSubmitBtn().click();
		waitForPageLoad(driver);
		
		
		/*
		customerTypeDropdownValues.click();
		getGroupTypeDropdown().click();
		waitForPageLoad(driver);
		getGroupTypeDropdownValues().click();
		*/
		
	}
}
