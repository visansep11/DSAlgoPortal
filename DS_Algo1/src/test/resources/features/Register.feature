@tag
Feature: Register feature
  I want to use this template to register into DSAlgo application

  Background: 
    Given The user is in the Home page of ds-algo portal page
    When The user clicks on the Register link
    Then The user is taken to the registration page

  @tag3
  Scenario Outline: Register Scenario outline
    When The user fills the form from given sheetname "<SheetName>" and rownumber <RowNumber>
    And clicks the register button
    Then Verify the register "<Status>"

    Examples: 
      | SheetName    | RowNumber |
      | Registerdata |         0 |
      | Registerdata |         1 |
      | Registerdata |         2 |
      | Registerdata |         3 |
      | Registerdata |         4 |
      | Registerdata |         5 |
      | Registerdata |         6 |
      | Registerdata |         7 |
#
  #@tag4
  #Scenario: Login scenario in Registration Page
   #Given The user is in registration page
    #When The user clicks on login button
    #Then The user redirects to login page
