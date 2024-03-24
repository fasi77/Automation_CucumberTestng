Feature: Application login

Scenario: Admin page default login
   Given admin landed on netbanking page
   |username|
   |password|
   When User log into application
   Then Home page is displayed
   Then Card details are displayed
    
Scenario Outline: user page default login
   Given User landed on netbanking page <username> and <password>
   When User log into application
   Then Home page is displayed
   Then Card details are displayed
   
 Examples:
 |username|password|
 |user1   |1234    |
 |user2   |12345   |
