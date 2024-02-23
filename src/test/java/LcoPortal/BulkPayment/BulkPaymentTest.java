package LcoPortal.BulkPayment;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import LcoPortal.GenericUtilities.BaseClass;
import LcoPortal.GenericUtilities.ExcelFileUtility;
import LcoPortal.ObjectRepository.BulkPaymentPage;
import LcoPortal.ObjectRepository.HomePage;
import LcoPortal.ObjectRepository.OperationsPage;

public class BulkPaymentTest extends BaseClass{

	@Test
	public void test() throws Throwable
	{
		ExcelFileUtility eUtil=new ExcelFileUtility();
		String  serialNumber=eUtil.readDataFromExcelSheet("BulkPayment", 1, 0);
		
		HomePage hp=new HomePage(driver);
		hp.getOperations().click();
		OperationsPage op=new OperationsPage(driver);
		op.getBulkPayment().click();
		
		BulkPaymentPage bpp=new BulkPaymentPage(driver);
		bpp.getSubmitBtn().click();
		bpp.bulkPayment(driver, serialNumber);
		
		String expected="Payment successfull.";
		String actual=bpp.getPaymentSuccessfulPopup().getText();
		System.out.println(expected +"====="+ actual);
		assertEquals(actual, expected);
		
	}
}
