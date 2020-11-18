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
@US2
Feature: Audio Recorder
  As a user, I want to be able to record audio so that I can calculate the noise level in my current location.

  @Valid
  Scenario: Small record button is present
    Given the user has the app launched
    When the user enters the view
    Then the user verifies the button is present

  @Valid
  Scenario Outline: Audio record menu and respective objects exist
    Given the user is in the view
    When the user clicks the small button
    Then the user navigates to the audio record menu
    And the user verifies the record button is present
    And the user verifies the decibel counter is present
    And the user verifies the chronometer is present
    And the user varifies the decibel counter text is <decibelCounterText>
    And the user verifies the chronometer text is <chronometerText>

    Examples:
      | decibelCounterText | chronometerText |
      | 0 dB               | 00:00           |
