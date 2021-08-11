Feature: Account Activity

  Background:
    Given the user is on the login page
    When the user enters user information
    And the user navigates to "Online Banking" tab
    And the user goes to "Account Activity" header


  Scenario: Account Activity page should have the title "Zero-Account activity"
    Then Page should have the title "Zero - Account Activity"


  Scenario: Default option should be Savings in the Account dropdown
    Then Default option should be "Savings" in the Account dropdown


  Scenario: Account drop down should have the 5 options
    Then Account drop down should have the following options
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |


  Scenario: Transactions table should have column names
    Then Transactions table should have the following column names
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |
