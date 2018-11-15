package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/*
 * this class will contain the page factor for Bonify register page 
 * Author Ahmed Omar
 * Aomar2010@gmail.com
 */

public class pomRegister {

	public pomRegister(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// find Email text
	@FindBy(how = How.XPATH, using = "//*[@name='email']")
	private WebElement email;

	// find password text
	@FindBy(how = How.XPATH, using = "//*[@name='password']")
	private WebElement password;
	// find Kostenlos anmelden button
	@FindBy(how = How.XPATH, using = "//*[@class='btn-flat-cta btn-flat-cta-alert']")
	private WebElement register;
	// find user gender by male
	@FindBy(how = How.XPATH, using = "//*[@value='male']")
	private WebElement gender;
	// find title
	@FindBy(how = How.XPATH, using = "//*[@name='title']")
	private WebElement title;
	// find first name text
	@FindBy(how = How.XPATH, using = "//*[@name='firstName']")
	private WebElement firstName;

	// find last name text
	@FindBy(how = How.XPATH, using = "//*[@name='lastName']")
	private WebElement lastName;
	// find DateOfBirth text
	@FindBy(how = How.XPATH, using = "//*[@name='dateOfBirth']")
	private WebElement dateOfBirth;
	// find Street text
	@FindBy(how = How.XPATH, using = "//*[@name='street']")
	private WebElement street;
	// find houseNumber text
	@FindBy(how = How.XPATH, using = "//*[@name='houseNumber']")
	private WebElement houseNumber;
	// find city text
	@FindBy(how = How.XPATH, using = "//*[@name='city']")
	private WebElement city;
	// find zipCode
	@FindBy(how = How.XPATH, using = "//*[@name='zipCode']")
	private WebElement zipCode;

	// find Weiter button /Continue
	@FindBy(how = How.XPATH, using = "//*[@class='btn btn-warning']")
	private WebElement next;

	// type user email
	public void typeUsername(String email) {
		this.email.sendKeys(email);
	}

	// type password
	public void typePassword(String password) {
		this.password.sendKeys(password);
	}

	// Click Register
	public void clickRegister() {
		this.register.click();
	}

	// Click gender
	public void clickgender() {
		this.gender.click();
	}

	public void getTitle() {
		Select titleSelector = new Select(title);

		titleSelector.selectByVisibleText("Dr.");
	}

	// type first name
	public void typeFirstNamed(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	// type last name
	public void typelasttNamed(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	// type Date of birth
	public void typeDateOfBirth(String dateOfBirth) {
		this.dateOfBirth.sendKeys(dateOfBirth);
	}

	// type street
	public void typeStreet(String street) {
		this.street.sendKeys(street);
	}

	// type houseNumber
	public void typeHouseNumber(String houseNumber) {
		this.houseNumber.sendKeys(houseNumber);
	}

	// type zipCode
	public void typeZipCode(String zipCode) {
		this.zipCode.sendKeys(zipCode);
	}

	// type City
	public void typeCity(String city) {
		this.city.sendKeys(city);
	}

	// Click Next
	public void clickNext() {
		this.next.click();
	}
}
