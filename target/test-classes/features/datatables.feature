@datatables2
  Feature: Testing datatables website

   Scenario: Testing new employee
    Given User is on the datatables homepage
      And User clicks to new button
      Then user should see create new entry Box
      And user should enter firstName "Metin"
      And user should enter lastName "Kara"
      And user should enter Position "retired"
      And user should enter office "London"
      And user should enter Extension ""141"
      And user should enter startDate "2019-01-08"
      And user should enter salary "100000"
      Then user should click the create button
      And user enters first name "Metin"to serach box
      Then user should see first name "Metin"is inserted in the table