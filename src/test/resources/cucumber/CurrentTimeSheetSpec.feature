@CurrentTimeSheet
Feature: Current Time Sheet

  Background:
    Given open crew portal login page
    And navigate to the current time sheet page

  Scenario: Add time registration
    Then user create new time registration
      | Fields   | Values              |
      | email    | admin@crewportal.cp |
      | password | 1                   |