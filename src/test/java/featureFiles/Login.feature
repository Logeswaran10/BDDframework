#Author Loges
Feature: Login to Application

Scenario: Login to Vtiger Application with valid Credentials
Given i want to launch the browser
And enter the url
When login page is displayed enter the valid credentials
And Click on login button
Then validate if home page is displayed or not.