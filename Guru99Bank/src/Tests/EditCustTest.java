package Tests;

import org.testng.annotations.Test;

import Base.TestBase;

public class EditCustTest extends TestBase {
	@Test
	public void EditCustomerTest() {
		logInPage.signIn("mngr16532", "udunYqu");
		editCustPage.EditCustomerField.click();
		editCustPage.CustomerIdField.sendKeys("64134");
		editCustPage.SubmitButtonField.click();

		editCustPage.CustomerAddress.sendKeys("hollis");
		//editCustPage.CustomerCity.sendKeys("Q");
		//editCustPage.CustomerState.sendKeys("NY");
		//editCustPage.CustomerPin.sendKeys("1234567");
	  //editCustPage.CustomerMobNum.sendKeys("1237890000");
		editCustPage.SubmitField.click();

	}
}
