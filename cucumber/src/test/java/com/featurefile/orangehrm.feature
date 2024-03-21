
Feature: orangehrm application

@AB-1
Scenario Outline: To verify login functionality in the application
Given user launch the browser
When user enter the username as "<uname>"
And user enter the password as "<pwd>"
And user click on the login button
Then user shuold navigate to the dashboard page

Examples: 
          |uname   |pwd     |
 					|Admin   |admin123|
 					|sureka  |admin123|
