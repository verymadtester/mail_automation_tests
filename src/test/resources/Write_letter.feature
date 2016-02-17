@write_letter
Feature: Write letter

  Scenario Outline: Write letter in rambler mail
    Given user login to url, with "<username>", and "<password>"
    When user send letter to "sergeishatilov@rambler.ru"
    Then letter should have been sent
    And user logout
  Examples:
    |username         | password      |
    |sergeishatilov   |	epamsystems   |
    |sergei.shatilov  |	epamsystems   |
