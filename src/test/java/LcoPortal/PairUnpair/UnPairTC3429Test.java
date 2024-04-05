package LcoPortal.PairUnpair;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import LcoPortal.GenericUtilities.BaseClass;
import LcoPortal.ObjectRepository.HomePage;
import LcoPortal.ObjectRepository.OperationsPage;
import LcoPortal.ObjectRepository.PairUnpairPage;
@Listeners(LcoPortal.GenericUtilities.ListenersImplementation.class)
public class UnPairTC3429Test extends BaseClass{

	//Verify unpairing of already unpaired boxes
	@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class, dependsOnMethods = "unPairTC3428Test")
	public void unPairTC3429Test()
	{
		String serialNumber="abcd121234567890";
		
		HomePage hp=new HomePage(driver);
		hp.getOperations().click();
		OperationsPage op=new OperationsPage(driver);
		mouseHover(driver, op.getPairUnpair());
		PairUnpairPage pp=new PairUnpairPage(driver);
		pp.unpair(serialNumber);
		/*
		String actual=driver.findElement(By.xpath("//div[text()='"+serialNumber+" Operation cannot be done on Unpaired STB.']")).getText();
		String expected=serialNumber+" Operation cannot be done on Unpaired STB.";
		
		assertEquals(actual, expected);  */
	}
}
