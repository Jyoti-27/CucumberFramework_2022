@OrangeHRMAssignLeave
Feature: Orange HRM AssignLeave validation

Scenario Outline:  Verify user is able to assign leave
Given user is already logged in and is on Dashboard page
When user enters "<EmployeeName>" , "<LeaveType>" , "<fromDate>" , "<toDate>" , "<Comment>" on Assign Leave Page
And user clicks on assign button 
Then user should able to get Assign leave successfully
Examples:
|EmployeeName|LeaveType|fromDate|toDate|Comment|
|Jasmine Morgan|US - Personal|2022-08-23|2022-08-23|This is test Comment|
 
 
 
