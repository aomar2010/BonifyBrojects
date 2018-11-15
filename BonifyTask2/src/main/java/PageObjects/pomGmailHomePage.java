package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import common.SharedMethod;
/*
 * this class will contain the page factor for Gmail home page
 * Author Ahmed Omar
 * Aomar2010@gmail.com
 */

public class pomGmailHomePage extends SharedMethod {

	public pomGmailHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// find compose button
	private List<WebElement> listEmails;

	public List<WebElement> getEmails() {
		this.listEmails = driver.findElements(By.xpath("//span[@class='bog']"));
		return this.listEmails;
	}

}
