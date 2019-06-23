Feature: Add Employee
  I want to use this to add an Employee

  Background: 
    Given I logged in into OrangeHrm
    When I click on PIM link
    And I click on Add Employee
	
  @addEMployee
  Scenario Outline: Adding an employee
    And I provide Employee name "<eName>" and "<lName>" and "<location>"
    And I click on next
    Then I see employee is added successfully

    Examples: 
      | eName  | lName   | location            |
      | Al     | Ventura | France Regional     |
      | Kathy  | Mendez  | Canadian Regional   |
      | Carlos | Lopez   | Australian Regional |
      
	@smoke
  Scenario Outline: Add mployee and Create Login Details
    When I click on Create Credentials
    And I provide Employee name "<eName>" and "<lName>" and "<location>" and "<username>" and "<password>" and "<confirmP>"
    And I click and select Status and ESSRole and SupRole and AdminRole
    And I click on next
    Then I see employee is added successfully

    Examples: 
      | eName  | lName   | location            | username | password      | confirmP      |
      | Al     | Ventura | France Regional     | alven    | alvaroventura | alvaroventura |
      | Kathy  | Mendez  | Canadian Regional   | katMen   | kathymendez   | kathymendez   |
      | Carlos | Lopez   | Australian Regional | carlopez | carloslopez   | carloslopez      |

  @temp
  Scenario: Add employee Labels Verification
    Then I see following labels
      | First Name  |
      | Last Name   |
      | Employee Id |
      | Location*    |
