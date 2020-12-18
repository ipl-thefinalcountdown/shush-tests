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
@US8
Feature: As a user I want to have a menu of statistics so that I can visualize noise level measurement's, local or shared, data statistics overtime.

  @Valid
  Scenario: Location chart menu and it's elements exist
    Given the user has the application launched
    When the user clicks the hambuguer menu button
    And the user clicks the hamburguer location chart menu button
    Then the user verifies location chart menu exists
    And the user verifies the chart tab options exist
    And the user verifies the chart local tab option exists
    And the user verifies the chart shared tab option exists
    And the user verifies the chart local tab option is selected

  @Valid
  Scenario: Location shared chart
    Given the user is on the location chart menu
    When the user clicks the chart shared tab option
    Then the user varifies the chart shared tab option is selected

  @Valid
  Scenario: Location local chart
    Given the user is on the location chart menu
    When the user clicks the chart local tab option
    Then the user verifies the chart local tab option is selected
