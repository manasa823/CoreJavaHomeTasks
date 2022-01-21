@tag
Feature: Add to cart
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Successful addition of a product to cart
    Given user is in Home Page
    When user clicks on a Menu Item
    And user clicks on <Product>
    And user clicks on Add to Cart button
    And user navigates to shopping cart page
    Then user should find the <Product> in cart

    Examples: 
      | Product |
      |"Aquage Equalizing Detangler"|
      |"Hair Regrowth Treatment Revitalizes"|