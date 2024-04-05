package LcoPortal.PairUnpair;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import LcoPortal.GenericUtilities.BaseClass;
import LcoPortal.ObjectRepository.HomePage;
import LcoPortal.ObjectRepository.OperationsPage;
import LcoPortal.ObjectRepository.PairUnpairPage;
@Listeners(LcoPortal.GenericUtilities.ListenersImplementation.class)
public class UnPairTC3431Test extends BaseClass{

	//Verify Unpairing of existing serial number with another LCO
	@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class, dependsOnMethods = "unPairTC3430Test")
	public void unPairTC3431Test()
	{
		
		String serialNumber="abcd254234567890";
		HomePage hp=new HomePage(driver);
		hp.getOperations().click();
		OperationsPage op=new OperationsPage(driver);
		mouseHover(driver, op.getPairUnpair());
		PairUnpairPage pp=new PairUnpairPage(driver);
		pp.unpair(serialNumber);
		/*
		String actual=driver.findElement(By.xpath("//div[text()='Selected Serial Number not under this LCO']")).getText();
		String expected="Selected Serial Number not under this LCO";
		
		assertEquals(actual, expected); */
	}
}
