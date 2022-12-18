
@tag
Feature: Login validation


Background: user needs to logged in
Given user needs to access application
Then user should have internet connection





@tag1  @smoke
Scenario: verify user login is sucessfull
Given user is on Login page
When user enters userid and password
And clicks on Login button
Then user is able to see dashboard screen



@tag2  @ignore @smoke
Scenario: verify user login is sucessfull
Given user is on Login page
When user enters userid and password
And clicks on Login button
Then user is able to see dashboard screen


@tag3  
Scenario: verify user login is sucessfull
Given user is on Login page
When user enters userid and password
And clicks on Login button
Then user is able to see dashboard screen