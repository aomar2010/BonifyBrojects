package StepDefinition;

import java.io.IOException;

import PageObjects.pomLoginPage;
import PageObjects.pomNewPassword;
import PageObjects.pomReadGmailBody;
import common.SharedMethod;
import common.commonForgetPassword;
import common.commonGmailLogin;
import common.commonGmailSearchEmail;
import common.commonLogin;
import common.commonRegisterUser;
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

	@Given("^Open chrome for register$")
	public void open_the_Chrome_and_launch_the_application_For_Register() throws Throwable {
		System.out.println("This Step open the chrome and launch the application.");
		driver = initializeDriver();
	}

	@When("^Navigate to my.bonify.de to register$")
	public void navigate_To_The_Site_To_Register() throws Throwable {
		System.out.println("This step user navigate to my.bonify.de .");
		driver.navigate().to(config.geturl());
	}

	@And("^Click Neu registrieren$")
	public void click_Register() throws IOException, InterruptedException {
		pomLoginPage login = new pomLoginPage(driver);
		login.ClickRegister();

	}

	@Then("^fill the registeration form$")
	public void fill_Registration_Form() throws IOException, InterruptedException {
		commonRegisterUser registerNew = new commonRegisterUser();
		registerNew.registerMe();
	}

	@Then("^Close the driver after registering$")
	public void close_The_Driver() throws Throwable {
		driver.quit();
		driver = null;

	}
	// Scenario: Login with the created user

	@Given("^Open chrome for login$")
	public void Login_To_Bonify() throws Throwable {
		System.out.println("This Step open the chrome and launch the application.");
		driver = initializeDriver();
	}

	@When("^Navigate to my.bonify.de to to login$")
	public void navigate_To_The_Site_To_Login() throws Throwable {
		System.out.println("This step user navigate to my.bonify.de .");
		driver.navigate().to(config.geturl());
	}

	@Then("^Login with user email and Password$")
	public void Type_Username_And_Password_And_Login() throws IOException, InterruptedException {
		commonLogin login = new commonLogin();
		login.logMeIn(email, config.getEmailPassword());

	}

	@And("^logout from the application$")
	public void Logout_From_The_Application() throws IOException, InterruptedException {
		System.out.println("This step User types user email and password.");
		logMeout();
	}

	@Then("^Close the driver after login$")
	public void close_The_Driver_After_Login() throws Throwable {
		driver.quit();
		driver = null;

	}

	// Scenario: Forget Password
	@Given("^Open chrome to test forget password$")
	public void open_The_Browser() throws Throwable {
		System.out.println("This Step open the chrome and launch the application.");
		driver = initializeDriver();
	}

	@When("^Navigate to my.bonify.de to forget password$")
	public void navigate_To_The_Site_To_Forget_Password() throws Throwable {
		System.out.println("This step user navigate to my.bonify.de .");
		driver.navigate().to(config.geturl());
	}

	@Then("^click on Passwort vergessen$")
	public void navigate_To_Forget_Password_Page() throws IOException, InterruptedException {
		pomLoginPage login = new pomLoginPage(driver);
		login.ClicfPassword();

	}

	@And("^complete the form of forget password$")
	public void complete_The_Form_Of_Forget_Password() throws IOException, InterruptedException {
		commonForgetPassword forgetPassword = new commonForgetPassword();
		forgetPassword.forgetPassword(config.getUserEmail());
	}

	@Then("^login to the email$")
	public void login_To_The_Email() throws IOException, InterruptedException {
		driver.navigate().to("http://gmail.com");
		commonGmailLogin gmail = new commonGmailLogin();
		gmail.gmailLogin(config.getUserEmail(), config.getEmailPassword());
	}

	@And("^Open the required email to click on Jetzt passwort zurücksetzen$")
	public void open_Email_and_Open_The_Form() throws IOException, InterruptedException {
		commonGmailSearchEmail searchForTheEmail = new commonGmailSearchEmail();
		searchForTheEmail.searchForGmailEmail();
	}

	@Then("^click on Passwort zurücksetzen$")
	public void click_On_Password_Recovery() throws IOException, InterruptedException {
		pomReadGmailBody readGmail = new pomReadGmailBody(driver);
		readGmail.clickPasswordLink();
	}

	@And("^complete the form of Neues Passwort$")
	public void completeTheForm() throws IOException, InterruptedException {
		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		pomNewPassword newp = new pomNewPassword(driver);
		newp.clickPasswordLink();
		commonForgetPassword password = new commonForgetPassword();
		password.changePassword();
	}

	@Then("^Close the driver after recovery the password$")
	public void closeTheDriverAfterRecovery() throws Throwable {
		driver.quit();
		driver = null;

	}

}