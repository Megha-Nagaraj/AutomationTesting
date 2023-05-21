#Author: Megha
@WebTest
Feature: Home Page access

  @SanityTest
  Scenario: User is able to access Demo_blaze Website in the browser
    Given User launches browser hits the URL
    When User lands on Home page
    Then Verify User landed on home page
