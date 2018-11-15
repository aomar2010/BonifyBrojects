package common;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;

import PageObjects.pomHomePage;
import PageObjects.pomRegister;
import resources.TestBase;
import resources.propertiesFile;
/*
 * this class will handle the common parameters 
 * Author Ahmed Omar
 * Aomar2010@gmail.com
 */

public class SharedMethod extends TestBase {

	protected propertiesFile config = new propertiesFile();
	public static String email = RandomStringUtils.randomAlphabetic(10).toLowerCase() + "@gmail.com";
	public static String firstName = RandomStringUtils.randomAlphabetic(10).toLowerCase();
	public static String lastName = RandomStringUtils.randomAlphabetic(10).toLowerCase();
	public static String dateOfBirth = "01.01.1984";
	public static String street = RandomStringUtils.randomAlphabetic(5).toLowerCase();
	public static String houseNumber = RandomStringUtils.randomAlphabetic(5).toLowerCase();
	public static int zipeCode = (int) ((Math.random() * 100000) + 99999);
	public static String city = RandomStringUtils.randomAlphabetic(5).toLowerCase();
	public pomRegister register = new pomRegister(driver);

	// row used to get the email which contains the password recovery email
	public static WebElement row;
	// Email subject which will be opened to recover the password from gmail
	String subject = "Passwort zurücksetzen";

	public SharedMethod() {

	}

	@Override
	public void logMeout() {
		pomHomePage homePage = new pomHomePage(driver);

		homePage.clickMenu().clickLogout();
		log.info("-------- Logout from the application  ");

	}

}
