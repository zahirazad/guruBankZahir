package Tests;

import org.testng.annotations.Test;

import Base.TestBase;

public class CustomizeStatementTest extends TestBase {
	@Test
	public void CustomizedStaTest() {
		logInPage.signIn("mngr16532", "udunYqu");
		customizePage.CustomizedStatementPageField.click();
		customizePage.AccountNumberField.sendKeys("12345");
		customizePage.FromDateField.sendKeys("01/01/2015");
		customizePage.TodateField.sendKeys("02/02/2015");
		customizePage.MinTransactionField.sendKeys("500");
		customizePage.NumberTransactionField.sendKeys("1");
		customizePage.SubmitbuttField.click();
	}

}
