package LcoPortal.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPage {

	@FindBy (xpath = "//span[text()='Total Unassigned STB']")
	private WebElement totalUnassignedSTBreport;
	
	public WebElement getTotalUnassignedSTBreport()
	{
		return totalUnassignedSTBreport;
	}
	
	public ReportsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
