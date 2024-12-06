Feature: Health Insurance Custom Plan

@buyingplans
Scenario Outline: Customize and filter health insurance plans
   When I hover over Insurance
   And click on health insurance in the displayed options
   And select the "<gender>" under Compare & Buy Customised Health
   And enter the name "<name>" in the input box
   And enter the mobile number "<phoneNo>" in the input box
   And click the view plan button
   And select the self and age
   And enter pincode "<pincode>"
   And click the continue button
   And click the view plan button
   And select "<coverage>" from the coverage dropdown
   And open the special features dropdown 
   And select features "<filters>"
   And select the "<duration>" from the tenure dropdown
   And choose the sort option "<sort>"
   Then I verify title contains "Buy Health Insurance"
   When I click the first company after applying the filters
   And I click viewFeature
   And Verify "Plan Features" in the view feature
   And I close the view feature popup
   And I enter the Date of birth
   And select height "<heightInFeet>" and "<heightInInch>"
   And I input the "<weight>"  in the input box
   And I click the dropdown of occupation and select the occupation
   And I click the nominee relation dropdown and select the relation from the displayed options
   And I enter the name "<NomineeName>"
   And I enter the age of the nominee
   And I click on the continue to medical details button
   Then I verify  "Medical Details" text
    
    Examples:
  |gender|name|pincode|phoneNo|coverage|duration|filters|sort|heightInFeet|heightInInch|NomineeName|weight|
  |male|om prakash|400001|9738391921|10l|3|1|hightolow|5|10|sibaram|90|
  |female|ankita|400002|9738391921|50l|2|2|lowtohigh|5|11|sibaram|80|
  |male|asutosh|400003|9738391921|1cr|3|3|hightolow|5|11|sibaram|90|
  |male|yash|400004|9738391921|15l|2|4|lowtohigh|5|11|sibaram|80|
  
  
  
  