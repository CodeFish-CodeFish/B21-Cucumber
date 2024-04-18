Feature: Login Functionality

  # this will be implemented into re usable code
  Background:Positive scenario for login functionality
    Given user is on navigated to login page
    When user is on login page user provides username and password
    Then user clicks on login button
    And user validates title and url of the main page
    Then user validates main page header

  Scenario: Check dropdown and menu functionalities happy path
    When user is on main page user validates dropdown options
    Then user clicks on hamburger menu and clicks About option

    # will continue on next class







