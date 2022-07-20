@Smoke
Feature: F00_Register | users could register with new accounts

  Scenario: guest user could register with valid data successfully

    When  User Clicked Register
    And   User Fill Registration Form
    Then  User Registered Successfully






