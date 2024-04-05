package LcoPortal.PairUnpair;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import LcoPortal.GenericUtilities.BaseClass;
import LcoPortal.ObjectRepository.HomePage;
import LcoPortal.ObjectRepository.OperationsPage;
import LcoPortal.ObjectRepository.PairUnpairPage;
@Listeners(LcoPortal.GenericUtilities.ListenersImplementation.class)
public class PairTC33Test extends BaseClass
{	
	//Verify pairing of non existing serial number STB
		@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class, dependsOnMethods = "pairTC3384Test")
		public void pairTC33Test()
		{
			String serialNumber="abcd254234567890";
			String vcNumber="abcd121234567890";
			HomePage hp=new HomePage(driver);
			hp.getOperations().click();
			OperationsPage op=new OperationsPage(driver);
			mouseHover(driver, op.getPairUnpair());
			PairUnpairPage pp=new PairUnpairPage(driver);
			pp.pair(serialNumber, vcNumber);
			
			String actual=driver.findElement(By.xpath("//div[text()='Selected Serial Number not under this LCO']")).getText();
			String expected="Selected Serial Number not under this LCO";
			
			//assertEquals(actual, expected);
		}
}
