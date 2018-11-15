Feature: assert mobile devices which appeared are related to the search filters 
Description: in this feature the user will assure the filter of mobiles is showing the correct devices 

	
Scenario: assert the filtering by mobile name and storage is showing the correct devices  
	Given Open chrome for login  
	When  Navigate to my.bonify.de
	Then Login with user email and Password
	And click Angebote
	Then Click Mobilfunk
	And Select Modell
    Then Select Speicherplatz
    And Click Tarife vergleiche 
    Then  assert the correct devices are appeared 
    And Close the driver
	

	
	 
	
