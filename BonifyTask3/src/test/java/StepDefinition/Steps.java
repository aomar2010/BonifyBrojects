package StepDefinition;

import java.io.IOException;

import PageObjects.pomHomePage;
import PageObjects.pomMobilfunk;
import common.SharedMethod;
import common.commonLogin;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*
 * this class will contain the testing steps depending on the cucumber feature file features>MyBonify.feature 
 * Author Ahmed Omar
 * Aomar2010@gmail.com
 */

public class Steps extends SharedMethod {

	@Given("^Open chrome for login$")
	public void open_the_Chrome_and_launch_the_application_For_Login() throws Throwable {
		System.out.println("This Step open the chrome and launch the application.");
		driver = initializeDriver();
	}

	@When("^Navigate to my.bonify.de$")
	public void navigate_To_The_Site() throws Throwable {
		System.out.println("This step user navigate to my.bonify.de .");
		driver.navigate().to(config.geturl());
	}

	@Then("^Login with user email and Password$")
	public void login_To_The_App() throws IOException, InterruptedException {
		commonLogin login = new commonLogin();
		login.logMeIn(config.getUserEmail(), config.getpasswotd());
	}

	@And("^click Angebote$")
	public void click_Deals() throws IOException, InterruptedException {
		pomHomePage homePage = new pomHomePage(driver);
		homePage.clickDeals();
	}

	@Then("^Click Mobilfunk$")
	public void click_Mobilfunk() throws Throwable {
		Thread.sleep(5000);
		pomMobilfunk mobFunk = new pomMobilfunk(driver);

		mobFunk.clickFunk();
		mobFunk.getFunkIfram();

	}

	@And("^Select Modell$")
	public void select_Modell() throws Throwable {
		pomMobilfunk mobFunk = new pomMobilfunk(driver);

		mobFunk.selectDevice();

	}

	@Then("^Select Speicherplatz$")
	public void click_Storage() throws Throwable {
		pomMobilfunk mobFunk = new pomMobilfunk(driver);

		mobFunk.selectStorage();

	}

	@And("^Click Tarife vergleiche$")
	public void click_Compare() throws Throwable {
		pomMobilfunk mobFunk = new pomMobilfunk(driver);

		mobFunk.clickSubmit();

	}

	@Then("^assert the correct devices are appeared$")
	public void assert_Devices() throws Throwable {
		pomMobilfunk mobFunk = new pomMobilfunk(driver);

		Thread.sleep(12000);
		mobFunk.getDevicesList();

	}

	@And("^Close the driver$")
	public void closeTheDriver() throws Throwable {
		driver.quit();
		driver = null;

	}

}