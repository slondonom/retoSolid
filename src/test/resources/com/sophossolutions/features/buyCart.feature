@Web
Feature: Add a product to the shopping cart wong

  Scenario Outline: Add a product to the shopping cart
    Given The user open page wong
    When search the <product>
    And the product is add to the cart
    Then Check if the <product> was added to the cart with the name

  Examples:
  | product |
  | Pan Centeno Vollkorn Mestemacher 500 g  |