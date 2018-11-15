package common;

import PageObjects.pomLoginPage;

/*
 * this class will contain all the login methods 
 * Author Ahmed Omar
 * Aomar2010@gmail.com
 */
public class commonLogin extends SharedMethod {

	public commonLogin() {
	}
/*
 * login method with two parameters User Email and password 
 */
	@Override
	public void logMeIn(String email, String password) {
		pomLoginPage login = new pomLoginPage(driver);
		log.info("-------- Type Sender ID and password ");
		login.typeUsername(email);
		login.typePassword(password);
		login.ClickLogin();
	}
}
