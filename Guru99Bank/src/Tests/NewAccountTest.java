package Tests;

import org.testng.annotations.Test;

import Base.TestBase;

public class NewAccountTest extends TestBase {
	@Test
	public void AddingNewAccount() {
		//logInPage.signIn("mngr16532", "udunYqu");
		newAccountpage.NewAccountField.click();
		newAccountpage.CustomerIdField.sendKeys("50094");
		newAccountpage.CustomerAcctTypeDropDownField.click();
		newAccountpage.CustomerDepoField.sendKeys("500");
		newAccountpage.SubmitFiled.click();
		System.out.println(newAccountpage.gettingText.getText());
		newAccountpage.GetBAcktohomePgae.click();
	}

}
