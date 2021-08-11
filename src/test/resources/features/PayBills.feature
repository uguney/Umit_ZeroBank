Feature: Pay Bills

  Background:
    Given the user is on the login page
    When the user enters user information
    And the user navigates to "Online Banking" tab
    And the user goes to "Pay Bills" header


  Scenario: Pay Bills page should have the title "Zero - Pay Bills"
    Then Page should have the title "Zero - Pay Bills"


  Scenario: User should be able to complete a successful pay operation
    When the user enters "16" as dollar
    And the user click the dateInput
    And the user pick a date
    And the user enters a "my credit payment" as description
    And the user clicks the pay button
    Then "The payment was successfully submitted." should be displayed



    #negative scenario
  Scenario: User should not be able to complete payment
    When the user click the dateInput
    And the user pick a date
    And the user enters a "description" as description
    And the user clicks the pay button
    Then "Please fill out this field." message should be displayed



    #negative scenario  // Amount input box should not have accepted alphabetical or special characters
    # this is a bug
  Scenario: Amount field should not accept alphabetical or special characters
    When the user enters "1asd#" as dollar
    When the user click the dateInput
    And the user pick a date
    And the user enters a "description" as description
    And the user clicks the pay button
    Then "The payment was successfully submitted." should be displayed



    #negative scenario for dateInput
  Scenario: Data field should not accept alphabetical or special characters
    When the user enters "12" as dollar
    When the user click the dateInput
    And the user tries to write alphabetical characters "asdfg" into dateInput
    And the user enters a "description" as description
    And the user clicks the pay button
    Then "Please fill out this field." message should be displayed for dateInput

  @wip
#xxxxxxxx
  Scenario: User should not be able to complete a successful pay operation
    When the user enters "16" as dollar
    And the user enter a date from past
    And the user enters a "my credit payment" as description
    And the user clicks the pay button
    Then "The payment was successfully submitted." should be displayed



