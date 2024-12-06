Feature: Health Insurance Premium Calculation

@calculate
  Scenario: Calculate health insurance premium
    When I hover over Insurance option on the navigation bar
    And I click on the health insurance option from the drop down
    And I scroll down to the calculate health insurance section
    And I click on the "<categories>" option inside the health insurance calculator
    And I enter the pincode in the input field "<pincode>"
    And I choose the required coverage "<coverage>"
    And I click on the calculate premium button
    Then I verify the text "Fill your details" is displayed in the popup

Examples:
  |pincode|categories|coverage
  |400001|you|10
  |400002|couple|7
  |400003|family|10
  |400004|father|7
  |400005|mother|10
  					