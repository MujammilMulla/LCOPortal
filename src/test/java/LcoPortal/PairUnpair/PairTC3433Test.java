package LcoPortal.PairUnpair;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import LcoPortal.GenericUtilities.BaseClass;
import LcoPortal.ObjectRepository.HomePage;
import LcoPortal.ObjectRepository.OperationsPage;
import LcoPortal.ObjectRepository.PairUnpairPage;
@Listeners(LcoPortal.GenericUtilities.ListenersImplementation.class)
public class PairTC3433Test extends BaseClass{

	//Verify pairing without entering VC number
	@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class, dependsOnMethods = "unPairTC3432Test")
	public void pairTC3433Test()
	{
		String serialNumber="abcd121234567890";
		HomePage hp=new HomePage(driver);
		hp.getOperations().click();
		OperationsPage op=new OperationsPage(driver);
		mouseHover(driver, op.getPairUnpair());
		PairUnpairPage pp=new PairUnpairPage(driver);
		pp.getSerialNumberEdt().sendKeys(serialNumber);
		pp.getPairBtn().click();
		
		String actual=driver.findElement(By.xpath("//div[text()='VC number must be at least 10 characters']")).getText();
		String expected="VC number must be at least 10 characters";
		
		assertEquals(actual, expected);
	}
	
}
