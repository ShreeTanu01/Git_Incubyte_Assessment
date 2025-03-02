Feature: Test the Sign-Up and sign in Flow on Magento
Background: Given User is in landing page
  Scenario Outline:  User can successfully create an account and sign in
    Given I visit the Magento website
    When I navigate to the sign-up page
    And I fill in the sign-up form with the following details:<first_name> <last_name> <email> <password> <confirm_password>
    And I submit the sign-up form
    Then I should see the account creation confirmation message
    And I should be redirected to the account dashboard
    When I sign in using the newly created account with the following credentials:<email> <password> 
    Then I should be successfully signed in and see the account dashboard

  Examples:
    | first_name | last_name  | email                        | password   | confirm_password |
    | John       | Doe        | john.doe@example.com          | Password123 | Password123      |
    | Jane       | Smith      | jane.smith@example.com        | Password456 | Password456      |
                     