Feature: Insurance Dekho Website Navigation and Validation

@hospital
  Scenario: Validate network hospital information for a specific city
    When hover over the Insurance option on the navigation bar
    And hover on health insurance companies in the displayed list
    And hover on health insurance in the displayed list
    And click on the first company in the displayed list
    And click on the premium calculator
    And enter the city name "Mumbai" inside the search box
    Then validate the city name text "HDFC ERGO Network Hospitals in Mumbai"
