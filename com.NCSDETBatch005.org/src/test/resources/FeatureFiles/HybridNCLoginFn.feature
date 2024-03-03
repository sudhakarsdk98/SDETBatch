Feature: HybridNCLoginFunctionality

  Background: 
    Given open NC login page

  Scenario Outline: Verify & Validate Email Field and Password Field
    Given refresh login page
    Then verify Email field present
    But verify Password field present
    When validate "<Email>" field by giving multiple data in email field
    And validate "<Password>" field by giving multiple data in password field

    Examples: 
      | Email               | Password |
      | adminStore          | access   |
      | storekeeper         | keyEntry |
      | admin@yourstore.com | admin    |

  @retesting
  Scenario: Test for User Credentials
    When validate Email field by giving data
      | Email           |
      | adminstore.     |
      | admin@yourstore |
    When validate Password field by giving data
      | adminstore |

  @userLoginFunction
  Scenario: Perform Login using valid credentials and logout
    Then verify Email field present
    When validate "admin@yourstore.com" field by giving positivedata in email field
    Then verify Password field present
    When validate "admin" field by giving positivedata in password field
    And click on login button
    And click on logout
