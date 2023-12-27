@tag
Feature: Queue Page
  I want to use this template to access Queue page

  Background: Logging in the portal and Navigating to Queue page
    Given The User is on Signinpage of DSAlgo portal
    When The User enters valid Username "SavvyGeeks" and Password "Savvy@123"
    Then User clicks Login button
    Then The User is Redirected to the homepage
    #Then The user is redirected to home page after logged in
    And clicks on the Get Started button below Queue
    Then The user is redirected Queue page

  @Queue1
  Scenario: Navigating to Implementation of Queue in Python Page
   
    Given The user clicks Implementation of Queue in Python from Queue Page
    When The user is redirected to Implementation of Queue in Python page
    When The user clicks Tryhere link of Queue
    Then The user is redirected to Try Editor page of Queue
    And The user enters code in TryEditor of Queue Page and run the test
    Then The user see the output of Queue try Editor
    
    
  @Queue2
  Scenario: Navigating to Implementation using collections.deque Page

    Given The user clicks Implementation using collections.deque link from queue page
    When The user is redirected to Implementation using collections.deque page
    When The user clicks Tryhere link of Queue
    Then The user is redirected to Try Editor page of Queue
    And The user enters code in TryEditor of Queue Page and run the test
    Then The user see the output of Queue try Editor
    
    @Queue3
  Scenario: Navigating to Implementation using array Page

    Given The user clicks Implementation using array link from queue page
    When The user is redirected to Implementation using array page
    When The user clicks Tryhere link of Queue
    Then The user is redirected to Try Editor page of Queue
    And The user enters code in TryEditor of Queue Page and run the test
    Then The user see the output of Queue try Editor
    
    @Queue4
  Scenario: Navigating to Queue operations Page

    Given The user clicks Queue operations link from queue page
    When The user is redirected to Queue operations page
    When The user clicks Tryhere link of Queue
    Then The user is redirected to Try Editor page of Queue
    And The user enters code in TryEditor of Queue Page and run the test
    Then The user see the output of Queue try Editor
     
    @Queue5
    Scenario: Navigating to Practice Questions in Queue Page
    Given The user is in Queue page after logged in
    When  The user clicks Implementation of Queue in Python 
    When The user clicks the Practice Questions link in Queue page
    Then The user is redirected to PracticeQuestions page of Queue 
