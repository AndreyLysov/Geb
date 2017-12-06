@loggingIn
Feature: Loggining in

  Scenario: Log in with valid credentials
    Given open admin portal login page
    When enter "admin@crewportal.cp" into the email field
    And enter "1" into the password field
    And click the 'Log In' button
    Then user is on the Adonis Personnel Portal page

  Scenario: Log in with invalid email
    Given open admin portal login page
    When enter "admin@crewportal.cp" into the email field
    And enter "11" into the password field
    And click the 'Log In' button
    Then invalid credentials message is displayed