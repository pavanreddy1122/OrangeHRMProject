Feature: Login functionality for OrangeHRM employee management
  As a user of the Orange Website
  I want to be able to login with my account

  Background:
    Given I am on the Orange login page

  Scenario: Successful login with valid credentials
    Given I have entered valid username and password
    When I click the login button
    Then I should able to login successfull

