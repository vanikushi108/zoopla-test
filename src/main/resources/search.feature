@search
Feature: E:Fundamentals Search
  AS A User
  I WANT TO perform a search using the google search engine for the term E:Fundamentals
  SO THAT I can investigate the returned search results

  Scenario: A user searches for E:Fundamentals
    Given I am on the google search page
    When I search for the term "E Fundamentals"
    Then the E Fundamentals company website link is returned within the results
