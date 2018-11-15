package common;

import org.junit.Assert;
import org.openqa.selenium.By;

import PageObjects.pomHomePage;
import PageObjects.pomLoginPage;
import resources.TestBase;
import resources.propertiesFile;

public class SharedMethod extends TestBase {

	boolean logedStatus;

	protected propertiesFile config = new propertiesFile();
	public pomLoginPage login = new pomLoginPage(driver);

	public SharedMethod() {

	}

	@Override
	public void logMeout() {
		pomHomePage homePage = new pomHomePage(driver);

		homePage.clickMenu().clickLogout();
		log.info("-------- Logout from the application  ");

	}

	@Override
	public void assertAndVerifyElement(By element) throws InterruptedException {
		boolean isPresent = false;

		for (int i = 0; i < 6; i++) {
			try {
				if (driver.findElement(element) != null) {
					isPresent = true;
					break;
				}
			} catch (Exception e) {
				// System.out.println(e.getLocalizedMessage());
				Thread.sleep(1000);
			}
		}
		Assert.assertTrue("\"" + element + "\" is not present.", isPresent);
	}

}
