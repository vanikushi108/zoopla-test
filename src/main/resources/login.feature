@login
Feature: Login to Albert
  As a user
  I want to be able to login into Albert quickly, easily and simply
  So that I can send lots of invoices to my clients

  Scenario: Login Using a valid email address and valid pin
    Given I click on Login
    And I enter valid email address
    And I click on Next button
    When I enter a valid pincode
    Then login occurs
    And I access my user account.


