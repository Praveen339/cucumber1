
Feature: Title of your feature
 
  Scenario Outline: Login
    Given I want to type the URL
    Then   I click on SignIn button
    And   I Enter "<Username>" and "<password>"
    And I click on Login 
    Then TestMe app Homepage is displayed
    Examples:
      | Username  | password    | 
      | lalitha   | password123 |