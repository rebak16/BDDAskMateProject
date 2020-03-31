# Created by rebak at 2020. 03. 31.
Feature: Add new question
  # Enter feature description here

  Scenario Outline: Add new question
    Given Open the Chrome and start application
    When I click on add new question
    And I fill the title "<titleField>"
    And I fill the message "<messageField>"
    And I click on add new question to finish
    And I check the new question
    And I go back to homepage
    Then I delete the new question

    Examples:
      | titleField      | messageField |
      | k               | k            |
      | 111111111111111 | 111111111    |
      | how are you?    | hi           |