


package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/*
 * this class will contain the page factor for Gmail login page
 * Author Ahmed Omar
 * Aomar2010@gmail.com
 */

public class pomGmailLoginPage {

	WebDriver driver;

	public pomGmailLoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//*[@id='identifierId']")
	private WebElement userName;

	@FindBy(how = How.XPATH, using = "//*[@id='identifierNext']/content/span")
	private WebElement next;

	@FindBy(how = How.XPATH, using = "//*[@id='password']/div[1]/div/div[1]/input")
	private WebElement password;

	@FindBy(how = How.XPATH, using = "//*[@id='passwordNext']/content/span")
	private WebElement nextPassword;

	@FindBy(how = How.XPATH, using = "//*[@jsname='B34EJ'][@class='dEOOab RxsGPe'][1]")
	private WebElement wrongPassword;

	// get username
	public void typeUsername(String userName) {
		this.userName.sendKeys(userName);
	}

	// return Next
	public void clickNext() {
		this.next.click();

	}

	// return password
	public void typePassword(String password) {

		this.password.sendKeys(password);
	}

	// return next button after password
	public void clickNextPassword() {

		this.nextPassword.click();
	}

	// wrong password

	// get username
	public boolean getWrongPassword() {
		boolean crd = this.wrongPassword.isDisplayed();
		return this.wrongPassword.isDisplayed();
	}

	// return Worng Password
	public void setWrongPassword() {
		this.wrongPassword.isDisplayed();

	}

}
