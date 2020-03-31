# Created by rebak at 2020. 03. 19.

Feature: Add new answer

  Scenario Outline: New answer
    Given Open the Chrome and start application
    When I click on a specified question
    And I click on add new answer
    And I fill the "<field>"
    And I click on add new answer to finish
    And I saved a new answer
    Then I delete the new answer

    Examples:
      | field |
      | k     |
      | ki    |
      | ki    |