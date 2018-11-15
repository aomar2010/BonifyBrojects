Notes : 
1. I do not have a bank account in Germany, so I skipped "Identifizierung mit Bankkonto" 
 
The project main tools 
		1.Log4j 
		2.Maven 
		3.Cucumber
	    4.Cucumber report 
		4.Java version 1.8.0_191
	
Framework 
	   a hybrid between page factor model and BDD 


How to run the test 
	 
	1.open eclipse 
	2.click File > open project from file system 
	3.import the project (task2\BonifyTask2)
	4.wait for minutes till Maven download it's Independences , it may take 2 minutes
	5. once the project finish building, please update Maven project, right click the project > maven > update project 
	6. please make sure that the project's compiler is 1.8 , right click the project > properties> java compiler> uncheck JDK compliance > select 1.8  
	7.open src>test>java>my.bonify.de.task2>Runner.java.
	8. right click Runner.java and click Run As > JUnit Test
	9. after the test finish running, please open the report test-output>cucumber-reports>report.html

	
What does this Automation do?
	1.please, read features>MyBonify.feature (this the cucumber feature file ) and the steps class which exist in src>test>java>StepDefinition>steps.java
	2. I created 3 scenarios for the 3 features in login page (login, create a user, and forget the password)
	3. for forget password I had to create classes to access Gmail to restore the password 
	4. to know the common parameters please open resources>config.properties 
		
