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
@US9
Feature: As a user I want to have a menu to create notifications so that I can receive notifications from a location area.

  @Valid
  Scenario: Notification received
    Given the user has the application launched
    When the user clicks the small record button
    And the user clicks the record button
    And the user clicks the share button
    And the user clicks the yes button
    Then the user receives a notification
