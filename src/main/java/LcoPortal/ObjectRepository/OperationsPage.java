package LcoPortal.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LcoPortal.GenericUtilities.WebDriverUtility;

public class OperationsPage extends WebDriverUtility{

	@FindBy (xpath = "//span[text()='Bulk Payment']")
	private WebElement bulkPayment;
	
	@FindBy (xpath = "//a[@href='/operations/360-view']")
	private WebElement globalSearch360;
	
	@FindBy (xpath = "//span[text()='Pair / Unpair']")
	private WebElement pairUnpair;
	
	public WebElement getBulkPayment() {
		return bulkPayment;
	}

	public OperationsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getGlobalSearch360() {
		return globalSearch360;
	}

	public WebElement getPairUnpair() {
		return pairUnpair;
	}
	
	
}
