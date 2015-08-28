package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustRegistration {
	@FindBy(id = "customer")
	public WebElement Customertable;
	@FindBy(xpath = ".//*[@id='customer']/tbody/tr[4]/td[2]")
	public WebElement CustomerId;
	@FindBy(xpath = ".//*[@id='customer']/tbody/tr[5]/td[2]")
	public WebElement CustomerName;
	@FindBy(xpath = ".//*[@id='customer']/tbody/tr[6]/td[2]")
	public WebElement CustomerGender;
	@FindBy(xpath = ".//*[@id='customer']/tbody/tr[7]/td[2]")
	public WebElement CustomerDOB;
	@FindBy(xpath = ".//*[@id='customer']/tbody/tr[8]/td[2]")
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

	public void Registration() {
		Customertable.getText();
		CustomerId.sendKeys("64134");
		CustomerName.sendKeys("aaaaa");
		CustomerGender.sendKeys("female");
		CustomerDOB.sendKeys("1987-12-12");
		CustomerAddress.sendKeys("adress nnn");
		CustomerCity.sendKeys("Bronx");
		CustomerState.sendKeys("ny");
		CustomerPin.sendKeys("123456");
		CustomerMobNum.sendKeys("1234567890");

	}

}
