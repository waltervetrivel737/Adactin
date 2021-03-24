@kee
Feature: To validate Adactinpage and book room

Background:
Given user is in Adactin login page

Scenario: To verify Login page
When user enter valid username and valid password
And user click login button
Then user should be in search room details page and quit browser

Scenario: To verify user select room option
When user enter valid username and valid password
And user click login button
And user should be in search room details page
And user enter valid place hotel room roomcount checkin checkout and members
And user click searchroom button
Then user should be in select hotel page and quit browser

