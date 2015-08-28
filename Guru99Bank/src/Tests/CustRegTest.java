package Tests;

import org.testng.annotations.Test;

import Base.TestBase;

public class CustRegTest extends TestBase {
	@Test
	public void CustomerReg() {
		logInPage.signIn("mngr16532", "udunYqu");
		newCustomerPage.newCustomerField.click();
		newCustomerPage.newcustomerNameField.click();
		newCustomerPage.newcustomerNameField.sendKeys("aaaaa");

		int iSize = newCustomerPage.allElements.size();

		for (int i = 0; i < iSize; i++) {
			String sValue = newCustomerPage.allElements.get(i).getAttribute(
					"value");

			if (sValue.equalsIgnoreCase("m")) {

				newCustomerPage.allElements.get(i).click();

				break;

			}

		}
		newCustomerPage.newCustomerDOBField.click();
		newCustomerPage.newCustomerDOBField.sendKeys("1987-12-12");
		newCustomerPage.newCustomerAddField.click();
		newCustomerPage.newCustomerAddField.sendKeys("adress nnn");
		newCustomerPage.newCustomerCityField.click();
		newCustomerPage.newCustomerCityField.sendKeys("jamaica");
		newCustomerPage.newCustomerStateField.click();
		newCustomerPage.newCustomerStateField.sendKeys("ny");
		newCustomerPage.newCustomerPinNumberField.click();
		newCustomerPage.newCustomerPinNumberField.sendKeys("123456");
		newCustomerPage.newCustomerMoblileNumberField.click();
		newCustomerPage.newCustomerMoblileNumberField.sendKeys("1234567890");
		newCustomerPage.newCustomerEmailField.click();
		newCustomerPage.newCustomerEmailField.sendKeys("abcdef@yaoo.com");
		newCustomerPage.newCustomerPassField.click();
		newCustomerPage.newCustomerPassField.sendKeys("1234567");
		newCustomerPage.submitFiled.click();

	}

}
