package common;

import PageObjects.pomForgetPassword;
import PageObjects.pomNewPassword;

/*
 * this class will handle all the operation related to forgetting the password  
 * Author Ahmed Omar
 * Aomar2010@gmail.com
 */
public class commonForgetPassword extends SharedMethod {

	public commonForgetPassword() {
	}

	/*
	 * this method will type the email which forget the password then send the email
	 * Author Ahmed Omar Aomar2010@gmail.com
	 */
	@Override
	public void forgetPassword(String email) {
		pomForgetPassword forgetPassword = new pomForgetPassword(driver);
		forgetPassword.typeUsername(config.getUserEmail()).clickSend();

	}

	/*
	 * this method will type the new password Author Ahmed Omar Aomar2010@gmail.com
	 */
	@Override
	public void changePassword() {
		pomNewPassword newPassword = new pomNewPassword(driver);

		newPassword.typeNewPassword();
		newPassword.retypeNewPassword();
		newPassword.clickSetPassword();
	}
}
