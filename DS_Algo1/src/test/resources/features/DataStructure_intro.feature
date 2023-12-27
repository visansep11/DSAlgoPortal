@tag
Feature: Data Structures-Introduction Homepage
  I want to use this template to access Data Structures-Introduction page

  Background: Data Structures-Introduction Homepage
    Given The user is in the Home page of ds-algo portal and click GetStarted button
    When user click on signin and enter valid username and valid password
    And user click on login button
    #Then user navigates to DSAlgo portal home page
    When The user clicks Get Started button below the Data structure-Introduction
    Then The user should land in Data structure-Introduction page
    When The user clicks Time Complexity button
   Then The user redirected to Time Complexity of Data Structure-Introduction
    
  @tag1
  Scenario: Data Structures-Introduction Homepage - TryHere
 
  When The user click on Try HereButton
  Then The user should be redirecetd to a page having an tryEditor with a Run button to test
  And The user see the output
  
  @tag2
   Scenario: Data Structures-Introduction Homepage - Practice Questions
  
  When The user clicks "Practice Questions" button
  Then The user redirected to "Practice Questions" of Data Structure-Introduction
  
 
		
		