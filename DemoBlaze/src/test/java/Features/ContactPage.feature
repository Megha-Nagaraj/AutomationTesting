#Author: Megha
@WebTest
Feature: User should be able to send a message

  @SanityTest
  Scenario Outline: User should be able to send a message
    Given User should be on Home page of Demoblaze application
    When User clicks on Contact Us button
    And User enter details <email>, <name> and <message> clicks on send button
    Then User should be able to see popup message

    Examples: 
      | email         | name | message       |
      | me1@imail.com | me1  | good app      |
      | me2@imail.com | me2  | User friendly |
