package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomiseStatementPage {
	@FindBy(linkText = "Customised Statement")
	public WebElement CustomizedStatementPageField;
	@FindBy(name = "accountno")
	public WebElement AccountNumberField;
	@FindBy(name = "fdate")
	public WebElement FromDateField;
	@FindBy(name = "tdate")
	public WebElement TodateField;
	@FindBy(name = "amountlowerlimit")
	public WebElement MinTransactionField;
	@FindBy(name = "numtransaction")
	public WebElement NumberTransactionField;
	@FindBy (name= "AccSubmit")
	public WebElement SubmitbuttField;
	

}
