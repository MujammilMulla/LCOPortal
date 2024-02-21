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
	public void newActivationTest() throws Throwable
	{
		HomePage hp=new HomePage(driver);
		hp.getNewActivation().click();
		//driver.findElement(By.xpath("//span[text()='New Activation']")).click();
		NewActivationPage nap=new NewActivationPage(driver);
		nap.getNewActivationEdt().sendKeys("abcd121234567890");
		nap.getSubmitBtn().click();
		
		WebElement dropdown = driver.findElement(By.xpath("(//div[@class='select__input-container css-19bb58m'])[1]"));
		dropdown.click();

		WebElement option = driver.findElement(By.xpath("(//div[@class='select__input-container css-19bb58m'])[1]/div[id='react-select-2-input'][1]"));
		option.click();
	}
}
