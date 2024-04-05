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
public class PairTC3434Test extends BaseClass{


	//Verify pairing without entering serial number
	@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class, dependsOnMethods = "pairTC3433Test")
	public void pairTC3434Test()
	{
		
		String vcNumber="abcd121234567890";
		HomePage hp=new HomePage(driver);
		hp.getOperations().click();
		OperationsPage op=new OperationsPage(driver);
		mouseHover(driver, op.getPairUnpair());
		PairUnpairPage pp=new PairUnpairPage(driver);
		pp.getVcNumberEdt().sendKeys(vcNumber);
		pp.getPairBtn().click();
		
		String actual=driver.findElement(By.xpath("//div[text()='Serial number must be at least 10 characters']")).getText();
		String expected="Serial number must be at least 10 characters";
		
		assertEquals(actual, expected);
		
	}
	
}
