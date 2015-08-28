package Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestBase;

public class LogINTest extends TestBase {

	@Test
	public void testClickGenerateAccess() {
		logInPage.generateAccessLink.click();
		Assert.assertEquals(
				driver.findElement(
						By.xpath("html/body/form/table/tbody/tr[1]/td/h2"))
						.getText(), "Enter your email address to get" + "\n"
						+ "access details to demo site");
		driver.navigate().back();
	}

	@Test
	public void testLoginEmptyUsernamePassword() {
		logInPage.resetButton.click();
		logInPage.loginButton.click();
		Alert myalert = driver.switchTo().alert();
		Assert.assertEquals(myalert.getText(), "User or Password is not valid");
		myalert.accept();
	}

	@Test
	public void testLoginInvalidUsernamePassword() {
		logInPage.resetButton.click();
		logInPage.signIn("mngr15", "Asyb");
		Alert myalert = driver.switchTo().alert();
		Assert.assertEquals(myalert.getText(), "User or Password is not valid");
		myalert.accept();
	}

	@Test
	public void testLoginBlankUsernamePassword() {
		logInPage.userIdField.click();
		logInPage.userPasswordField.click();
		Assert.assertEquals(logInPage.blankMessageUserID.getText(),
				"User-ID must not be blank");
		logInPage.resetButton.click();
		Assert.assertEquals(logInPage.blankMessagePassword.getText(),
				"Password must not be blank");
		logInPage.loginButton.click();
		Alert myalert = driver.switchTo().alert();
		Assert.assertEquals(myalert.getText(), "User or Password is not valid");
		myalert.accept();
	}

	@Test
	public void testValidLogin() {
		logInPage.signIn("mngr16532", "udunYqu");
		
	}

}