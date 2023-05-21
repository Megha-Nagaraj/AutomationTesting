#Author: Megha
@WebTest
Feature: Purchasing a product from Demoblaze application

  @SanityTest
  Scenario: Adding product to cart
    Given User is on the homepage of demoblaze
    When User clicks on "Phone" category
    And User clicks on the firts product displayed on Phone category
    And User clicks on "Add to cart"
    Then User should be able to see "Product added" popup message
