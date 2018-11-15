package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
 *  this class will handle the properties file which contains the main parameters  
 * Author Ahmed Omar
 * Aomar2010@gmail.com
 */
public class propertiesFile {

	//
	String email;
	String browSerName;
	String targetUrl;
	String password;
	String implicitlyWait;
	String driverPath;
	String reportConfigPath;
	String ScreenShots;
	String deviceName;
	String deviceStorage;
	String deviceText;

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
			setpassword(prop.getProperty("password"));
			setimplicitlyWait(prop.getProperty("implicitlyWait"));
			setChromedriverPath(prop.getProperty("driverPath"));
			setReportPath(prop.getProperty("reportConfigPath"));
			setScreenShots(prop.getProperty("screenshotsPath"));
			setDeviceName(prop.getProperty("deviceName"));
			setDeviceStorage(prop.getProperty("deviceStirage"));
			setDeviceText(prop.getProperty("deviceText"));

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
	public void setpassword(String Password) {

		this.password = Password;
	}

	// method to get the browser
	public String getpasswotd() {
		return this.password;
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

	// method to set the Devicename
	public void setDeviceName(String deviceName) {

		this.deviceName = deviceName;
	}

	// method to get the Devicename
	public String getDeviceName() {
		return this.deviceName;
	}

	// method to set the Storage
	public void setDeviceStorage(String deviceStorage) {

		this.deviceStorage = deviceStorage;
	}

	// method to get the Storage
	public String getDeviceStorage() {
		return this.deviceStorage;
	}

	// method to set the device text to compaire with the result
	public void setDeviceText(String deviceText) {

		this.deviceText = deviceText;
	}

	// method to get device text to compaire with the result
	public String getDeviceText() {
		return this.deviceText;
	}
}
