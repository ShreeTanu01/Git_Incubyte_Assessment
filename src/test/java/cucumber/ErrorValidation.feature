
@tag
Feature: Test all the negative scenario in signup page
  

Background: 
Given User is in Magento landing page

Scenario Outline:  Verify error message when email ID already exists
    Given I navigate to the sign-up page
    When I fill in the sign-up form with the following details:<first_name> <last_name> <email> <password> <confirm_password>
    And I submit the sign-up form
    Then I should see the error message "There is already an account with this email address. If you are sure that it is your email address"
    
  Examples:
    | first_name | last_name  | email                        | password   | confirm_password |
    | Jovh       | Do        | jovh.do@example.com          | Password123 | Password123      |
   
 Scenario Outline:  Verify error message when password and confirmation password is different
    Given I navigate to the sign-up page
    When I fill in the sign-up form with the following details:<first_name> <last_name> <email> <password> <confirm_password>
    And I submit the sign-up form
    Then I should see the error message "Please enter the same value again."
    
  Examples:
    | first_name | last_name  | email                        | password   | confirm_password |
    | Jovh       | Do        | joovh.do@example.com          | Password123 | Password1234      |
   
  Scenario Outline:  Verify error message when password doesnot satisfy the criteria
    Given I navigate to the sign-up page
    When I fill in the sign-up form with the following details:<first_name> <last_name> <email> <password> 
    Then I should see the error message "Minimum length of this field must be equal or greater than 8 symbols. Leading and trailing spaces will be ignored."
    
  Examples:
    | first_name | last_name  | email                        | password   | 
    | Jovh       | Do        | joovh.do@example.com          | Pass |  
                                          
Scenario:  Verify error message when first name field is missing
    Given I navigate to the sign-up page
    When I fill in the sign-up form with the following details:<first_name> <last_name> <email> <password> <confirm_password>
    And I submit the sign-up form
    Then I should see the error message "This is a required field."
    
  Examples:
    | first_name | last_name  | email                        | password   | confirm_password |
    |        | Do        | joovh.do@example.com          | Password123 | Password1234      |
   
  
Scenario:  Verify error message when  email field is missing
    Given I navigate to the sign-up page
    When I fill in the sign-up form with the following details:<first_name> <last_name> <email> <password> <confirm_password>
    And I submit the sign-up form
    Then I should see the error message "This is a required field."
    
  Examples:
    | first_name | last_name  | email                        | password   | confirm_password |
    |    ab    |     th    |           | Password123 | Password1234      |
   
   Scenario:  Verify error message when last name field is missing
    Given I navigate to the sign-up page
    When I fill in the sign-up form with the following details:<first_name> <last_name> <email> <password> <confirm_password>
    And I submit the sign-up form
    Then I should see the error message "This is a required field."
    
  Examples:
    | first_name | last_name  | email                        | password   | confirm_password |
    |    ab    |       |       fgffg@vghv.com    | Password123 | Password1234      |
   
   Scenario:  Verify error message when password field is missing
    Given I navigate to the sign-up page
    When I fill in the sign-up form with the following details:<first_name> <last_name> <email> <password> <confirm_password>
    And I submit the sign-up form
    Then I should see the error message "This is a required field."
    And I should see the error message "Password Strength:No Password"
    
  Examples:
    | first_name | last_name  | email                        | password   | confirm_password |
    |    ab    |       ghf |       fgffg@vghv.com    |  | Password1234      |
   
  Scenario:  Verify error message when confirmation password field is missing
    Given I navigate to the sign-up page
    When I fill in the sign-up form with the following details:<first_name> <last_name> <email> <password> <confirm_password>
    And I submit the sign-up form
    Then I should see the error message "This is a required field."
    
  Examples:
    | first_name | last_name  | email                        | password   | confirm_password |
    |    ab    |       ghf |       fgffg@vghv.com    | Password1234 |       |
   
   
   Scenario Outline:  Verify error message when email format is not correct
    Given I navigate to the sign-up page
    When I fill in the sign-up form with the following details:<first_name> <last_name> <email> <password> <confirm_password>
    And I submit the sign-up form
    Then I should see the error message "Please enter a valid email address (Ex: johndoe@domain.com)."
    
  Examples:
    | first_name | last_name  | email                        | password   | confirm_password |
    |    ab    |       ghf |       fgffgvghv.com    | Password1234 |  Password1234     |
    |    ab    |       ghf |       fgff@gvghvcom    | Password1234 |  Password1234     |
   
   
   #password weak 
   #password Strong
   #No special character
   