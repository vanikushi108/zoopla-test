@search
Feature: Zoopla Search
  AS A User
  I WANT TO perform a search using the Zoopla
  SO THAT I can see rented properties

  Scenario: A user searches for rented properties on Zoopla
    Given I am on the zoopla home page
    And I click on To rent tab
    And I Enter "Portsmouth" in the Search field
    And I Select Min rent to "£500 pcm"
    And I Select Max rent to "£2,000 pcm"
    And I Select Property type  as "Flats"
    When I Click on Search button
    Then I see properties displayed are to rent in "Portsmouth"
    And I see the default list view as "true"
    And I see the grid view as "false"
    And I see the map view as "false"
