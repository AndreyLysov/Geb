@loggingIn
Feature: Loggining in

  Scenario: Log in with valid credentials
    Given admin portal '5' login page
    When enter 'admin@crewportal.cp' into the email field
    And enter '1' into the password field
    And click the 'Log In' button
    Then user is on the Adonis Personnel Portal page