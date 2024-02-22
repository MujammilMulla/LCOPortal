package LcoPortal.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BulkPaymentPage {

	//button[text()='Submit']
	@FindBy (xpath = "//button[text()='Submit']")
	private WebElement submitBtn;
	
	@FindBy (xpath = "(//span[@class='asc __rdt_custom_sort_icon__'])[1]")
	private WebElement sortSerialNumber;
	
	@FindBy (xpath = "(//input[@style='font-size: 18px; padding: 0px; margin-top: 1px; vertical-align: middle; position: relative; cursor: pointer;'])[1]")
	private WebElement checkbox;
	
	
	@FindBy (xpath = "//div[@class='d-flex align-items-center justify-content-end mt-1 mb-2 col']/button[text()='Submit']")
	private WebElement paymentBtn;


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


	public BulkPaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
}
