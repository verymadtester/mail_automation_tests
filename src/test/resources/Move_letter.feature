@move_letter
Feature: Move letter

  Scenario Outline: Move letter from SentLettersPage to TrashLettersPage
    Given user login to url, with "<username>", and "<password>"
    When user move first sent letter to Trash
    Then user open Trash Page and check letter have been moved
    And user logout
  Examples:
    |username         | password      |
    |sergeishatilov   |	epamsystems   |
    |sergei.shatilov  |	epamsystems   |