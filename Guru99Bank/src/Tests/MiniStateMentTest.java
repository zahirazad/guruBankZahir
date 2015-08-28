package Tests;

import org.testng.annotations.Test;

import Base.TestBase;

public class MiniStateMentTest extends TestBase {
	@Test
	public void testGettingMiniStateMent() {   
		logInPage.signIn("mngr16532", "udunYqu");
		miniStatementPage.MinistatementPageField.click();
		miniStatementPage.AccountNumberField.sendKeys("7390");
		miniStatementPage.AccountsubmitField.click();
		System.out.println(miniStatementPage.GetTextField.getText());
		miniStatementPage.GoHomePage.click();

	}
}
