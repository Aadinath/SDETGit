Feature: This is background demo

Background: User is logged in to saucedemo app
Given User is accessing saucedemo login page
When User enters valid username and password
Then user should be able to navigate to Home Page

Scenario: Test Menu Items

#Given User access he saucedemo app login page
#When User enters valid creds

And click ob breadcrum icon
Then user should be able to see the menu items

Scenario: Verify add to cart functionality

#Given User access the saucedemo app login page
#When User enters the valid creds
And Clicks on Add to button 
Then Item should be added to the Cart