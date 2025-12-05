Feature: Log in
Scenario: Login using valid credentials
Given the user is in the login page for valid
When he enters "Admin" as username and "admin123" as Password
Then he navigates to the home page

Scenario Outline: Login using invalid credentials
Given the user is in the login page for invalid
When he enters "<username>" as username and "<password>" as Password for inv
Then system throws an error
Examples:
     |username| password|
     |admin   | 123     |
     |qwerty  | 345     |
