@datatables3
Feature: Testing datatables website

  Scenario Outline: Testing new employee
    Given User is on the datatables homepage
    And User clicks to new button
    Then user should see create new entry Box
    And user should enter firstName "<firstName>"
    And user should enter lastName "<lastName>"
    And user should enter Position "<Position>"
    And user should enter office "<office>"
    And user should enter Extension "<Extension>"
    And user should enter startDate "<startDate>"
    And user should enter salary "<salary>"
    Then user should click the create button
    And user enters first name "<firstName>"to serach box
    Then user should see first name "<firstName>"is inserted in the table


    Examples: Test data for datatables

    |firstName|lastName|Position|office|Extension|startDate|salary |
    |john     |doe     |retired |london|314      |2019-08-02|100000|
   # |adam     |wong    |working |chicago|312     |2019-08-03|50000 |