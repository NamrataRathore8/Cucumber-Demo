Feature: To login into application

Background: 
Given login page

## Ctrl+/ will comment the selected text at once
#Scenario: To test login with valid credentials

#When Enter valid name "Admin"
#And Enter valid password "admin123"
#And Click on Submit button
#Then I should see the username as "Welcome Paul"
#
#Scenario: To test login with valid credentials
#When Enter valid name "Admin"
#And Enter valid password "admin123"
#And Click on Submit button
#Then I should see the username as "Welcome Paul"

Scenario Outline: To test login with multiple data
When Enter valid name "<name>"
And Enter valid password "<pwd>"
And Click on Submit button
Then I should see the username as "<login name>"
 
 #Data driven/Parameterized cucumber
Examples:
|name |pwd     |loginname   |
|Admin|admin123|Welcome Paul|
|Admin|admin123|Welcome Paul|

Scenario: To test login with invalid credentials


When Enter invalid name "Admin1"
And Enter invalid password "admin1234"
And Click on Submit button
Then I should see username as "Welcome Paul"