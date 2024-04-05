package LcoPortal.Reports;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import LcoPortal.GenericUtilities.BaseClass;
import LcoPortal.GenericUtilities.ScreenRecorderUtil;
import LcoPortal.ObjectRepository.HomePage;
import LcoPortal.ObjectRepository.InvoiceSummaryPage;
import LcoPortal.ObjectRepository.ReportsPage;
@Listeners(LcoPortal.GenericUtilities.ListenersImplementation.class)
public class InvoiceSummaryTest extends BaseClass{
	
	@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
	public void test() throws Exception
	{
		ScreenRecorderUtil.startRecord("test");
		HomePage hp=new HomePage(driver);
		hp.getReports().click();
		ReportsPage rp=new ReportsPage(driver);
		rp.getInvoiceSummary().click();
		waitForPageLoad(driver);
		InvoiceSummaryPage isp=new InvoiceSummaryPage(driver);
		isp.getSubmitBtn().click();
		
		
		String actual1=driver.findElement(By.xpath("//div[text()='S.No']")).getText();
		String expected1="S.No";
		assertEquals(actual1, expected1);
		
		String actual2=driver.findElement(By.xpath("//div[text()='Account No']")).getText();
		String expected2="Account No";
		assertEquals(actual2, expected2);
		
		String actual3=driver.findElement(By.xpath("//div[text()='Customer Name']")).getText();
		String expected3="Customer Name";
		assertEquals(actual3, expected3);
		
		String actual4=driver.findElement(By.xpath("//div[text()='Serial Number']")).getText();
		String expected4="Serial Number";
		assertEquals(actual4, expected4);
		
		String actual5=driver.findElement(By.xpath("//div[text()='VC Number']")).getText();
		String expected5="VC Number";
		assertEquals(actual5, expected5);
		
		String actual6=driver.findElement(By.xpath("//div[text()='Customer Status']")).getText();
		String expected6="Customer Status";
		assertEquals(actual6, expected6);
		
		String actual7=driver.findElement(By.xpath("//div[text()='Address']")).getText();
		String expected7="Address";
		assertEquals(actual7, expected7);
		
		String actual8=driver.findElement(By.xpath("//div[text()='Packages']")).getText();
		String expected8="Packages";
		assertEquals(actual8, expected8);
		
		ScreenRecorderUtil.stopRecord();
		
	}
}
