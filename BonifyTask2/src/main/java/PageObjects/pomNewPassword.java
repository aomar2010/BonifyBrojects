package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import common.SharedMethod;

/*
 * this class will contain the page factor for Change password page
 * Author Ahmed Omar
 * Aomar2010@gmail.com
 */

public class pomNewPassword extends SharedMethod {
	WebDriver driver;

	public pomNewPassword(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// find New password
	@FindBy(how = How.XPATH, using = "//*[@class='btn-flat-cta btn-flat-cta-alert']")
	private WebElement newPassword;

	// find type New password
	@FindBy(how = How.NAME, using = "password")
	private WebElement typrNewPassword;
	// find retype New password
	@FindBy(how = How.NAME, using = "passwordConfirm")
	private WebElement retypeNewPassword;
	// find retype New password
	@FindBy(how = How.XPATH, using = "//*[@class='btn-flat-cta btn-flat-cta-default']")
	private WebElement setPassword;

	// click on new password
	public void clickPasswordLink() {
		newPassword.click();
	}

	// type New password
	public void typeNewPassword() {
		typrNewPassword.sendKeys(config.getBonifyPassword());
	}

	// type New password
	public void retypeNewPassword() {
		retypeNewPassword.sendKeys(config.getBonifyPassword());
	}

	// click set password
	public void clickSetPassword() {
		setPassword.click();
	}
}
