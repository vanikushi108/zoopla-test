@tododuplicate
  Feature:ToDoList
    As a user
    I want to send my invoice i must be able to see my todo list
    So I can review my invoices
    Scenario Outline: I need to check my ToDolist
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
      #And I wait for 60 seconds
#      #Then Client should receive invoice
      When I see the Todolist button
      When I tap on my Invoice number
      Then I should see Invoice details page
      And I see more button on  my Invoice Page
      When I click on more button
      When I see Duplicate Button
      And I click on Duplicate Button

      #And I click on send button
      #Then Invoice should be deleted in dropbox
      Examples:
      | email  | pin  | business                |
      | random | 1111 | Century Innovations Ltd |







