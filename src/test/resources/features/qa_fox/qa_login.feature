Feature: login functionality

  Scenario Outline: Negative scenario for login functionality
    Given user is on main page user clicks on my account and login button
    Then user is landed on login page and enters email as '<email>' and password as '<password>' and clicks login button
    And user validates error message is displayed as '<errorMessage>'

    #test data for negative scenario
    Examples: test data for Qa fox login functionality
      | email           | password     | errorMessage                                          |
      | test@test.com   | qwertyuiop   | Warning: No match for E-Mail Address and/or Password. |
      | adsas@fsdf.com  | 123242345345 | Warning: No match for E-Mail Address and/or Password. |
      | 123213@4234.com | !@#@$#%$#%   | Warning: No match for E-Mail Address and/or Password. |
      | e@t.com         | QEWRQEWTREWT | Warning: No match for E-Mail Address and/or Password. |

