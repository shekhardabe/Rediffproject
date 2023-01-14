Feature: Rediff mail Functionality

Background: Application Open successfuly

Given user open browser with "webdriver.chrome.driver" and "C:\\Automation support\\chromedriver.exe"
Given user enter url as "https://mail.rediff.com/cgi-bin/login.cgi"

Scenario: Check all functions working properly

When User click on login button
When User click on Ok button
When User RightClick on Page
When User find Title of page
When User find Tagname of page 
When User find No of frame on page
When user get current url of page