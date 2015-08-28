package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class NewCustomerPage {
	@FindBy(linkText = "New Customer")
	public WebElement newCustomerField;

	@FindBy(name = "name")
	public WebElement newcustomerNameField;
	@FindBy(name ="rad1")  
	public List<WebElement> allElements;
	
	@FindBy(id = "dob")
	public WebElement newCustomerDOBField;
	@FindBy(name = "addr")
	public WebElement newCustomerAddField;
	@FindBy(name = "city")
	public WebElement newCustomerCityField;
	@FindBy(name = "state")
	public WebElement newCustomerStateField;
	@FindBy(name = "pinno")
	public WebElement newCustomerPinNumberField;
	@FindBy(name = "telephoneno")
	public WebElement newCustomerMoblileNumberField;
	@FindBy(name = "emailid")
	public WebElement newCustomerEmailField;
	@FindBy(name = "password")
	public WebElement newCustomerPassField;
	@FindBy(name = "sub")
	public WebElement submitFiled;

	public void NewCustomer(String name, String dob, String address,
			String city, String state, String pin, String mobileNumber,
			String username, String passwordOne) {
		newCustomerField.click();

		newcustomerNameField.sendKeys(name);
		newcustomerNameField.click();
		newCustomerDOBField.sendKeys(dob);
		newCustomerAddField.sendKeys(address);
		newCustomerCityField.sendKeys(city);
		newCustomerStateField.sendKeys(state);
		newCustomerPinNumberField.sendKeys(pin);
		newCustomerMoblileNumberField.sendKeys(mobileNumber);
		newCustomerEmailField.sendKeys(username);
		newCustomerPassField.sendKeys(passwordOne);
		submitFiled.click();

	}

}
