package LcoPortal.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPage {

	@FindBy (xpath = "//span[text()='Total Unassigned STB']")
	private WebElement totalUnassignedSTBreport;
	
	@FindBy (xpath = "//span[text()='Unpaid Bill Details']")
	private WebElement unpaidBillDetails;
	
	public WebElement getTotalCustomerReport() {
		return totalCustomerReport;
	}

	@FindBy (xpath = "//span[text()='Invoice Summary']")
	private WebElement invoiceSummary;
	
	@FindBy (xpath = "//span[text()='Total Customer']")
	private WebElement totalCustomerReport;
	
	public WebElement getTotalUnassignedSTBreport()
	{
		return totalUnassignedSTBreport;
	}
	
	public WebElement getUnpaidBillDetails() {
		return unpaidBillDetails;
	}

	
	public WebElement getInvoiceSummary() {
		return invoiceSummary;
	}

	public ReportsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
