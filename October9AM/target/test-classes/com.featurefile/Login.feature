Feature: Validate Login Functionality

  Background:
  Given User Navigates to Required Url

  @login
  Scenario: To Validate valid credentials
    When User Enters valid Username and Password
    And User Clicks the Login Button
    Then Validate System navigates to Home Page

  @login
  Scenario: To Validate valid credentials
    When User Enters valid Username and Password
    And User Clicks the Login Button
    Then Validate System navigates to Home Page

  @Window
  Scenario: To Handle windows
    Given User Navigates to Browser Url
    When User Count Products Link
    And Click Each Link to handle Windows

