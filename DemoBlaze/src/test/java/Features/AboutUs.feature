#Author: Megha
@WebTest
Feature: About Us page video play

  @SanityTest
  Scenario: To verify that User can play the video in About Us page
    Given User should be on Home page of Demoblaze website
    When User clicks on About us link
    And Clicks on play button
    Then About Us dialog box appears
    And Video starts playing
