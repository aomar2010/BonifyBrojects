package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/*
 * this class will contain the page factor for forget password page
 * Author Ahmed Omar
 * Aomar2010@gmail.com
 */
public class pomForgetPassword {

	public pomForgetPassword(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// find Email textbox
	@FindBy(how = How.XPATH, using = "//*[@name='email']")
	private WebElement email;
	// find send button
	@FindBy(how = How.XPATH, using = "//*[@class='btn-flat-cta btn-flat-cta-default']")
	private WebElement send;
	// find login button
	@FindBy(how = How.XPATH, using = "//*[@class='btn-flat btn-flat-negative']")
	private WebElement login;

	// type user email
	public pomForgetPassword typeUsername(String email) {
		this.email.sendKeys(email);
		return this;
	}

	// send the email
	public void clickSend() {
		this.send.click();
	}

}
