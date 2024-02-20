package LcoPortal.NewActivation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import LcoPortal.GenericUtilities.BaseClass;
import LcoPortal.ObjectRepository.HomePage;
import LcoPortal.ObjectRepository.NewActivationPage;
import LcoPortal.ObjectRepository.ReportsPage;
import LcoPortal.ObjectRepository.TotalUnassignedSTBPage;
import io.github.reactwebdriver.ByReact;

//@Listeners(LcoPortal.GenericUtilities.ListenersImplementation.class)
public class NewActivationTest extends BaseClass{

	@Test
	public void test() throws Throwable
	{
		//span[text()='New Activation']
		driver.findElement(By.xpath("//span[text()='New Activation']")).click();
		NewActivationPage nap=new NewActivationPage(driver);
		nap.getNewActivationEdt().sendKeys("1234567890");
	}
}
