package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepositBalPage {
	@FindBy(linkText = "Deposit")
	public WebElement DepositField;
	@FindBy(name = "accountno")
	public WebElement DepositAcctNumberField;
	@FindBy(name = "ammount")
	public WebElement DepositAmtField;
	@FindBy(name = "desc")
	public WebElement DepositDescField;
	@FindBy(name = "AccSubmit")
	public WebElement SubmitField;

	public void Deposit(String AcctNum, String depAmt, String Desc) {
		DepositField.click();
		DepositAcctNumberField.sendKeys(AcctNum);
		DepositAmtField.sendKeys(depAmt);
		DepositDescField.sendKeys(Desc);
		SubmitField.click();
	}

}
