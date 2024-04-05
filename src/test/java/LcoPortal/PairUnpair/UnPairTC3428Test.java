package LcoPortal.PairUnpair;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import LcoPortal.GenericUtilities.BaseClass;
import LcoPortal.ObjectRepository.HomePage;
import LcoPortal.ObjectRepository.OperationsPage;
import LcoPortal.ObjectRepository.PairUnpairPage;
@Listeners(LcoPortal.GenericUtilities.ListenersImplementation.class)
public class UnPairTC3428Test extends BaseClass{

	//Verify unpairing of newly added paired boxes
	@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class, dependsOnMethods = "pairTC3393Test")
	public void unPairTC3428Test()
	{
		String serialNumber="abcd121234567890";
		
		HomePage hp=new HomePage(driver);
		hp.getOperations().click();
		OperationsPage op=new OperationsPage(driver);
		mouseHover(driver, op.getPairUnpair());
		PairUnpairPage pp=new PairUnpairPage(driver);
		pp.unpair(serialNumber);
		
		/* String actual=driver.findElement(By.xpath("//div[text()='Unpairing of STB is success']")).getText();
		String expected="Unpairing of STB is success";
		
		assertEquals(actual, expected); */
	}
	
}
