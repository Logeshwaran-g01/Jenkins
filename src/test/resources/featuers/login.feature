Feature: Feature for login page
  Background:
    Given a browser is opened

  @regression @smoke
  Scenario: Verify that the user could able to login
    Given navigate to the login page
    When user enter the "Lokki1996" and "Testuser@0412"
    And user clicks the login button
    Then homepage should be displayed
  @regression
  Scenario Outline: Invalid Login
    Given navigate to the login page
    When user enter the "<username>" and "<password>"
    And user clicks the login button
    #Then homepage should be displayed
    Examples:
      | username | password |
      | Lokesh | Lokki0123 |



