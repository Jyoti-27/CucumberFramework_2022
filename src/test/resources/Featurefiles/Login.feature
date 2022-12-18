@OrangeHRMLogin
Feature: Orange HRM Login validation

@Login1
Scenario:  login to Orange HRM application
Given user is login screen
When user enters userid and password  on login page
And user clicks on Login button
Then user should able to see dashboard page



@datawithoutExample
Scenario:  login to Orange HRM application
Given user is login screen
When user enters userid as "Admin" and password as "admin123"  on login page
And user clicks on Login button
Then user should able to see dashboard page


@datawithExample
Scenario Outline:  login to Orange HRM application
Given user is login screen
When user enters "<userid>" and "<password>"
And user clicks on Login button
Then user should able to see dashboard page
Examples:
|userid|password|
|Admin|admin123|


@datatable
Scenario:  login to Orange HRM application
Given user is login screen
When user enters credentials on login page
|userid|password|
|Admin|admin123|
And user clicks on Login button
Then user should able to see dashboard page






