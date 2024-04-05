package LcoPortal.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TotalCustomerReportPage {
	
	@FindBy (xpath = "//button[text()='Submit']")
	private WebElement submitBtn;

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public TotalCustomerReportPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

}
