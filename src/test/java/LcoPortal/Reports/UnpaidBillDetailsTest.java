package LcoPortal.Reports;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import LcoPortal.GenericUtilities.BaseClass;
import LcoPortal.ObjectRepository.HomePage;
import LcoPortal.ObjectRepository.ReportsPage;
import LcoPortal.ObjectRepository.UnpaidBillDetailsPage;

//@Listeners(LcoPortal.GenericUtilities.ListenersImplementation.class)
public class UnpaidBillDetailsTest extends BaseClass {
	
	@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
	public void unpaidBilldetailsTC3519()
	{
		HomePage hp=new HomePage(driver);
		hp.getReports().click();
		ReportsPage rp=new ReportsPage(driver);
		rp.getUnpaidBillDetails().click();
		UnpaidBillDetailsPage ubdp=new UnpaidBillDetailsPage(driver);
		ubdp.getSubmitButton().click();
		String actual1=driver.findElement(By.xpath("//div[text()='S.No']")).getText();
		String expected1="S.No";
		assertEquals(actual1, expected1);
		
		String actual2=driver.findElement(By.xpath("//div[text()='Account No']")).getText();
		String expected2="Account No";
		assertEquals(actual2, expected2);
		
		String actual3=driver.findElement(By.xpath("//div[text()='Customer Name']")).getText();
		String expected3="Customer Name";
		assertEquals(actual3, expected3);
		
		String actual4=driver.findElement(By.xpath("//div[text()='VC Number']")).getText();
		String expected4="VC Number";
		assertEquals(actual4, expected4);
		
		String actual5=driver.findElement(By.xpath("//div[text()='STB Status']")).getText();
		String expected5="STB Status";
		assertEquals(actual5, expected5);
		
		String actual6=driver.findElement(By.xpath("//div[text()='Active STBs']")).getText();
		String expected6="Active STBs";
		assertEquals(actual6, expected6);
		
		String actual7=driver.findElement(By.xpath("//div[text()='Address']")).getText();
		String expected7="Address";
		assertEquals(actual7, expected7);
		
		String actual8=driver.findElement(By.xpath("//div[text()='Deactive STBs']")).getText();
		String expected8="Deactive STBs";
		assertEquals(actual8, expected8);
		
		String actual9=driver.findElement(By.xpath("//div[text()='Due Amount']")).getText();
		String expected9="Due Amount";
		assertEquals(actual9, expected9);
	}

}
