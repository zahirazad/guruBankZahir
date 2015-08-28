package Tests;

import org.testng.annotations.Test;

import Base.TestBase;

public class DepositFieldTest extends TestBase {
	@Test
	public void DepoField() {
		logInPage.signIn("mngr16532", "udunYqu");
		newDepositpage.DepositField.click();
		newDepositpage.DepositAcctNumberField.sendKeys("1234567098");
		newDepositpage.DepositAmtField.sendKeys("100");
		newDepositpage.DepositDescField.sendKeys("sav");
		newDepositpage.SubmitField.click();

	}

}
