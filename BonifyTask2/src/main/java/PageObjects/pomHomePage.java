package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import common.SharedMethod;

/*
 * this class will contain the page factor for Bonify home page 
 * Author Ahmed Omar
 * Aomar2010@gmail.com
 */

public class pomHomePage extends SharedMethod {

	public pomHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// find welcome text
	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'schön Dich zu sehen!')]")
	public WebElement welcome;
	// find user menu
	@FindBy(how = How.XPATH, using = "//*[@class='right ico-bonify-expand']")
	private WebElement menu;

	// find logout button
	@FindBy(how = How.XPATH, using = "//*[@class='dropdown-item'][4]")
	private WebElement logout;

	// click menu button
	public pomHomePage clickMenu() {
		this.menu.click();
		return this;
	}

	// click logout button
	public void clickLogout() {

		logout.click();
	}
}
