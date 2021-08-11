
Feature: Login

  @login
  Scenario: User should be able to login to the ZeroBank App
    Given the user is on the login page
    When the user enters user information
    And the user should be able to login


#negative scenario
  Scenario: User should not be able to login with invalid credentials
    Given the user is on the login page
    When the user enters "username" and "password123"
    Then the user should not be able to login



#negative scenario
  Scenario: User should not be able to login with blank username
    Given the user is on the login page
    When the user enters " " and "password123"
    Then the user should not be able to login



