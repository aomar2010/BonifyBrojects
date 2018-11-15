package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * this class will handle the properties file which contains the main parameters    
 * Author Ahmed Omar
 * Aomar2010@gmail.com
 */
public class propertiesFile {

	//
	String email;
	String browSerName;
	String targetUrl;
	String emailPassword;
	String implicitlyWait;
	String driverPath;
	String reportConfigPath;
	String ScreenShots;
	String bonifyPassword;

	//
	public propertiesFile() {

		String ar[] = new String[5];
		Properties prop = new Properties();
		FileInputStream input = null;
		try {

			input = new FileInputStream(".\\resources\\config.properties");

			// load a properties file
			prop.load(input);

			// get the property value from properties file
			setUserEmail(prop.getProperty("userEmail"));
			setbrowser(prop.getProperty("browser"));
			seturl(prop.getProperty("url"));
			setEmailPassword(prop.getProperty("emailPassword"));
			setBonifyPassword(prop.getProperty("bonifyPassword"));
			setimplicitlyWait(prop.getProperty("implicitlyWait"));
			setChromedriverPath(prop.getProperty("driverPath"));
			setReportPath(prop.getProperty("reportConfigPath"));
			setScreenShots(prop.getProperty("screenshotsPath"));
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	// method to set the chromedriver path
	public void setChromedriverPath(String driverpath) {
		this.driverPath = driverpath;

	}

	// method to get the chromedriver path
	public String getChromedriverpath() {

		return this.driverPath;

	}

	// method to set the implicitlyWait
	public void setimplicitlyWait(String implicitlyWait) {
		this.implicitlyWait = implicitlyWait;

	}

	// method to get the implicitlyWait
	public String getimplicitlyWait() {

		return this.implicitlyWait;

	}

	// method to set the URL
	private void seturl(String url) {
		this.targetUrl = url;
	}

	// method to get the URL
	public String geturl() {

		return this.targetUrl;

	}

	// method to set the browser
	public void setbrowser(String browser) {

		this.browSerName = browser;

	}

	// method to get the browser
	public String getbrowser() {
		return this.browSerName;
	}

	// method to set the email
	public void setUserEmail(String email) {

		this.email = email;
	}

	// method to get the browser
	public String getUserEmail() {
		return this.email;
	}

	// method to set the password
	public void setEmailPassword(String emailPassword) {

		this.emailPassword = emailPassword;
	}

	// method to get the browser
	public String getEmailPassword() {
		return this.emailPassword;
	}

	// method to set the reportConfigPath
	public void setReportPath(String reportConfigPath) {

		this.reportConfigPath = reportConfigPath;
	}

	// method to get the reportConfigPath
	public String getReportPath() {
		return this.reportConfigPath;
	}

	// method to set the reportConfigPath
	public void setScreenShots(String ScreenShots) {

		this.ScreenShots = ScreenShots;
	}

	// method to get the reportConfigPath
	public String getScreenShots() {
		return this.ScreenShots;
	}

	// method to set bonify password
	public void setBonifyPassword(String bonifyPassword) {

		this.bonifyPassword = bonifyPassword;
	}

	// method to get the browser
	public String getBonifyPassword() {
		return this.bonifyPassword;
	}

}
