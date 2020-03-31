# Created by rebak at 2020. 03. 18.

Feature: Login as a new user

  Scenario Outline: Login
    Given Open the Chrome and start application
    When I click on the main log in button
    And I fill the username field with "<username>"
    And I fill the password field with "<password>"
    And I click on the log in button
    And I logged in
    Then I logged out

    Examples:
      | username | password |
      | k        | k        |
      | ki       | ki       |
      | ki       | ka       |
