package Tests;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Base.TestBase;

public class NewCustomerTest extends TestBase {
	@Test
	public void AddingNewCustomer() {
		logInPage.signIn("mngr16532", "udunYqu");
		newCustomerPage.newCustomerField.click();
		newCustomerPage.newcustomerNameField.click();
		newCustomerPage.newcustomerNameField.sendKeys("azad");

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
		newCustomerPage.newCustomerDOBField.sendKeys("12-12-1986");
		newCustomerPage.newCustomerAddField.click();
		newCustomerPage.newCustomerAddField.sendKeys("88 28 146th");
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

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	}
}
