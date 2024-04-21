Feature: login functionality

  Scenario: Negative scenario for login functionality
    Given user is on main page user clicks on my account and login button
    Then user is landed on login page and enters email as 'test@test.com' and password as 'qwertyuiop' and clicks login button
    And user validates error message is displayed as 'Warning: No match for E-Mail Address and/or Password.'

