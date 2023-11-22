#Author: ajeet.singh@gamechangesolutions.com
#Keywords Summary : Testing search features
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

Feature: Google Search

  Scenario: User searches for a text on Google
    Given the user is on the Google homepage
    When the user enters the search text "Gamechange Solutions" in the search textbox
    And clicks the search button
    Then the user should see search results related to "Gamechange Solutions"

