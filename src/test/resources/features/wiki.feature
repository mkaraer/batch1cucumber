@wikipedia
Feature: Wikipedia search feature

  Scenario: Wikipedia search test

    Given User on the wikipedia homepade
    When  User enters steve jobs to search bar and clicks enter
    Then User should see the first header is displayed steve jobs