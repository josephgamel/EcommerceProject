Feature: F04_SwitchCurrencies | users could switch currencies

  Background: User Should be Logged In
    When User Navigated to Log In Page
    And User Enter Valid Email and Password
    And User Clicked Log In Button
    Then User Logged In Successfully


  Scenario: User Can Switch between currencies
    Given User Select Currency Dropdown