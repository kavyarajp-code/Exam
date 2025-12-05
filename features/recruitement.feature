Feature: Recruitement module
Scenario: Add new candidate using valid credentials
Given the user is in the recruitement page for valid
When he enters "<fname>" as firstname "<mname>" as middlename "<lname>" as lastname and "<email>" as email
Then he successfully adds the candidate
Examples:
|fname | mname | lname|email        |
|as    |xa     |hg    |as@gmail.com |
|ds    |we     |tr    |ds@gmail.com |

Scenario Outline: add new candidate using invalid credentials
Given the user is in the recruitement page for invalid
When he enters "<fname>" as firstname "<mname>" as middlename "<lname>" as lastname and "<email>" as email for inv
Then system shows error
Examples:
|fname | mname | lname|email        |
|as    |xa     |hg    |as@gmail.co  |
|ds    |we     |tr    |ds@gm.co     |