@google
Feature: Google Search Feature

  Scenario: Making sure google search is working as expected

    Given user is on the google homepage
    And user enters flowers keyword
    When user clicks search button
    Then user should see result related to flowers