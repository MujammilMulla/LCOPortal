package LcoPortal.BulkPayment;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import LcoPortal.GenericUtilities.BaseClass;
import LcoPortal.GenericUtilities.ExcelFileUtility;
import LcoPortal.GenericUtilities.ScreenRecorderUtil;
import LcoPortal.ObjectRepository.BulkPaymentPage;
import LcoPortal.ObjectRepository.HomePage;
import LcoPortal.ObjectRepository.OperationsPage;

@Listeners(LcoPortal.GenericUtilities.ListenersImplementation.class)
public class BulkPaymentTest extends BaseClass{

	@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
	public void bulkPaymentTC3043Test() throws Throwable
	{
		//Assert.fail();
		//Reading test data from excel sheet
		/* ExcelFileUtility eUtil=new ExcelFileUtility();
		String  serialNumber=eUtil.readDataFromExcelSheet("BulkPayment", 1, 0);
		
		//Navigating to bulk payment page
		// ScreenRecorderUtil.startRecord("test"); //Screen Recording start
		HomePage hp=new HomePage(driver);
		hp.getOperations().click();
		OperationsPage op=new OperationsPage(driver);
		op.getBulkPayment().click();
		
		//Making bulk payment
		BulkPaymentPage bpp=new BulkPaymentPage(driver);
		bpp.getSubmitBtn().click();
		bpp.bulkPayment(driver, serialNumber);
		
		//Validating the payment successful or not
		String expected="Payment successfull.";
		String actual=bpp.getPaymentSuccessfulPopup().getText();
		System.out.println(expected +"====="+ actual);
		assertEquals(actual, expected);
		//ScreenRecorderUtil.stopRecord(); //Screen recording stopped
		 * */
		 
	}
}
