Feature: Login page automation of saucedemo app

Scenario Outline: check login is successfull with valid Cred

Given User is on login page
When User  enters valid "<username>" and "<password>"
And Clicks on login Button
Then User is navigated to home page 
And Close the browser


Examples:

| username | password |
| standard_user | secret_sauce |
#| locked_out_user | secret_sauce |
#| problem_user | secret_sauce |
#| performance_glitch_user | secret_sauce |

