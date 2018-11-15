package common;

import PageObjects.pomGmailHomePage;
/*
 *  this class for searching for the email in Gmail which contains the forget password link
 * Author Ahmed Omar
 * Aomar2010@gmail.com
 */

public class commonGmailSearchEmail extends SharedMethod {

	public commonGmailSearchEmail() {
	}

	// Search for the email with the subject 
	@Override
	public void searchForGmailEmail() {
		pomGmailHomePage homepage = new pomGmailHomePage(driver);
		System.out.println("Open email with Subject " + subject);
		for (int i = 0; i < homepage.getEmails().size(); i++) {
			if (homepage.getEmails().get(i).getText().contains("Passwort zurücksetzen")) {
				//
				row = homepage.getEmails().get(i);
				row.click();

			}

		}

	}

}
