@smoke
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
    Then user clicks on hamburger menu and clicks About option then user navigates back
    And user adds one product to cart and clicks on cart button
    Then user verifies that product is added and user removes the product from the cart

  Scenario: check all the social media buttons by clicking each one of them
    When user clicks on twitter user validates title of twitter
    When user clicks on facebook user validates title of facebook
    When user clicks on linkedIn user validates title of linkedIn









