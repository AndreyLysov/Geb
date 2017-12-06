@loggingIn
Feature: Loggining in


  Scenario: Log in with valid credentials
    Given open admin portal login page
    When enter "admin@crewportal.cp" into the email field
    And enter "1" into the password field
    And click the 'Log In' button
    Then user is on the Adonis Personnel Portal page

  Scenario: Log off
    Given open admin portal login page
    When enter "admin@crewportal.cp" into the email field
    And enter "1" into the password field
    And click the 'Log In' button
    Then user is on the Adonis Personnel Portal page
    When click the 'Log off' button
    Then user is on the admin portal login page

  Scenario: Log in with invalid email
    Given open admin portal login page
    When enter "admin1@crewportal.cp" into the email field
    And enter "1" into the password field
    And click the 'Log In' button
    Then invalid credentials message is displayed

  Scenario: Log in with invalid password
    Given open admin portal login page
    When enter "admin@crewportal.cp" into the email field
    And enter "11" into the password field
    And click the 'Log In' button
    Then invalid credentials message is displayed

  Scenario: Log in with spaces
    Given open admin portal login page
    When enter " " into the email field
    And enter " " into the password field
    And click the 'Log In' button
    Then invalid credentials message is displayed

