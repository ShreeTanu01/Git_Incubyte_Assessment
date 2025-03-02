
Feature: Test the Sign-Up and sign in Flow on Magento

Background: 

Given User is in Magento landing page

Scenario Outline:  User can successfully create an account and sign in
    Given I navigate to the sign-up page
    And I fill in the sign-up form with the following details:<first_name> <last_name> <email> <password> <confirm_password>
    And I submit the sign-up form
    Then I should see the account creation confirmation message
    And I should be see the account dashboard have <first_name> <last_name>
    Then I should logout and click on signinPage
    When I sign in using the newly created account with the following credentials:<email> <password> 
    Then I should be successfully signed in and see the account dashboard have <first_name> <last_name>

  Examples:
    | first_name | last_name  | email                        | password   | confirm_password |
    | Jovh       | Do        | jovh.do@example.com          | Password123 | Password123      |
   
                     