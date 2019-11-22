@datatables
  Feature: Testing datatables website

   Scenario: Testing new employee
    Given User is on the datatables homepage
      And User clicks to new button
      Then user should see create new entry Box
      And user should enter firstName
      And user should enter lastName
      And user should enter Position
      And user should enter office
      And user should enter Extension
      And user should enter startDate
      And user should enter salary
      Then user should click the create button
      And user enters first name to serach box
      Then user should see first name is inserted in the table