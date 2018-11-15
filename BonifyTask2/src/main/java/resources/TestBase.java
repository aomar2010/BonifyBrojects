package resources;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * this class will contain the main configuration of the test 
 * Author Ahmed Omar
 * Aomar2010@gmail.com
 */
abstract public class TestBase implements DesignInterface {

	public static WebDriver driver;
	public static Logger log = LogManager.getLogger(TestBase.class.getName());

	//
	String sender;
	String receiver;
	String browSerName;
	String targetUrl;
	protected String password;
	String implicitlyWait;
	String driverPath;
	//

	public WebDriver initializeDriver() throws IOException {

		propertiesFile file = new propertiesFile();
		// driver.manage().timeouts().implicitlyWait(Integer.parseInt(file.getimplicitlyWait()),
		// TimeUnit.SECONDS);

		if (file.getbrowser().equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", file.getChromedriverpath());
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--start-maximized");
			driver = new ChromeDriver(chromeOptions);
			// execute in chrome driver

		} else if (file.getbrowser().equals("firefox")) {
			driver = new FirefoxDriver();
			// firefox code
		} else if (file.getbrowser().equals("IE")) {
			// IE code
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

	public void getScreenshot(String result) throws IOException {
		propertiesFile config = new propertiesFile();

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(config.getScreenShots() + result + driver.getTitle() + ".jpg"));

	}

	public static String getReportConfigPath() {
		propertiesFile config = new propertiesFile();
		String reportConfigPath = config.getReportPath();

		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}

}
