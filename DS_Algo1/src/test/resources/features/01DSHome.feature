@tag
Feature: DS_AlgoHomePage Feature
  I want to open my DS_Algo Home Page

  Background: User opens Homepage
    Given The user opens Homepage
    And The user should see 6 panes with different data structures
    When The user clicks "Data Structures" drop down

  @tag1
  Scenario: DS_Algo Home Page
   
    Then I should see 6 different data structure entries in that dropdown

  @tag2
  Scenario: DS_Algo Home Page
   
    When The user select any data structues item from the drop down without sign in
    Then It should alert the user with a message "you are not logged in"

  @tag3
  Scenario: DS_Algo Home Page
    When The user clicks any of the "Get Started" buttons below the data structures
    Then It displays alert message "you are not logged in"

  @tag4
  Scenario: DS_Algo Home Page
    When The user clicks "Sign in" link
    Then The user should be redirected to Sign in page

  @tag5
  Scenario: DS_Algo Home Page
    When The user clicks "Register"
    Then The user should be redirected to Register form
