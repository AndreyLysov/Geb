@LogInForm
Feature: Loggining in

  Background:
    Given  open admin portal login page

  Scenario: Log in with valid credentials
    When log in with credentials
      | Fields   | Values              |
      | email    | admin@crewportal.cp |
      | password | 1                   |
    Then user is on the Adonis Personnel Portal page

  Scenario: Log off from start page
    When log in with credentials
      | Fields   | Values              |
      | email    | admin@crewportal.cp |
      | password | 1                   |
    Then user is on the Adonis Personnel Portal page
    When click the "Log off" button
    Then user is on the admin portal login page

  Scenario: Log in with spaces
    When enter " " into the email field
    And enter " " into the password field
    And click the "Log In" button
    Then invalid credentials message is displayed

  Scenario Outline: Log in with invalid credentials
    When enter "<Email>" into the email field
    And enter "<Password>" into the password field
    And click the "Log In" button
    Then invalid credentials message is displayed

    Examples:
      | Email                | Password |
      | admin1@crewportal.cp | 1        |
      | admin@crewportal.cp  | 11       |