package LcoPortal.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OperationsPage {

	@FindBy (xpath = "//span[text()='Bulk Payment']")
	private WebElement bulkPayment;

	public WebElement getBulkPayment() {
		return bulkPayment;
	}

	public OperationsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
}
