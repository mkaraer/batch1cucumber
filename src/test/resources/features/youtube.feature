@youtube
Feature: Youtube search feature
Background: user is on the youtube homepage And user is able to see the search box  And user is able to see search button

  Scenario: Testing youtube search
    When user searches for Funny Cat Videos
    Then user should see results related to funny cat videos

  Scenario: Testing youtube search
    When user searches for Funny Dog Videos
    Then user should see results related to funny dog videos

  Scenario: Testing youtube search
    When user searches for Funny Pet Videos
    Then user should see results related to funny pet videos