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
@US6
Feature: As a user, I want to have a share button so that I can share my noise level measurements with other users.

  @Valid
  Scenario: Share button exists
    Given the user has the application launched
    When the user clicks the small record button
    And the user clicks the record button
    Then the user verifies the share button exists

  @Valid
  Scenario: Share confirmation
    Given the user is in the audio record menu
    When the user clicks the share button
    Then the user verifies the confirmation dialog exists
    And the user verifies the Yes button exists
    And the user verifies the No button exists

