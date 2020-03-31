# Created by rebak at 2020. 03. 19.
Feature: Search
  # Enter feature description here

  Scenario Outline: Search
    Given Open the Chrome and start application
    When I click on "<search>" button
    Then I see the "<results>"

    Examples:
      | search       | results    |
      | hi           | No results |
      | 1111         | No results |
      | k            | No results |
      | knjhdjkfhskh | No results |