package LcoPortal.PairUnpair;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import LcoPortal.GenericUtilities.BaseClass;
import LcoPortal.GenericUtilities.WebDriverUtility;
import LcoPortal.ObjectRepository.HomePage;
import LcoPortal.ObjectRepository.OperationsPage;
import LcoPortal.ObjectRepository.PairUnpairPage;

public class PairUnpairTest extends BaseClass{

	//This script is to pair newly added boxes
	@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
	public void pairTC2162Test()
	{
		String serialNumber="abcd121234567890";
		String vcNumber="abcd121234567890";
		HomePage hp=new HomePage(driver);
		hp.getOperations().click();
		OperationsPage op=new OperationsPage(driver);
		mouseHover(driver, op.getPairUnpair());
		PairUnpairPage pp=new PairUnpairPage(driver);
		pp.pair(serialNumber, vcNumber);
		
		String actual=driver.findElement(By.xpath("//div[text()='Pairing of STB is success']")).getText();
		String expected="Pairing of STB is success";
		
		//assertEquals(actual, expected);
	}
	
	//Verify pairing of already paired STB
	@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
	public void pairTC3384Test()
	{
		String serialNumber="abcd121234567890";
		String vcNumber="abcd121234567890";
		HomePage hp=new HomePage(driver);
		hp.getOperations().click();
		OperationsPage op=new OperationsPage(driver);
		mouseHover(driver, op.getPairUnpair());
		PairUnpairPage pp=new PairUnpairPage(driver);
		pp.pair(serialNumber, vcNumber);
		
		String actual=driver.findElement(By.xpath("//div[text()='"+serialNumber+" Operation cannot be done on paired STB.']")).getText();
		String expected=serialNumber+" Operation cannot be done on paired STB.";
		
		//assertEquals(actual, expected);
	}
	
	//Verify pairing of non existing serial number STB
	@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
	public void pairTC33Test()
	{
		String serialNumber="abcd254234567890";
		String vcNumber="abcd121234567890";
		HomePage hp=new HomePage(driver);
		hp.getOperations().click();
		OperationsPage op=new OperationsPage(driver);
		mouseHover(driver, op.getPairUnpair());
		PairUnpairPage pp=new PairUnpairPage(driver);
		pp.pair(serialNumber, vcNumber);
		
		String actual=driver.findElement(By.xpath("//div[text()='Selected Serial Number not under this LCO']")).getText();
		String expected="Selected Serial Number not under this LCO";
		
		//assertEquals(actual, expected);
	}
	
	//Verify pairing of non existing vc number STB
		@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
		public void pairTC3389Test()
		{
			String serialNumber="abcd121234567890";
			String vcNumber="abcd254234567890";
			HomePage hp=new HomePage(driver);
			hp.getOperations().click();
			OperationsPage op=new OperationsPage(driver);
			mouseHover(driver, op.getPairUnpair());
			PairUnpairPage pp=new PairUnpairPage(driver);
			pp.pair(serialNumber, vcNumber);
			
			String actual=driver.findElement(By.xpath("//div[text()='"+vcNumber+" VC Number does not exist']")).getText();
			String expected=vcNumber+" VC Number does not exist";
			
			//assertEquals(actual, expected);
		}
	
		//Verify pairing if serial number is with another LCO
		@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
		public void pairTC3390Test()
		{
			String serialNumber="abcd254234567890";
			String vcNumber="abcd121234567890";
			HomePage hp=new HomePage(driver);
			hp.getOperations().click();
			OperationsPage op=new OperationsPage(driver);
			mouseHover(driver, op.getPairUnpair());
			PairUnpairPage pp=new PairUnpairPage(driver);
			pp.pair(serialNumber, vcNumber);
			
			String actual=driver.findElement(By.xpath("//div[text()='Selected Serial Number not under this LCO']")).getText();
			String expected="Selected Serial Number not under this LCO";
			
			//assertEquals(actual, expected);
		}
		
		//Verify pairing if VC number is with another LCO
			@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
			public void pairTC3391Test()
			{
				String serialNumber="abcd121234567890";
				String vcNumber="abcd254234567890";
				HomePage hp=new HomePage(driver);
				hp.getOperations().click();
				OperationsPage op=new OperationsPage(driver);
				mouseHover(driver, op.getPairUnpair());
				PairUnpairPage pp=new PairUnpairPage(driver);
				pp.pair(serialNumber, vcNumber);
				
				String actual=driver.findElement(By.xpath("//div[text()='"+vcNumber+" VC Number does not exist']")).getText();
				String expected=vcNumber+" VC Number does not exist";
				
				//assertEquals(actual, expected);
			}
			
			//Verify pairing if Serial and VC number is with another LCO
			@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
			public void pairTC3392Test()
			{
				String serialNumber="abcd254234567890";
				String vcNumber="abcd254234567890";
				HomePage hp=new HomePage(driver);
				hp.getOperations().click();
				OperationsPage op=new OperationsPage(driver);
				mouseHover(driver, op.getPairUnpair());
				PairUnpairPage pp=new PairUnpairPage(driver);
				pp.pair(serialNumber, vcNumber);
				
				String actual=driver.findElement(By.xpath("//div[text()='Selected Serial Number not under this LCO']")).getText();
				String expected="Selected Serial Number not under this LCO";
				
				//assertEquals(actual, expected);
			}
			
			//Verify pairing of non existing serial number and vc number
			@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
			public void pairTC3393Test()
			{
				String serialNumber="abcd254234567890";
				String vcNumber="abcd254234567890";
				HomePage hp=new HomePage(driver);
				hp.getOperations().click();
				OperationsPage op=new OperationsPage(driver);
				mouseHover(driver, op.getPairUnpair());
				PairUnpairPage pp=new PairUnpairPage(driver);
				pp.pair(serialNumber, vcNumber);
				
				String actual=driver.findElement(By.xpath("//div[text()='Selected Serial Number not under this LCO']")).getText();
				String expected="Selected Serial Number not under this LCO";
				
				//assertEquals(actual, expected);
			}
			
			
			
			//Verify unpairing of newly added paired boxes
			@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
			public void unPair1Test()
			{
				String serialNumber="abcd121234567890";
				
				HomePage hp=new HomePage(driver);
				hp.getOperations().click();
				OperationsPage op=new OperationsPage(driver);
				mouseHover(driver, op.getPairUnpair());
				PairUnpairPage pp=new PairUnpairPage(driver);
				pp.unpair(serialNumber);
				
				/* String actual=driver.findElement(By.xpath("//div[text()='Unpairing of STB is success']")).getText();
				String expected="Unpairing of STB is success";
				
				assertEquals(actual, expected); */
			}
			
			
			//Verify unpairing of already unpaired boxes
			@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
			public void unPair2Test()
			{
				String serialNumber="abcd121234567890";
				
				HomePage hp=new HomePage(driver);
				hp.getOperations().click();
				OperationsPage op=new OperationsPage(driver);
				mouseHover(driver, op.getPairUnpair());
				PairUnpairPage pp=new PairUnpairPage(driver);
				pp.unpair(serialNumber);
				/*
				String actual=driver.findElement(By.xpath("//div[text()='"+serialNumber+" Operation cannot be done on Unpaired STB.']")).getText();
				String expected=serialNumber+" Operation cannot be done on Unpaired STB.";
				
				assertEquals(actual, expected);  */
			}
			
			//Verify Unpairing of non existing serial number STB
			@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
			public void unPair3Test()
			{
				String serialNumber="abcd254234567890";
				HomePage hp=new HomePage(driver);
				hp.getOperations().click();
				OperationsPage op=new OperationsPage(driver);
				mouseHover(driver, op.getPairUnpair());
				PairUnpairPage pp=new PairUnpairPage(driver);
				pp.unpair(serialNumber);
				/*
				String actual=driver.findElement(By.xpath("//div[text()='Selected Serial Number not under this LCO']")).getText();
				String expected="Selected Serial Number not under this LCO";
				
				assertEquals(actual, expected); */
			}

			//Verify Unpairing of existing serial number with another LCO
			@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
			public void unPair4Test()
			{
				String serialNumber="abcd254234567890";
				HomePage hp=new HomePage(driver);
				hp.getOperations().click();
				OperationsPage op=new OperationsPage(driver);
				mouseHover(driver, op.getPairUnpair());
				PairUnpairPage pp=new PairUnpairPage(driver);
				pp.unpair(serialNumber);
				/*
				String actual=driver.findElement(By.xpath("//div[text()='Selected Serial Number not under this LCO']")).getText();
				String expected="Selected Serial Number not under this LCO";
				
				assertEquals(actual, expected); */
			}
			
			//Verify Unpairing without entering serial number
			@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
			public void unPair5Test()
			{
				HomePage hp=new HomePage(driver);
				hp.getOperations().click();
				OperationsPage op=new OperationsPage(driver);
				mouseHover(driver, op.getPairUnpair());
				PairUnpairPage pp=new PairUnpairPage(driver);
				pp.getUnpairBtn().click();
				
				String actual=driver.findElement(By.xpath("//div[text()='Serial number must be at least 10 characters']")).getText();
				String expected="Serial number must be at least 10 characters";
				
				assertEquals(actual, expected); 
			}
			
			//Verify pairing without entering VC number
			@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
			public void pair1Test()
			{
				String serialNumber="abcd121234567890";
				HomePage hp=new HomePage(driver);
				hp.getOperations().click();
				OperationsPage op=new OperationsPage(driver);
				mouseHover(driver, op.getPairUnpair());
				PairUnpairPage pp=new PairUnpairPage(driver);
				pp.getSerialNumberEdt().sendKeys(serialNumber);
				pp.getPairBtn().click();
				
				String actual=driver.findElement(By.xpath("//div[text()='VC number must be at least 10 characters']")).getText();
				String expected="VC number must be at least 10 characters";
				
				assertEquals(actual, expected);
			}
			
			//Verify pairing without entering serial number
			@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
			public void pair2Test()
			{
				String vcNumber="abcd121234567890";
				HomePage hp=new HomePage(driver);
				hp.getOperations().click();
				OperationsPage op=new OperationsPage(driver);
				mouseHover(driver, op.getPairUnpair());
				PairUnpairPage pp=new PairUnpairPage(driver);
				pp.getVcNumberEdt().sendKeys(vcNumber);
				pp.getPairBtn().click();
				
				String actual=driver.findElement(By.xpath("//div[text()='Serial number must be at least 10 characters']")).getText();
				String expected="Serial number must be at least 10 characters";
				
				assertEquals(actual, expected);
			}
			
			//Verify pairing without entering serial and VC number
			@Test (retryAnalyzer = LcoPortal.GenericUtilities.RetryAnalyserImplementation.class)
			public void pair3Test()
			{
				HomePage hp=new HomePage(driver);
				hp.getOperations().click();
				OperationsPage op=new OperationsPage(driver);
				mouseHover(driver, op.getPairUnpair());
				PairUnpairPage pp=new PairUnpairPage(driver);
				pp.getPairBtn().click();
				
				String actual=driver.findElement(By.xpath("//div[text()='Serial number must be at least 10 characters']")).getText();
				String expected="Serial number must be at least 10 characters";
				assertEquals(actual, expected);
				
				String actual1=driver.findElement(By.xpath("//div[text()='VC number must be at least 10 characters']")).getText();
				String expected1="VC number must be at least 10 characters";	
				assertEquals(actual1, expected1);
			}
}
