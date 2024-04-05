package LcoPortal.PairUnpair;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import LcoPortal.GenericUtilities.BaseClass;
import LcoPortal.ObjectRepository.HomePage;
import LcoPortal.ObjectRepository.OperationsPage;
import LcoPortal.ObjectRepository.PairUnpairPage;
@Listeners(LcoPortal.GenericUtilities.ListenersImplementation.class)
public class PairTC3384Test extends BaseClass{
	
	//Verify pairing of already paired STB
		@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class, dependsOnMethods = "pairTC2162Test")
		public void pairTC3384Test()
		{
			String serialNumber="abcd121234567890";
			String vcNumber="abcd121234567890";
			HomePage hp=new HomePage(driver);
			hp.getOperations().click();
			OperationsPage op=new OperationsPage(driver);
			mouseHover(driver, op.getPairUnpair());
			PairUnpairPage pp=new PairUnpairPage(driver);
			pp.pair(serialNumber, vcNumber);
			
			String actual=driver.findElement(By.xpath("//div[text()='"+serialNumber+" Operation cannot be done on paired STB.']")).getText();
			String expected=serialNumber+" Operation cannot be done on paired STB.";
			
			//assertEquals(actual, expected);
		}

}
