package LcoPortal.PairUnpair;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import LcoPortal.GenericUtilities.BaseClass;
import LcoPortal.GenericUtilities.WebDriverUtility;
import LcoPortal.ObjectRepository.HomePage;
import LcoPortal.ObjectRepository.OperationsPage;
import LcoPortal.ObjectRepository.PairUnpairPage;

@Listeners(LcoPortal.GenericUtilities.ListenersImplementation.class)
public class PairUnpairTest extends BaseClass{

	//This script is to pair newly added boxes
	@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
	public void pairTC2162Test()
	{
		
		String serialNumber="abcd121234567890";
		String vcNumber="abcd121234567890";
		HomePage hp=new HomePage(driver);
		hp.getOperations().click();
		OperationsPage op=new OperationsPage(driver);
		mouseHover(driver, op.getPairUnpair());
		PairUnpairPage pp=new PairUnpairPage(driver);
		pp.pair(serialNumber, vcNumber);
		
		String actual=driver.findElement(By.xpath("//div[text()='Pairing of STB is success']")).getText();
		String expected="Pairing of STB is success";
		
		//assertEquals(actual, expected);
		
	}
}
