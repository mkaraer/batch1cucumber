@googleParameters
  Feature: Testing google search functuanality

    Scenario: Testing google search
      Given user is on the homepage of googele
      When user enters "flowers"
      Then user should see "flowers" in the tile

    Scenario: Testing google search
      Given user is on the homepage of googele
      When user enters "cars"
      Then user should see "cars" in the tile

    Scenario: Testing google search
      Given user is on the homepage of googele
      When user enters "buses"
      Then user should see "buses" in the tile