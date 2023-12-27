@tag
Feature: Sign-In feature
  I want to use this template for sign into DSAlgo application

  @tag123 @example1 @example2
  Scenario Outline: Sign-In Scenario outline
    Given The user is in the Home page of ds-algo portal
    When The user clicks on the Sign-In link
    Then The user is taken to the Login page
    When The user enters "<Username>" and "<Password>"
    And clicks the login button
    Then Verify the "<status>"

    @example1
    Examples: 
      | Username | Password | status                     |
      |          |          | Please fill out this field. |
    	| viji     |          | Please fill out this field. |
   	  |          | neyan    | Please fill out this field. |
    
    @example2
    Examples: 
      | Username   | Password  | status                        |
      | Neyan      | nimalan   | Invalid Username and Password |
      | vijaya     | Savvy@123 | Invalid Username and Password |
      | SavvyGeeks | vijaya    | Invalid Username and Password |
      | SavvyGeeks | Savvy@123 | You are logged in             |

  @tag4
  Scenario: Sign-Out scenario
    Given The user is logged in
    When The user clicks on Sign-Out link
    Then The user gets the message - Logged out successfully
