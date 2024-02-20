package LcoPortal.GenericUtilities;

import java.sql.SQLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import LcoPortal.ObjectRepository.HomePage;
import LcoPortal.ObjectRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.reactwebdriver.ReactWebDriver;


public class BaseClass extends WebDriverUtility{

	PropertyFileUtility p=new PropertyFileUtility();
	public WebDriver driver;
	public ReactWebDriver reactWebDriver;
	public static WebDriver sDriver;
	@BeforeSuite
	public void bSuite()
	{
		
	}
	@BeforeClass
	public void bClass() throws Throwable
	{
		String BROWSER=p.readDataFromPropertyFile("browser");
		String URL=p.readDataFromPropertyFile("url");
		if(BROWSER.contains("chrome"))
		{
			driver = new ChromeDriver();
			//reactWebDriver=new ReactWebDriver(driver, "#root");
		}
		if(BROWSER.contains("firefox"))
		{
			
			driver=new FirefoxDriver();
		}
		if(BROWSER.contains("edge"))
		{
			driver=new EdgeDriver();
		}
		sDriver=driver;
		driver.manage().window().maximize();
		waitForPageLoad(driver);
		driver.get(URL);
		waitForPageLoad(driver);
	}
	@BeforeMethod
	public void bMethod() throws Throwable
	{
		waitForPageLoad(driver);
		String USERNAME=p.readDataFromPropertyFile("username");
		String PASSWORD=p.readDataFromPropertyFile("password");
		LoginPage lp=new LoginPage(driver);
		lp.loginToApplication(driver,USERNAME, PASSWORD);
		waitForPageLoad(driver);
	}
	@AfterMethod
	public void aMethod()
	{
		HomePage hp=new HomePage(driver);
		//hp.logout();
	}
	@AfterClass
	public void aClass()
	{
		//driver.quit();
	}
	@AfterSuite
	public void aSuite() throws SQLException
	{
		
	}
}
