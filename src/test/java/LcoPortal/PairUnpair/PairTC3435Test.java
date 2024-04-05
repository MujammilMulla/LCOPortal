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
public class PairTC3435Test extends BaseClass{


	//Verify pairing without entering serial and VC number
	@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class, dependsOnMethods = "pairTC3434Test")
	public void pairTC3435Test()
	{
	
		HomePage hp=new HomePage(driver);
		hp.getOperations().click();
		OperationsPage op=new OperationsPage(driver);
		mouseHover(driver, op.getPairUnpair());
		PairUnpairPage pp=new PairUnpairPage(driver);
		pp.getPairBtn().click();
		
		String actual=driver.findElement(By.xpath("//div[text()='Serial number must be at least 10 characters']")).getText();
		String expected="Serial number must be at least 10 characters";
		assertEquals(actual, expected);
		
		String actual1=driver.findElement(By.xpath("//div[text()='VC number must be at least 10 characters']")).getText();
		String expected1="VC number must be at least 10 characters";	
		assertEquals(actual1, expected1);
		
	}
}
