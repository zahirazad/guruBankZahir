package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountPage {

	@FindBy(linkText = "New Account")
	public WebElement NewAccountField;
	@FindBy(name = "cusid")
	public WebElement CustomerIdField;

	@FindBy(name = "selaccount")
	public WebElement CustomerAcctTypeDropDownField;

	@FindBy(name = "inideposit")
	public WebElement CustomerDepoField;

	@FindBy(name = "button2")
	public WebElement SubmitFiled;
	@FindBy(id = "customer")
	public WebElement Customertable;// / I created a new customer...this is the
	@FindBy(xpath= ".//*[@id='Accmsg']/tbody/tr/td")
	public WebElement gettingText;
	@FindBy (xpath= "html/body/p/a")
	public WebElement GetBAcktohomePgae;

	public void NewAccount(String id, String amt) {
		NewAccountField.click();
		CustomerIdField.sendKeys("1234");
		CustomerAcctTypeDropDownField.click();
		CustomerDepoField.sendKeys("amt");
		SubmitFiled.click();
		gettingText.getText();
		GetBAcktohomePgae.click();

	}
}
