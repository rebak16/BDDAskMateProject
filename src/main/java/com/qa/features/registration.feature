# Created by rebak at 2020. 03. 19.
Feature: Registration
  # Enter feature description here

  Scenario Outline: Registration
    Given Open the Chrome and start application
    When I click on register button
    And I fill the first name field with "<firstName>"
    And I fill the last name field with "<lastName>"
    And I fill the email field with "<email>"
    And I fill the username field with "<username>"
    And I fill the password field with "<password>"
    And I fill the confirm password field with "<confirmPassword>"
    And I click on the register button
    Then I registered

    Examples:
      | firstName | lastName | email  | username | password | confirmPassword |
      | ka        | csa      | ka@csa | ki       | kacsa    | kacsa           |
      | ka        | csa      | ka@    | kacsa    | kacsa    | kacsa           |
      | ka        | csa      | ka@csa | kacsa    | kacsa    | csa             |
      | ka        | csa      | csa    | kacsa    | csa      | ka              |