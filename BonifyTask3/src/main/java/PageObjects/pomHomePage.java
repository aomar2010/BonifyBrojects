package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import common.SharedMethod;

/*
 * this class will contain the page factor of Bonify home page 
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

	// find Deals - Angebote
	@FindBy(how = How.XPATH, using = "//*[@id='sidebar']/div/nav/ul[1]/li[4]/a")
	private WebElement deals;

	// click menu button
	public pomHomePage clickMenu() {
		this.menu.click();
		return this;
	}

	// click logout button
	public void clickLogout() {

		logout.click();
	}

	// click Deals
	public void clickDeals() {

		deals.click();
	}
}
