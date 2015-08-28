package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CustomiseStatementPage;
import Pages.DepositBalPage;
import Pages.EditCustPage;
import Pages.LogInPage;
import Pages.MiniStatementPage;
import Pages.NewAccountPage;
import Pages.NewCustRegistration;
import Pages.NewCustomerPage;

public class TestBase {
	public static WebDriver driver;
	public static LogInPage logInPage;
	public static NewCustomerPage newCustomerPage;
	public static NewAccountPage newAccountpage;
	public static DepositBalPage newDepositpage;
	public static NewCustRegistration newCustRegistrationPage;
	public static EditCustPage editCustPage;
	public static CustomiseStatementPage customizePage;
	public static MiniStatementPage miniStatementPage;

	@BeforeTest
	public void testSetup() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/index.php");
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		newCustomerPage = PageFactory.initElements(driver,
				NewCustomerPage.class);
		newAccountpage = PageFactory.initElements(driver, NewAccountPage.class);
		newDepositpage = PageFactory.initElements(driver, DepositBalPage.class);
		newCustRegistrationPage = PageFactory.initElements(driver,
				NewCustRegistration.class);
		editCustPage = PageFactory.initElements(driver, EditCustPage.class);
		customizePage = PageFactory.initElements(driver,
				CustomiseStatementPage.class);
		miniStatementPage = PageFactory.initElements(driver,
				MiniStatementPage.class);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
