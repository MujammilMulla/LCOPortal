package LcoPortal.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PairUnpairPage {

	@FindBy (xpath = "(//input[@name='serialNumber'])[1]")
	private WebElement serialNumberEdt;
	
	@FindBy (xpath = "//input[@name='vcNumber']")
	private WebElement vcNumberEdt;
	
	@FindBy (xpath = "(//button[text()='Submit'])[1]")
	private WebElement pairBtn;
	
	@FindBy (xpath = "(//input[@name='serialNumber'])[2]")
	private WebElement serialNumberUnpairEdt;
	
	@FindBy (xpath = "(//button[text()='Submit'])[2]")
	private WebElement unpairBtn;

	public WebElement getSerialNumberEdt() {
		return serialNumberEdt;
	}

	public WebElement getVcNumberEdt() {
		return vcNumberEdt;
	}

	public WebElement getPairBtn() {
		return pairBtn;
	}

	public WebElement getSerialNumberUnpairEdt() {
		return serialNumberUnpairEdt;
	}

	public WebElement getUnpairBtn() {
		return unpairBtn;
	}
	
	public PairUnpairPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void pair(String serialNumber, String vcNumber)
	{
		
		getSerialNumberEdt().sendKeys(serialNumber);
		getVcNumberEdt().sendKeys(vcNumber);
		getPairBtn().click();
	}
	
	public void unpair(String serialNumber)
	{
		getSerialNumberUnpairEdt().sendKeys(serialNumber);
		getUnpairBtn().click();
	}
}
