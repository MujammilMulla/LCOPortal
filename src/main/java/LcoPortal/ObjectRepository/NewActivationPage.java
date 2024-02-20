package LcoPortal.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewActivationPage {

	@FindBy (xpath = "//input[@placeholder='Enter box number']")
	private WebElement newActivationEdt;
	
	public WebElement getNewActivationEdt()
	{
		return newActivationEdt;
	}
	
	public NewActivationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
