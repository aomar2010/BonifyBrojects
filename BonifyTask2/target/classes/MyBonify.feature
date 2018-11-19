Feature: login page to my.bonify.de 
	Description: in this feature the user will create new user then login to my.bonify.de 

Scenario: Register new user 
	Given Open chrome for register 
	When  Navigate to my.bonify.de to register 
	Then Click Neu registrieren 
	And fill the registeration form 
	Then Close the driver after registering 
	
	
Scenario: Login with the created user 
	Given Open chrome for login 
	When  Navigate to my.bonify.de to to login 
	Then Login with user email and Password 
	And logout from the application 
	Then Close the driver after login 
	
Scenario: Test Forget password 
	Given Open chrome to test forget password 
	When Navigate to my.bonify.de to forget password 
	Then click on Passwort vergessen 
	And complete the form of forget password 
	Then login to the email 
	And Open the required email to click on Jetzt passwort zurücksetzen 
	Then click on Passwort zurücksetzen 
	And complete the form of Neues Passwort 
	Then Close the driver after recovery the password 
	
	
	
