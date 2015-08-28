package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCustPage {

	@FindBy(linkText = "Edit Customer")
	public WebElement EditCustomerField;
	@FindBy(name = "cusid")
	public WebElement CustomerIdField;
	@FindBy(name = "AccSubmit")
	public WebElement SubmitButtonField;
	@FindBy(xpath = ".//*[@id='customer']/tbody/tr[4]/td[2]")
	public WebElement CustomerId;
	@FindBy(xpath = ".//*[@id='customer']/tbody/tr[5]/td[2]")
	public WebElement CustomerName;
	@FindBy(xpath = ".//*[@id='customer']/tbody/tr[6]/td[2]")
	public WebElement CustomerGender;
	@FindBy(xpath = ".//*[@id='customer']/tbody/tr[7]/td[2]")
	public WebElement CustomerDOB;
	@FindBy(name = "addr")
	public WebElement CustomerAddress;
	@FindBy(xpath = ".//*[@id='customer']/tbody/tr[9]/td[2]")
	public WebElement CustomerCity;
	@FindBy(xpath = ".//*[@id='customer']/tbody/tr[10]/td[2]")
	public WebElement CustomerState;
	@FindBy(xpath = ".//*[@id='customer']/tbody/tr[11]/td[2]")
	public WebElement CustomerPin;
	@FindBy(xpath = ".//*[@id='customer']/tbody/tr[12]/td[2]")
	public WebElement CustomerMobNum;
	@FindBy(xpath = ".//*[@id='customer']/tbody/tr[13]/td[2]")
	public WebElement CustomerEmail;
	@FindBy(name = "sub")
	public WebElement SubmitField;

	public void EditingCustInfo() {
		EditCustomerField.click();
		CustomerId.sendKeys("64134");
		SubmitButtonField.click();
		CustomerName.sendKeys("zahir");
		CustomerGender.sendKeys("male");
		CustomerDOB.sendKeys("1987-1-1");
		CustomerAddress.sendKeys("adress in hollis");
		CustomerCity.sendKeys("Queens");
		CustomerState.sendKeys("NY");
		CustomerPin.sendKeys("1234567");
		CustomerMobNum.sendKeys("1237890000");
		SubmitField.click();

	}
}