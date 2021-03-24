Feature: To validate Adaction page.

Background:
Given User is in Adactin login page.

@Smoke
Scenario: To validate End to End autamation
When User enters Login detials and clicks login.
	|dhasa8787|avengers|
And User selects location, hotel type and nof rooms.
And User enters checkin & checkout dates and nof person per room and click search.
And User selects the hotel and continues.
And User enters personal detials and clicks book now.
Then User with booking order screenshort. 

@Sanity
Scenario: To validate Forget password.
When User clicks forget password link.
Then User enters emailId and requests for password.

@Sanity
Scenario: To verfy New user registration.
When User clicks new regristration link.
And User enters his user name and password and conform password.
And User enters his full name and emailId.
And Use enters captcha text and clicks the checkbox.
Then User clicks register.

@adpg
Scenario: to loggin
When enters user name and pass
Then clicks login





