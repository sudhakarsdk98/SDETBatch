Feature: NCLoginFunctionality

  Background: 
    Given open the NC login page
@retest
  Scenario Outline: Verify & Validate Email Field and Password Field
    Given refresh the login page
    Then verify that Email field present
    But verify that Password field present
    When validate "<Email>" field by providing multiple data in email field
    And validate "<Password>" field by providing multiple data in password field

    Examples: 
      | Email               | Password |
      | adminStore          | access   |
      | storekeeper         | keyEntry |
      | admin@yourstore.com | admin    |
