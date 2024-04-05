package LcoPortal.GlobalSearch;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import LcoPortal.GenericUtilities.BaseClass;
import LcoPortal.ObjectRepository.GlobalSearch360Page;
import LcoPortal.ObjectRepository.HomePage;
import LcoPortal.ObjectRepository.OperationsPage;
@Listeners(LcoPortal.GenericUtilities.ListenersImplementation.class)
public class GlobalSearchTest extends BaseClass {

	@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
	public void test()
	{
		HomePage hp=new HomePage(driver);
		hp.getOperations().click();
		OperationsPage op=new OperationsPage(driver);
	    op.getGlobalSearch360().click();
	    GlobalSearch360Page gsp=new GlobalSearch360Page(driver);
	    Select dropdown=new Select(gsp.getSearchCriteriaDropdown());
	    dropdown.selectByVisibleText("Serial Number");
	}
}
