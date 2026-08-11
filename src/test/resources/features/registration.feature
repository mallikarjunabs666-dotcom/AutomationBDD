Feature: User Registration

  Scenario: Verify user can enter registration details

    Given User launches the browser
    And User navigates to the Registration page
    When User enters name "Mallikarjun"
    And User enters email "mallikarjun@test.com"
    And User enters phone number "9876543210"
    And User enters address "Bangalore"
    Then User should see all entered values in the registration form


    Scenario:Verify user can select Gender and Days
      Given User launches the browser
      When User navigates to the Registration page
      When User click on female radio button
      And User select Tuesday checkbox
      And User select "Canada" from the country dropdown
      And User select "Green" and "White" from colors dropdown
      And User select "30" "October" "2026" from date picker
      And User select "Jan" "25" "2017" from another date picker
      And I read values from webtable
      And I read values from Dynamic WebTable
      And I read values from pagination Webtable


