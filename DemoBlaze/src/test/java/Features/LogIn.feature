#Author: Megha
@WebTest
Feature: Negative scenario for Login

  @SanityTest
  Scenario: Verifying when user doesnot enter data into username and password in Login Page
    Given User should be on Home page of Demoblaze
    When User clicks on Login button on home page
    And User clicks on Login in Login page
    Then User should get alert message

 