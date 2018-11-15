package resources;

import org.openqa.selenium.By;

public interface DesignInterface {
	/**
	 * 
	 * Interface class
	 *
	 */

	public default void logMeIn(String username, String password) {

	}

	public default void forgetPassword(String emailto) {

	}

	public default void logMeout() {

	}

	public default void registerMe() {

	}

	public default void confirmLogin() {

	}

	public default void assertAndVerifyElement(By element) throws InterruptedException {

	}

}
