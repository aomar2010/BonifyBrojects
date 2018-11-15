package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
/*
 * this class will contain the page factor for Gmail reading the emails  
 * Author Ahmed Omar
 * Aomar2010@gmail.com
 */
public class pomReadGmailBody {
	WebDriver driver;

	public pomReadGmailBody(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// find Body
	@FindBy(how = How.XPATH, using = "//*[@bgcolor='#f36d08']")
	private WebElement LblBody;

	// return Subject
	public void clickPasswordLink() {
		LblBody.click();
	}

}