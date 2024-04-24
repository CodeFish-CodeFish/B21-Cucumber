Feature: order product functionality

#  Scenario: Happy path for placing order
#    Given user is navigated to main page of smartBear
#    When user is on login page user enters username as 'Tester' and password as 'test'
#    Then user clicks on login btn
#    And user clicks on order button from main page
#    Then user selects 'ScreenSaver' from the dropdown and enters '600' into quantity field
#    When user enters price as '500' and discount as '50'
#    Then user enters total as '2000' and clicks calculate button
#    Then user provides customer name as 'Jon Doe' and address as '12 W Adams st'
#    And user enters city as 'San Diego' and state as 'California' and zipCode as '60601'
#    Then user checks mastercard radio button
#    And user enters credit number as '756765765' and expiration as '12/27'
#    Then user clicks on process button and validates success message as 'New order has been successfully added.'

  Scenario Outline: Happy path for placing order
    Given user is navigated to main page of smartBear
    When user is on login page user enters username as '<username>' and password as '<password>'
    Then user clicks on login btn
    And user clicks on order button from main page
    Then user selects '<productName>' from the dropdown and enters '<quantity>' into quantity field
    When user enters price as '<price>' and discount as '<discount>'
    Then user enters total as '<total>' and clicks calculate button
    Then user provides customer name as '<name>' and address as '<address>'
    And user enters city as '<city>' and state as '<state>' and zipCode as '<zipCode>'
    Then user checks mastercard radio button
    And user enters credit number as '<creditCard>' and expiration as '<expiration>'
    Then user clicks on process button and validates success message as '<successMessage>'

    Examples: Test data for Smart Bear
      | username | password | productName | quantity | price | discount | total  | name    | address       | city      | state      | zipCode | creditCard   | expiration | successMessage                         |
      | Tester   | test     | ScreenSaver | 500      | 400   | 50       | 1000   | Jon Doe | 12 W Adams st | San Diego | California | 60656   | 3214353454   | 12/27      | New order has been successfully added. |
      | Tester   | test     | FamilyAlbum | 200      | 600   | 100      | 2000   | Enayet  | 100 W Madison | Chicago   | Illinois   | 60601   | 767867876876 | 10/28      | New order has been successfully added. |
      | Tester   | test     | MyMoney     | 5656     | 4634  | 234      | 234234 | Roman   | 20 N Wells    | Skokie    | Colorado   | 60604   | 787878787878 | 10/29      | New order has been successfully added. |



