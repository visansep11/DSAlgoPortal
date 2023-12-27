@tag
Feature: Graph Page
  I want to use this template to access Graph page

  Background: Logging in the portal and Navigating to Graph page
    Given The user is on Signinpage of DSAlgo portal
    When The User enter valid Username "SavvyGeeks" and Password "Savvy@123"
    Then User clicks login button
    Then The User is redirected to the homepage
    #Then The user is redirected to home page after logged in
    And clicks on the Get Started button below Graph
    Then The user is redirected Graph page

  @Graph1
  Scenario: Navigating to Graph Page
    #Given The user is in Graph page after logged in
    #When The user clicks on the Get Started button below Graph
    Given The user clicks Graph link from Graph Page
    When The user is redirected to Graph page
    When The user clicks Tryhere link
    Then The user is redirected to Try Editor page of Graph
    And The user enters code in TryEditor and run the test
    Then The user see the output of Graph try Editor
    
    
  @Graph2
  Scenario: Navigating to Graph Representations Page
    #Given The user is in Graph page after logged in
    #When The user clicks on the Get Started button below Graph
    Given The user clicks Graph Representations link from Graph Page
    When The user is redirected to Graph Representation page
    When The user clicks Tryhere link
    Then The user is redirected to Try Editor page of Graph
    And The user enters code in TryEditor and run the test
    Then The user see the output of Graph try Editor
     
    @Graph3
    Scenario: Navigating to Practice Questions in Graph Page
    Given The user is in Graph page after logged in
    When  The user clicks Graphlink from Graph Page
    When The user clicks the Practice Questions link in Graph page
    Then The user is redirected to PracticeQuestions page of Graph 
