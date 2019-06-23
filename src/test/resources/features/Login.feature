#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login to Hrm
  I want to use this template for my feature file

   
  Scenario: Valid credentials
   
 		Given I see the Orangehrm logo
 		When I enter correct credentials
 		And I click login
 		Then I see the Homepage
 	
 	
 	@regression @login
 	Scenario: Invalid login
    
 		Given I see the Orangehrm logo
 		When I enter incorrect credentials
 		And I click login
 		Then I see the error message
 		Then I close browser
 		
 		@smoke
 	Scenario: Error message Validation
 		
 		When I enter invalid username and password I see errorMessages
 		|userName|password|errorMessage|
 		|Admin1234	 |Admin123|Invalid Credentials|
		|Admin2222 |test123 |Invalid Credentials|
  	|Admin333|test12  |Invalid Credentials|
