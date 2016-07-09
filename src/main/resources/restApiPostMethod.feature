
Feature: rest api post feature
  As a user
  I want to be able to access rest api post
  So that I can post required information

  @restPost
  Scenario: rest api post method feature
    Given I access rest api post method1


  Scenario: rest api post method feature with wrong url
    Given I access rest api post method with wrong url
    Then We should see 404 for post method for wrong url

  Scenario Outline: rest api post method feature
    Given Rest API Post generate JSON from Hash Map "<midValue>", "<invoice>", "<firstName>", "<lastName>", "<businessName>", "<sortCode>", "<accountNum>", "<netAmount>"
    Examples:
      | midValue | invoice | firstName | lastName | businessName | sortCode | accountNum | netAmount |
      | 100001   | CEN1001 | Vanitha   | Kasala   | CenturyIn    | 111111   | 11112222   | 10000     |





