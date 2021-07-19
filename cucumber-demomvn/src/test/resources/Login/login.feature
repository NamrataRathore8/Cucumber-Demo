Feature: To login into application

Scenario: To test login with valid credentials

Given login page
When Enter valid name "Admin"
And Enter valid password "admin123"
And Click on Submit button
Then I should see the username as "Welcome Paul"