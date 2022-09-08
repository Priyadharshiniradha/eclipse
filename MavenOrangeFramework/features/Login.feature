@GetCEOname
Feature: This feature is to verify the CEO name
Scenario Outline: Verifing CEO name
Given: the user gets successfully logged in with
       |username|password|
       |admin|admin123|
When: the user clicks the directory option
When: the user selects the job title as "CEO"
Then: the user should see the CEO name as "<CEO name>"
Examples:
|CEO name|
|John Smith|
i