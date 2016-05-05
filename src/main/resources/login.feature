@login
Feature: Login
  As a user
  I want to be able to login into Albert quickly, easily and simply
  So that I can send lots of invoices to my clients

  Scenario: Using a valid email and valid pin
    Given I tap on Login
    And I enter valid email address
    And I tap on Next button
    When I enter a valid pincode
    Then login successful


