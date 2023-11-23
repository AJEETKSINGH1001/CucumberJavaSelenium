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

Feature: User Login

  Scenario: User logs in with valid credentials
    Given the user is on the login page
    When the user enters valid username <student> and password <Password123>
    And clicks the login button
    Then the user should be redirected to the home page
    And the user should see a welcome message
    
        Examples:
      | username  | password    |
      | john_doe   | password123 |
      | student | Password123 |
   
