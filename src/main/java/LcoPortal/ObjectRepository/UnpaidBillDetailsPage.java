package LcoPortal.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnpaidBillDetailsPage {

	
	@FindBy (xpath = "//button[text()='Submit']")
	private WebElement submitButton;
	
	@FindBy (xpath = "(//div[@class='select__input-container css-19bb58m'])[1]")
	private WebElement filterDetails;
	
	public WebElement getSubmitButton()
	{
		return submitButton;
	}
	
	public WebElement getFilterDetails() {
		return filterDetails;
	}

	public UnpaidBillDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
