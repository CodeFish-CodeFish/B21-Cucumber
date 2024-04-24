Feature: check ajax submit input fields

  #DataTable
  Scenario: Happy path
    Given user is on main page of lambda web app user clicks on ajax submit form link
    Then user enters name and message as follows
      | name    | Kuba                              |
      | message | sdafdsgdfhvcgsfadssdasdafdsvfdsfa |
    And user clicks on submit button and verifies that success message is
      | successMessage | Ajax Request is Processing! |