package LcoPortal.Reports;

import org.testng.annotations.Test;

import LcoPortal.GenericUtilities.BaseClass;
import LcoPortal.ObjectRepository.HomePage;
import LcoPortal.ObjectRepository.ReportsPage;
import LcoPortal.ObjectRepository.TotalCustomerReportPage;

public class TotalCustomerReport extends BaseClass{

	@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
	public void testTotalCustomerReport()
	{
		HomePage hp=new HomePage(driver);
		hp.getReports();
		ReportsPage rp=new ReportsPage(driver);
		rp.getTotalCustomerReport().click();
		TotalCustomerReportPage tcrp=new TotalCustomerReportPage(driver);
		tcrp.getSubmitBtn().click();
	}
}
