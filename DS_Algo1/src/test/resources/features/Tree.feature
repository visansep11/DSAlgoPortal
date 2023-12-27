@tag
Feature: Tree Page
  I want to use this template to access Tree page

  Background: Logging in the portal and Navigating to Tree page
    Given The user is on Signin page of DSAlgo portal
    When The user enter valid Username "SavvyGeeks" and Password "Savvy@123"
    Then User click on login button
    Then The user is redirected to the homepage
    #Then The user is redirected to home page after logged in
    And clicks on the Get Started button below Tree
    Then The user is redirected Tree page

  @Tree1
  Scenario: Navigating to Overview of Trees
    #Given The user is in Tree page after logged in
    #When The user clicks on the Get Started button below Tree
    Given The user clicks Overview of Trees from Tree page
    When The user is redirected to Overview of Trees page
    When The user clicks Try here link
    Then The user is redirected to Try Editor page of Tree
    And The user enters code in Try Editor and run the test
    Then The user see the output of Tree try Editor

  @Tree2
  Scenario: Navigating to Terminologiesin Tree page
    #Given The user is in Tree page after logged in
    When The user clicks Terminologies link
    Then The user is redirected to Terminologies page
    When The user clicks Try here link
    Then The user is redirected to Try Editor page of Tree
    And The user enters code in Try Editor and run the test
    Then The user see the output of Tree try Editor

  @Tree3
  Scenario: Navigating to Types of Tree page
    #Given The user is in Tree page after logged in
    When The user clicks Types of Trees link from Tree Page
    Then The user is redirected to Types of Trees page
    When The user clicks Try here link
    Then The user is redirected to Try Editor page of Tree
    And The user enters code in Try Editor and run the test
    Then The user see the output of Tree try Editor

  @Tree4
  Scenario: Navigating to Traversals-Illustration Tree Page
   #Given The user is in Tree page after logged in
    When The user clicks Traversals-Illustration link from Tree Page
    Then The user is redirected to Traversals-Illustration page
    When The user clicks Try here link
    Then The user is redirected to Try Editor page of Tree
    And The user enters code in Try Editor and run the test
    Then The user see the output of Tree try Editor

  @Tree5
  Scenario: Navigating to Binary trees in Tree page
    #Given The user is in Tree page after logged in
    When The user clicks Binary trees link from Tree Page
    Then The user is redirected to Binary trees
    When The user clicks Try here link
    Then The user is redirected to Try Editor page of Tree
    And The user enters code in Try Editor and run the test
    Then The user see the output of Tree try Editor

  @Tree6
  Scenario: Navigating to Types of Binary trees in Tree page
    #Given The user is in Tree page after logged in
    When The user clicks Types of Binary trees link from Tree Page
    Then The user is redirected to Types of Binary trees
    When The user clicks Try here link
    Then The user is redirected to Try Editor page of Tree
    And The user enters code in Try Editor and run the test
    Then The user see the output of Tree try Editor

  @Tree7
  Scenario: Navigating to Implementation in Python in Tree page
    #Given The user is in Tree page after logged in
    When The user clicks Implementation in Python link from Tree Page
    Then The user is redirected to Implementation in Python
    When The user clicks Try here link
    Then The user is redirected to Try Editor page of Tree
    And The user enters code in Try Editor and run the test
    Then The user see the output of Tree try Editor

  @Tree8
  Scenario: Navigating to Binary Tree Traversal in Tree page
    #Given The user is in Tree page after logged in
    When The user clicks Binary Tree Traversal link from Tree Page
    Then The user is redirected to Binary Tree Traversal
    When The user clicks Try here link
    Then The user is redirected to Try Editor page of Tree
    And The user enters code in Try Editor and run the test
    Then The user see the output of Tree try Editor

  @Tree9
  Scenario: Navigating to Implementation of Binary Trees in Tree page
    #Given The user is in Tree page after logged in
    When The user clicks Implementation of Binary Trees link from Tree Page
    Then The user is redirected to Implementation of Binary Trees
    When The user clicks Try here link
    Then The user is redirected to Try Editor page of Tree
    And The user enters code in Try Editor and run the test
    Then The user see the output of Tree try Editor

  @Tree10
  Scenario: Navigating to Application of Binary Trees in Tree page
    #Given The user is in Tree page after logged in
    When The user clicks Application of Binary Trees link from Tree Page
    Then The user is redirected to Application of Binary Trees
    When The user clicks Try here link
    Then The user is redirected to Try Editor page of Tree
    And The user enters code in Try Editor and run the test
    Then The user see the output of Tree try Editor

  @Tree11
  Scenario: Navigating to Binary Search Trees in Tree page
    #Given The user is in Tree page after logged in
    When The user clicks Binary Search Trees link from Tree Page
    Then The user is redirected to Binary Search Trees
    When The user clicks Try here link
    Then The user is redirected to Try Editor page of Tree
    And The user enters code in Try Editor and run the test
    Then The user see the output of Tree try Editor

  @Tree12
  Scenario: Navigating to Implementation of BST in Tree page
    #Given The user is in Tree page after logged in
    When The user clicks Implementation of BST link from Tree Page
    Then The user is redirected to Implementation of BST
    When The user clicks Try here link
    Then The user is redirected to Try Editor page of Tree
    And The user enters code in Try Editor and run the test
    Then The user see the output of Tree try Editor

  @Tree13
  Scenario: Navigating to Practice Questions in Tree Page
    Given The user is in Tree page after logged in
    When The user clicks on Overview of Trees
    When The user clicks the Practice Questions link in tree page
    Then The user is redirected to PracticeQuestions page of tree page
