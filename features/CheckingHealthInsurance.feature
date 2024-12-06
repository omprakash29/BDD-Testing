Feature: Verify Health Insurance Company Navigation

@checkingCompanies
 Scenario: Verify navigation to health insurance company page
   When I hover on Insurance link on the navigation bar
   And I hover on health insurance link in the displayed options
   And I hover on health insurance companies link inside health insurance
   And I click on the first company in the list
   Then I verify the company name in result page "HDFC ERGO Health Insurance"

@checkingHealthInsurance
Scenario Outline: Compare and buy customised health insurance
   When I hover over Insurance option
   And I click on health insurance link in the displayed options
   And I select the "<gender>" option under Compare & Buy Customised Health
   And I enter the name "<name>" in the input box
   And I enter the mobile number "<phoneNo>" in the input box
   And I click the view plan button
   And I select the self and age
   And I enter pincode "<pincode>"
   And I click the continue button
   And I click the view plan button
   Then I verify title of the page contains "Buy Health Insurance"
   
 @checkingErrorMessage
Scenario Outline: Checking the error message
	When I hover over Insurance on the navigation bar
	And I click on health insurance option in the displayed options
	And I select the "<gender>" option
	And click on view plan button
	Then verify the error message "The name field is required" and "The mobile field is required"

  Examples:
  |gender|name|pincode|phoneNo|
  |male|om prakash|400001|9738391921|
  |female|sanjana|400002|9078684573|
  