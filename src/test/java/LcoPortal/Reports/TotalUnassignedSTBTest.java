package LcoPortal.Reports;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import LcoPortal.GenericUtilities.BaseClass;
import LcoPortal.ObjectRepository.HomePage;
import LcoPortal.ObjectRepository.ReportsPage;
import LcoPortal.ObjectRepository.TotalUnassignedSTBPage;

public class TotalUnassignedSTBTest extends BaseClass{

	@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
	public void test()
	{
		HomePage hp=new HomePage(driver);
		hp.getReports().click();
		ReportsPage rp=new ReportsPage(driver);
		mouseHover(driver, rp.getTotalUnassignedSTBreport());
		TotalUnassignedSTBPage tusp=new TotalUnassignedSTBPage(driver);
		tusp.getSubmitBtn().click();
		
		String actual1=driver.findElement(By.xpath("//div[text()='S.No']")).getText();
		String expected1="S.No";
		assertEquals(actual1, expected1);
		
		String actual2=driver.findElement(By.xpath("//div[text()='Serial Number']")).getText();
		String expected2="Serial Number";
		assertEquals(actual2, expected2);
		
		String actual3=driver.findElement(By.xpath("//div[text()='VC Number']")).getText();
		String expected3="VC Number";
		assertEquals(actual3, expected3);
		
		String actual4=driver.findElement(By.xpath("//div[text()='Location']")).getText();
		String expected4="Location";
		assertEquals(actual4, expected4);
		
		String actual5=driver.findElement(By.xpath("//div[text()='Is Active']")).getText();
		String expected5="Is Active";
		assertEquals(actual5, expected5);
		
		String actual6=driver.findElement(By.xpath("//div[text()='Is Assigned']")).getText();
		String expected6="Is Assigned";
		assertEquals(actual6, expected6);
		
		String actual7=driver.findElement(By.xpath("//div[text()='CAS']")).getText();
		String expected7="CAS";
		assertEquals(actual7, expected7);
		
		String actual8=driver.findElement(By.xpath("//div[text()='Status']")).getText();
		String expected8="Status";
		assertEquals(actual8, expected8);
		
		String actual9=driver.findElement(By.xpath("//div[text()='Model']")).getText();
		String expected9="Model";
		assertEquals(actual9, expected9);
		
		String actual10=driver.findElement(By.xpath("//div[text()='STB Type']")).getText();
		String expected10="STB Type";
		assertEquals(actual10, expected10);
	}
}
