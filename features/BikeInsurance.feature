Feature: Bike Insurance Check

@bikeinsurance
  Scenario: Check bike insurance prices
    When I hover on the insurance link on the navigation
    And I click on the bike insurance option from the displayed options
    And I enter the bike number in the search box
    And I select the bike brand
    And I search for bike model 
    And I click the bike model from the displayed results
    And I select the bike edition
    And I select the registration year of bike
    And I click on the register city
    And I click on the city number
    And I click on previous own damage
    And I click on the own damage date
    And I click on the confirm details button
    And I click on zero depreciation
    And I click on addons
    And I click on engine protection cover
    And I click on tyre protection
    And I click on the apply button
    And I click on the first company
    Then I verify the text "Proposal Form" is displayed
    