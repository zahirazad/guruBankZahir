package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MiniStatementPage {
	@FindBy(xpath = "html/body/div[2]/div/ul/li[13]/a")
	public WebElement MinistatementPageField;
	@FindBy(name = "accountno")
	public WebElement AccountNumberField;
	@FindBy(name = "AccSubmit")
	public WebElement AccountsubmitField;
	@FindBy(xpath = "html/body/table/tbody/tr[1]/td/p")
	public WebElement GetTextField;
	@FindBy(xpath = ".//*[@id='ministmt']/tbody/tr[3]/td/a")
	public WebElement GoHomePage;

	public void MiniStats() {
		MinistatementPageField.click();
		AccountNumberField.sendKeys("7390");
		AccountsubmitField.click();
		// GetTextField.getText();
		GoHomePage.click();

	}
}
