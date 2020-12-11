#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@US7
Feature: As a user I want to have a shared data map so that I can visualize other user's noise level measurements.

  @Valid
  Scenario: Switch to shared map
    Given the user has the application launched
    When the user navigates to the map
    And the user clicks the tab option shared
    Then the user verifies he is on the shared mode
