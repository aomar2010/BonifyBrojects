package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/*
 * this class will contain the page factor of Bonify login page 
 * Author Ahmed Omar
 * Aomar2010@gmail.com
 */

public class pomLoginPage {
	public WebDriver driver = null;

	public pomLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// find Email text box
	@FindBy(how = How.XPATH, using = "//*[@name='email']")
	private WebElement email;
	// find password text box
	@FindBy(how = How.XPATH, using = "//*[@name='password']")
	private WebElement password;
	// find login button
	@FindBy(how = How.XPATH, using = "//*[@type='submit']")
	private WebElement login;
	// find register button
	@FindBy(how = How.XPATH, using = "//*[@class='btn-flat-cta btn-flat-cta-alert']")
	private WebElement register;
	// find forget password button
	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'Passwort vergessen?')]")
	private WebElement fPassword;

	// type user email
	public void typeUsername(String email) {
		this.email.sendKeys(email);
	}

	// type password
	public void typePassword(String password) {
		this.password.sendKeys(password);
	}

	// click login
	public void ClickLogin() {
		this.login.click();
	}

	// click register
	public void ClickRegister() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("arguments[0].scrollIntoView;", register);
		this.register.click();

	}

	// click forget password
	public void ClicfPassword() {
		this.fPassword.click();
	}

}
