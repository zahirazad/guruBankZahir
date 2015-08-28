package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {
	@FindBy(name = "uid")
	public WebElement userIdField;

	@FindBy(name = "password")
	public WebElement userPasswordField;

	@FindBy(name = "btnLogin")
	public WebElement loginButton;

	@FindBy(name = "btnReset")
	public WebElement resetButton;

	@FindBy(id = "message23")
	public WebElement blankMessageUserID;

	@FindBy(id="message18")
	 public WebElement blankMessagePassword;

	@FindBy(linkText = "here")
	public WebElement generateAccessLink;

	public void signIn(String username, String password) {
		resetButton.click();
		userIdField.sendKeys(username);
		userPasswordField.sendKeys(password);
		loginButton.click();
	}

}
