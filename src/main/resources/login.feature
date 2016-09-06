@login
Feature: Login to Albert iOS App
  As a user
  I want to be able to login into Albert native App quickly, easily and simply
  So that I can send lots of invoices to my clients

  Scenario: Login to Albert App Using a valid email address and valid pin
    Given I click on Login
    And I enter valid email address
    And I click on Next button
    When I enter a valid pincode

