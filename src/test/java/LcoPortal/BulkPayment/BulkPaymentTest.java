package LcoPortal.BulkPayment;

import org.testng.annotations.Test;

import LcoPortal.GenericUtilities.BaseClass;
import LcoPortal.GenericUtilities.WebDriverUtility;
import LcoPortal.ObjectRepository.BulkPaymentPage;
import LcoPortal.ObjectRepository.HomePage;
import LcoPortal.ObjectRepository.OperationsPage;

public class BulkPaymentTest extends BaseClass{

	@Test
	public void test()
	{
		WebDriverUtility wUtil=new WebDriverUtility();
		HomePage hp=new HomePage(driver);
		hp.getOperations().click();
		OperationsPage op=new OperationsPage(driver);
		op.getBulkPayment().click();
		BulkPaymentPage bpp=new BulkPaymentPage(driver);
		bpp.getSubmitBtn().click();
		//wUtil.scrollAction(driver, bpp.getSortSerialNumber());
		waitForPageLoad(driver);
		
		wUtil.mouseHover(driver, bpp.getSortSerialNumber());
		//bpp.getSortSerialNumber().click();
		bpp.getCheckbox().click();
	}
	
}
