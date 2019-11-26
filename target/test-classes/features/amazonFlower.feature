@amazon
  Feature: Amazon Flowers verification
    Scenario: to get Amazon flower site
      When user goes to amazon application
      Then user should write flower and click on searchbox
      Then user should see flower is displayed