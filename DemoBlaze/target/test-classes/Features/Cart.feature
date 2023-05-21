#Author: Megha
@WebTest
Feature: To verify product added to cart displayed in Cart Page

  @SanityTest
  Scenario: To verify product in Cart page
    #Given User is on Home page of Demoblaze website
    Given Product should be added to cart
    When User clicks on Cart button
    Then Product should be displayed

