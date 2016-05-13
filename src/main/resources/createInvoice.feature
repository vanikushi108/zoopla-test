@invoice
Feature: create Invoice
  As a user
  I want to be able to create invoice in Albert quickly, easily and simply
  So that I can recieve money from my clients

  Scenario: create Invoice with out bank details
    Given I click on Login
    And I enter valid email address
    And I click on Next button
    When I enter a valid pincode
    Then login occurs
    When I click on add invoice button
    Then I should see new invoice page
    And I add amount GBP "100000"
    And I add invoice description as "New Test Invoice"
    And I add recipient name
    Then I enter recipient name as Century Innovations Ltd
#    And I add recipients email as "vanikushi@mailinator.com"
    When I click on send button
    Then I click on Alert No Send Now
    Then Client should receive invoice

  Scenario Outline: create Invoice with bank details
    Given I click on sign up
    And I enter unregistered email address as "<email>"
    And I click on Next button
    Then I should be prompted to enter pincode as "<pin>"
    And  I add my business name as "<business>"
    And I wait for 20 seconds
    And I click on button Finish
    And I wait for 20 seconds
    And I click on GET STARTED
    When I click on add invoice button
    Then I should see new invoice page
    And I add amount GBP "100000"
    And I add invoice description as "New Test Invoice"
    And I add recipient name
    And I wait for 5 seconds
    Then I enter recipient name as Century Innovations Ltd
    And I add recipients email as "vanikushi@mailinator.com"
    When I click on send button
    Then I click on Alert Yes add info
    And click on VAT
    And I select vat as ON
    And I enter vat number
    And I click on save button
    And I click on done
    Then I click on Bank Account
    And I add my bank account number
    And I add my bank sort code
    And I click on save button
    And I click on done
    And I click on close button
    When I click on send button
    And I wait for 60 seconds
    Then Client should receive invoice
  Examples:
  | email  | pin  | business                |
  | random | 1111 | Century Innovations Ltd |

