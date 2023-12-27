@tag
Feature: Graph Page
  I want to use this template to access Graph page

  Background: Logging in the portal and Navigating to Graph page
    Given The user is on Signinpage of DSAlgo Portal
    When The User enter valid Username "SavvyGeeks" and password "Savvy@123"
    Then User clicks login Button
    Then The User is redirected to the Homepage
    #Then The user is redirected to home page after logged in
    And clicks on the Get Started button below Stack
    Then The user is redirected Stack page

  @Stack1
  Scenario: Navigating to Operations in Stack Page
    Given The user clicks Operations in Stack from stack Page
    When The user is redirected to Operations in Stack page
    When The user clicks Tryhere link of Stack
    Then The user is redirected to Try Editor page of Satck
    And The user enters code in TryEditor of Stack and run the test
    Then The user see the output of Stack try Editor

  @Stack2
  Scenario: Navigating to Implementation Page
    Given The user clicks Implementation from Stack Page
    When The user is redirected to Implementation Representation page
    When The user clicks Tryhere link of Stack
    Then The user is redirected to Try Editor page of Satck
    And The user enters code in TryEditor of Stack and run the test
    Then The user see the output of Stack try Editor

  @Stack3
  Scenario: Navigating to Applications Page
    Given The user clicks Applications from Stack Page
    When The user is redirected to Applications Representation page
    When The user clicks Tryhere link of Stack
    Then The user is redirected to Try Editor page of Satck
    And The user enters code in TryEditor of Stack and run the test
    Then The user see the output of Stack try Editor

  @Stack4
  Scenario: Navigating to Practice Questions in Stack Page
    Given The user is in Stack page after logged in
    When The user clicks Operations in Stack
    When The user clicks the Practice Questions link in Stack page
    Then The user is redirected to PracticeQuestions page of Stack
