package common;

/*
 * this class will create a new user  with random email
 * Author Ahmed Omar
 * Aomar2010@gmail.com
 */
public class commonRegisterUser extends SharedMethod {

	public commonRegisterUser() {

	}

	@Override
	public void registerMe() {

		log.info("-------- Type Sender ID and password ");
		register.typeUsername(email);
		register.typePassword(config.getEmailPassword());
		register.clickRegister();
		log.info("-------- Move to the ideintification page  ");
		register.clickgender();
		register.getTitle();
		register.typeFirstNamed(firstName);
		register.typelasttNamed(lastName);
		register.typeDateOfBirth(dateOfBirth);
		register.typeStreet(street);
		register.typeHouseNumber(houseNumber);
		register.typeZipCode(Integer.toString(zipeCode));
		register.typeCity(city);
		register.clickNext();
		log.info("-------- End of registering process  ");

	}
}
