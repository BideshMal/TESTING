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

Feature: Login functionality
 As a user I want to login so that I may use the app.

  Scenario Outline: Validate Login for different credentials.
    Given User on Login Page
    When User Types "<username>" and "<password>"
    Then Validate the login status

    Examples: 
      | username  | password | 
      | student1 |     pas1 |
      |	student3	|		 pas3	|
      | student2 |     pas2 |
