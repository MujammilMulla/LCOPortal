package LcoPortal.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoiceSummaryPage {

	@FindBy (xpath = "//button[text()='Submit']")
	private WebElement submitBtn;
	
	public InvoiceSummaryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	
}
