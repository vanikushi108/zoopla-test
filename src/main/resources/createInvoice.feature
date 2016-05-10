@invoice
Feature: create Invoice
  As a user
  I want to be able to create invoice in Albert quickly, easily and simply
  So that I can recieve money from my clients

  Scenario: create Invoice
    Given I click on Login
    And I enter valid email address
    And I click on Next button
    When I enter a valid pincode
    Then login occurs
    When I click on add invoice button
    Then I should see new invoice page
    And I add ammount GBP "1000"
    And I add invoice description as "New Test Invoice"
    And I add recipent name
    Then I enter recipient name as Century Innovations Ltd
    And I add recipients email as "vanikushi@mailinator.com"
    When I click on send button
    Then Client should receive invoice


