#Author: Megha
@WebTest
Feature: Test the Sign Up feature of application

  @SanityTest
  Scenario: Sign up with already existing user details
    Given User launches browser and hits the URL
    When User clicks on Sign Up
    And User enters valid Username and password
    And Clicks on signup button
    Then Verify user got the popup message
