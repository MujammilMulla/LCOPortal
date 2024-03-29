package LcoPortal.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LcoPortal.GenericUtilities.WebDriverUtility;

public class GlobalSearch360Page extends WebDriverUtility{

	@FindBy (id = "react-select-11-placeholder")
	private WebElement searchCriteriaDropdown;

	@FindBy (id = "react-select-11-option-0")
	private WebElement serialNumberSearch;
	
	public WebElement getSearchCriteriaDropdown() {
		return searchCriteriaDropdown;
	}
	
	public WebElement getSerialNumberSearch() {
		return serialNumberSearch;
	}

	public GlobalSearch360Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void globalSearch()
	{
		
		handleDropdown("Serial Number", getSearchCriteriaDropdown());
		
	}
}
