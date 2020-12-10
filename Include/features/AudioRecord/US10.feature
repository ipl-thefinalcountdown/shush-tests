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
@US10
Feature: As a user, I want to have a confirmation dialog after clicking the save button so that I can safely validate my choice.

  @Valid
  Scenario: Dialog exists
    Given the user has the application launched
    When the user clicks the small record button
    And the user clicks the record button
    And the user clicks the save button
    Then the user verifies the confirmation dialog exists

  @Valid
  Scenario: Cancel save
    Given the user is in the confirmation dialog
    When the user clicks in the cancel button
    Then the user verifies the save button is present
