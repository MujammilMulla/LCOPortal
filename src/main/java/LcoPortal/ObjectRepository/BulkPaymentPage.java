package LcoPortal.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LcoPortal.GenericUtilities.WebDriverUtility;

public class BulkPaymentPage extends WebDriverUtility{

	//button[text()='Submit']
	@FindBy (xpath = "//button[text()='Submit']")
	private WebElement submitBtn;
	
	@FindBy (xpath = "(//span[@class='asc __rdt_custom_sort_icon__'])[1]")
	private WebElement sortSerialNumber;
	
	@FindBy (xpath = "(//input[@style='font-size: 18px; padding: 0px; margin-top: 1px; vertical-align: middle; position: relative; cursor: pointer;'])[1]")
	private WebElement checkbox;
	
	@FindBy (xpath = "//div[@class='d-flex align-items-center justify-content-end mt-1 mb-2 col']/button[text()='Submit']")
	private WebElement paymentBtn;

	@FindBy (xpath = "//div[text()='Payment successfull.']")
	private WebElement paymentSuccessfulPopup;

	@FindBy (xpath = "//div[@class='select__control select__control--is-focused select__control--menu-is-open css-y6zvtp-control']//div[@class='select__value-container css-hlgwow']")
	private WebElement searchCriteriaDropdown;
	
	@FindBy (xpath = "//div[@id='react-select-46-option-0']")
	private WebElement serialNumber;
	
	@FindBy (xpath = "//input[@name='filterDataTable']")
	private WebElement searchEdt;
	
	public WebElement getSubmitBtn() {
		return submitBtn;
	}


	public WebElement getSortSerialNumber() {
		return sortSerialNumber;
	}


	public WebElement getCheckbox() {
		return checkbox;
	}


	public WebElement getPaymentBtn() {
		return paymentBtn;
	}
	
	public WebElement getPaymentSuccessfulPopup() {
		return paymentSuccessfulPopup;
	}


	public BulkPaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getSearchCriteriaDropdown() {
		return searchCriteriaDropdown;
	}


	public WebElement getSerialNumber() {
		return serialNumber;
	}


	public WebElement getSearchEdt() {
		return searchEdt;
	}
	
	public void bulkPayment(WebDriver driver, String serialNumber)
	{
		getSubmitBtn().click();
		waitForPageLoad(driver);
		
		getSearchEdt().sendKeys(serialNumber);
		getCheckbox().click();
		getPaymentBtn().click();
	}
}
