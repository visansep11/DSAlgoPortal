@tag
Feature: DS Algo Portal
  I want to use this template for opening my DS Algo Portal

  Background: 
    Given The user opens DS Algo portal link
    Then The user should land in DS Algo portal page

  @tag1
  Scenario: DS Algo Portal Page
    When The user clicks the "Get Started" button
    Then The user should be redirected to homepage
