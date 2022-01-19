@FaceBook
Feature: Login Feature
  I want to test Login Page of FaceBook application

  @LogIn
  Scenario: Login Scenario
    Given I am user of facebook application
    When I enter valid username
    And I enter valid password
    And I click on Login button
    Then User should be able to log in succesfully.
