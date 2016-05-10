@signup
Feature: Sign up to Albert
  As a User
  I want to sign up to Albert to be quick, simple and friendly.
  So that I can feel confident in sending lots of invoices.

  Background:
  I open Albert App on Similator

  Scenario Outline: Sign up to Albert as a new user
    Given I click on sign up
    And I enter unregistered email address as "<email>"
    And I click on Next button
    Then I should be prompted to enter pincode as "<pin>"
    And  I add my business name as "<business>"
    Then I should see notification to get started
    Examples:
      | email  | pin  | business                |
      | random | 1111 | Century Innovations Ltd |

