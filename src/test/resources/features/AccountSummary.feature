Feature: Online Banking

  Background:
    Given the user is on the login page
    And the user enters user information
    When the user navigates to "Online Banking" tab
#And the user goes to "Account Summary" header


  Scenario: Account summary page should have the title "Zero-Account summary"
    Then Page should have the title "Zero - Account Summary"


  Scenario: "Account Summary" page should have 4 account types
    Then Page should have the following options
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |



  Scenario: "Account Activity" page should have 1 option
    And the user goes to "Account Activity" header
    Then Page should have the following options
      | Show Transactions |


  Scenario: Credit Accounts table must have 3 columns
    And the user goes to "Account Summary" header
    Then Table should have the following column names
      | Account     |
      | Credit Card |
      | Balance     |






