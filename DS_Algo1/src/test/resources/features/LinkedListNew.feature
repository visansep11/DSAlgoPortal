@tag
Feature: LinkedList Page
  I want to use this template to access linkedlist page

  Background: Logging in the portal and Navigating to linkedlist page
    Given The user is on Sign in page of DS Algo portal
    When The user enters valid Username "SavvyGeeks" and Password "Savvy@123"
    Then User clicks on login button
    #Then The user is redirected to the homepage
    #Then The user is redirected to home page after logged in
    And clicks on the Get Started button below Linkedlist
    Then The user is redirected to Linked List page

  @linkedlist1
  Scenario: Navigating to Introduction page in linkedlist page
    #Given The user is in LinkedListpage page after logged in
    #When The user clicks on the Get Started button below Linkedlist
    Given The user clicks Introduction link from linked list page
    When The user is redirected to Introduction page
    When The user clicks the Try here link
    Then The user is redirected to Try Editor page
    And The user enters some code in Try Editor and run the test
    Then The user sees the output

  @linkedlist2
  Scenario: Navigating to Creating Linked List in linkedlist page
    #Given The user is in LinkedListpage page after logged in
    When The user clicks Creating Linked List link
    Then The user is redirected to CreatingaLinkedList page
    When The user clicks the Try here link
    Then The user is redirected to Try Editor page
    And The user enters some code in Try Editor and run the test
    Then The user sees the output

  @linkedlist3
  Scenario: Navigating to Types of Linked List in linkedlist page
    #Given The user is in LinkedListpage page after logged in
    When The user clicks Types of Linked List link
    Then The user is redirected to TypesofLinkedlist page
    When The user clicks the Try here link
    Then The user is redirected to Try Editor page
    And The user enters some code in Try Editor and run the test
    Then The user sees the output

  @linkedlist4
  Scenario: Navigating to Implement Linked List in Python linkedlist page
    #Given The user is in LinkedListpage page after logged in
    When The user clicks Implement Linked List in Python link
    Then The user is redirected to ImplementLinkedListinPython page
    When The user clicks the Try here link
    Then The user is redirected to Try Editor page
    And The user enters some code in Try Editor and run the test
    Then The user sees the output

  @linkedlist5
  Scenario: Navigating to Traversal in linkedlistpage
    #Given The user is in LinkedListpage page after logged in
    When The user clicks Traversal link
    Then The user is redirected to Traversal page
    When The user clicks the Try here link
    Then The user is redirected to Try Editor page
    And The user enters some code in Try Editor and run the test
    Then The user sees the output

  @linkedlist6
  Scenario: Navigating to Insertion in linkedlistpage
    #Given The user is in "LinkedListpage" page after logged in
    When The user clicks Insertion link
    Then The user is redirected to Insertion page
    When The user clicks the Try here link
    Then The user is redirected to Try Editor page
    And The user enters some code in Try Editor and run the test
    Then The user sees the output

  @linkedlist7
  Scenario: Navigating to Deletion in linkedlistpage
    #Given The user is in "LinkedListpage" page after logged in
    When The user clicks Deletion link
    Then The user is redirected to Deletion page
    When The user clicks the Try here link
    Then The user is redirected to Try Editor page
    And The user enters some code in Try Editor and run the test
    Then The user sees the output

  @linkedlist8
  Scenario: Navigating to Practice Questions in linkedlistpage
    #Given The user is in "LinkedListpage" page after logged in
    When The user clicks Introduction link
    Then The user is redirected to Introduction page of linked list
    When The user clicks the Practice Questions link
    Then The user is redirected to PracticeQuestions page
   