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
@US1
Feature: As a user, I want to have a map so that I can visualize the local noise level measurements

  @Valid
  Scenario: Map and objects exist
		Given the user has the application launched
		When the user navigates to the map
		Then the user verifies the map exists
		And the user verifies the measurements option tab exist
		And the user verifies the tab option local exist
		And the user verifies the tab option shared exist
