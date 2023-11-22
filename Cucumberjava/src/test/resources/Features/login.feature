

@Smoketest
Feature: User Login

  Scenario: User logs in with valid credentials
    Given the user is on the login page
    When the user enters valid username "john_doe" and password "password123"
    And clicks the login button
    Then the user should be redirected to the home page
    And the user should see a welcome message
