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
@US3
Feature: As a user, I want to save my noise level recordings so that I can access them later.

  @Valid
  Scenario: Small local measurements button exists
    Given the user has the application launched
    When the user clicks the small record button
    Then the user verifies the small local measurements button exists

  @Valid
  Scenario: Local measurements menu exist
  	Given the user is in the audio record menu
  	When the user clicks the small local measurements button
  	Then the user verifies the local measurements menu exist

  @Valid
  Scenario: Save button is present
  	Given the user has the application launched
  	When the user clicks the small record button
  	And the user clicks the record button
  	Then the user verifies the save button is present

  @Valid
  Scenario: Noise level saved
		Given the user is in the audio record menu
		When the user clicks the save button
		And the user clicks the yes button
		And the user clicks the small local measurements button
		Then the user verifies the last card has the same noise level as the last measurement

