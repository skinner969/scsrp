Feature: Login test
  something about it

  Scenario: Login test
  something about this scenario
    Given I navigated to the Gmail page
    When I login with the following values:
      | username |
      | random   |
    Then I should see "Поле «Пароль» должно быть заполнено" validation message