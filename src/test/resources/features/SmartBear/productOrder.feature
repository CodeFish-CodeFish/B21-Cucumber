Feature: order product functionality

  Scenario: Happy path for placing order
    Given user is navigated to main page of smartBear
    When user is on login page user enters username as 'Tester' and password as 'test'
    Then user clicks on login btn
    And user clicks on order button from main page
    Then user selects 'ScreenSaver' from the dropdown and enters '100' into quantity field
    When user enters price as '500' and discount as '50'
    Then user enters total as '2000' and clicks calculate button
    Then user provides customer name as 'Kobe Bryant' and address as '5 N Dearborn st'
    And user enters city as 'LA' and state as 'California' and zipCode as '60601'
    Then user checks mastercard radio button
    And user enters credit number as '756765765' and expiration as '12/27'
    Then user clicks on process button and validates success message as 'New order has been successfully added.'

    #//strong[contains(.,'New order has been successfully added.')]