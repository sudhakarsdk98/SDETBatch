Feature: HybridNCLoginFunctionality

  Background: 
    Given open the NC login page

  

  @retesting
  Scenario: Test for User Credentials
    When validate Email field by providing data
      | Email           |
      | adminstore.     |
      | admin@yourstore |
    When validate Password field by providing data
      | adminstore |

  @userLoginFunction
  Scenario: Perform Login using valid credentials and logout
    Then verify that Email field present
    When validate "admin@yourstore.com" field by providing valid data in email field
    Then verify that Password field present
    When validate "admin" field by providing valid data in password field
    And click on nclogin button
    And click on nclogout
