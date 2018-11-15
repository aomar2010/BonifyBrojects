package PageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import common.SharedMethod;

/*
 * this class will contain the page factor of mobilfunk
 * Author Ahmed Omar
 * Aomar2010@gmail.com
 */

public class pomMobilfunk extends SharedMethod {

	public pomMobilfunk(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// find mobileFunk
	@FindBy(how = How.XPATH, using = "//*[@id=\"/my-products/mobile\"]")
	public WebElement mobileFunk;

	// find mobileFunk
	@FindBy(how = How.XPATH, using = "//div[2]/section/section/iframe")
	public WebElement mobileFunkIfram;
	// find mobileFunk
	@FindBy(how = How.XPATH, using = "//*[@name='deviceid']")
	public WebElement model;

	// find Storage
	@FindBy(how = How.XPATH, using = "//*[@name='device_memory']")
	public WebElement storage;

	// find submit
	@FindBy(how = How.XPATH, using = "//*[@value='Tarife vergleichen']")
	public WebElement submit;

	// find all devices name
	@FindBy(how = How.XPATH, using = "//*[@class='ca_lg-12 ca_md-12 ca_sm-12 ca_divece-name'][contains(text(), 'Samsung Galaxy Note 9')]")
	public List<WebElement> devices;

	// click MobileFunk
	public void clickFunk() {

		mobileFunk.click();
	}

	// move to Ifram of MobileFunk
	public void getFunkIfram() {

		try {
			assertAndVerifyElement(By.xpath("//section[@class='iframe-container']/iframe"));
			WebElement iFrame = driver.findElement(By.xpath("//section[@class='iframe-container']/iframe"));
			driver.switchTo().frame(iFrame);
			assertAndVerifyElement(By.xpath(
					"//iframe[@src='https://tools.communicationads.net/calc.php?tp=dif&cl=bundle&h=1&wf=10865&country=DE&subid=395223']"));
			WebElement iFrame2 = driver.findElement(By.xpath(
					"//iframe[@src='https://tools.communicationads.net/calc.php?tp=dif&cl=bundle&h=1&wf=10865&country=DE&subid=395223']"));
			driver.switchTo().frame(iFrame2);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// select the device
	public void selectDevice() {

		Select titleSelector = new Select(model);

		titleSelector.selectByVisibleText(config.getDeviceName());
	}

	// select the Storage
	public void selectStorage() {

		Select titleSelector = new Select(storage);

		titleSelector.selectByVisibleText(config.getDeviceStorage());
	}

	// click submit
	public void clickSubmit() {

		submit.click();
	}

	// Get all devices
	public void getDevicesList() {
		int i = 0;
		for (WebElement element : devices) {
			List<WebElement> mightHaveSomeDiv = element.findElements(By.xpath(
					"//*[@class='ca_lg-12 ca_md-12 ca_sm-12 ca_divece-name'][contains(text(), 'Samsung Galaxy Note 9')]"));

			if (mightHaveSomeDiv.size() > 0) {
				i++;
				String myText = mightHaveSomeDiv.get(0).getText();
				Assert.assertEquals(myText, config.getDeviceText());

				System.out.println(i + " " + myText);
			} else {
				System.out.println("there is no available data ");
			}
		}
	}
}
