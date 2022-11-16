Feature: Login on Swag Labs Mobile App

  Scenario Outline: Create a purchase
    Given Tester does the login to portal brokers with email <email> and password <password>
    When Tester choose a product
    Then Tester save in cart this product
    And Tester buy the product

    Examples:
      | email         | password     |
      | standard_user | secret_sauce |
      | standard_user | secret_sauce |
      | standard_user | secret_sauce |
