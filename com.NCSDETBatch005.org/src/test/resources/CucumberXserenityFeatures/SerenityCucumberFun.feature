Feature: some functionality to generate serenity reports

Background: 
Given open a page with url in  browser

Scenario: login functionality with valid credentials positive test

When enter valid login  credentials
And click on login
Then verify login
And terminate browser

Scenario: login functionality with invalid credentials negative test

When enter invalid login  credentials
And click on login
Then verify login
And terminate browser



 