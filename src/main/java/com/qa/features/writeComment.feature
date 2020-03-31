# Created by rebak at 2020. 03. 31.
Feature: Write comment
  # Enter feature description here

  Scenario Outline: Write comment
    Given Open the Chrome and start application
    When I click on a specified question
    And I click on comment
    And I fill the message "<field>"
    And I click on add new comment
    Then I check the comment

    Examples:
      | field |
      | k     |