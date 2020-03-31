Feature: Edit question

  Scenario Outline: Edit question
    Given Open the Chrome and start application
    When I click on a specified question
    And I click on edit question
    And I fill the title "<field>"
    And I click on edit new question
    And I click on edit question again
    And I delete from title field
    And I edited the new question
    Then I check the "<question>"

    Examples:
      | field | question                                                       |
      | k     | Drawing canvas with an image picked with Cordova Camera Plugin |