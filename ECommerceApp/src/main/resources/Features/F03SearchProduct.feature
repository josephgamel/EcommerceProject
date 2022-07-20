Feature: F03_SearchForProduct | users could search for product

  Background: User Should be Logged In


  Scenario: User Can Search for Product
    Given Enter Search Keyword
    And Navigated to Search Screen
    Then  Search Keyword is Displayed