Feature: Login functionality for OrangeHRM employee management
  As a user of the Orange Website
  I want to be able to login with my account

  Background:
    Given I am on the Orange login page

  @sanity
  Scenario: Verify login with valid credentials
    Given I have entered valid username and password
    When I click the login button
    Then I should able to login successfull

  @sanity
  Scenario Outline: Verify login with invalid username
    Given I have entered "<Usernsme>" and "<password>"
    When I click the login button
    Then I should able to get "<Error message>"
    Examples:
      | Usernsme | password | Error message       |
      | admin123 | admin123 | Invalid credentials |

  @sanity
  Scenario Outline: Verify login with invalid password
    Given I have entered "<Usernsme>" and "<password>"
    When I click the login button
    Then I should able to get "<Error message>"
    Examples:
      | Usernsme | password | Error message |
      | Admin | Admin | Invalid credentials |

  @sanity
  Scenario Outline: Verify login with invalid password
    Given I have entered "<Usernsme>" and "<password>"
    When I click the login button
    Then I should able to get "<Error message1>" and "<Error message2>"
    Examples:
      | Usernsme | password | Error message1      | Error message2 |
      |          |          | Required |   Required             |

  @sanity
  Scenario: Verify Forgot Password functionality
    When I click the Forgot Password Link
    Then I should able to enter resetPassword Page

  @sanity
  Scenario: Verify user is navigated to Dashboard after successful login
    Given I have entered valid username and password
    When I click the login button
    Then I should able to navigated to Dashboard

  @sanity1
  Scenario: Verify Logout functionality
    Given I have entered valid username and password
    When I click the login button
    Then I should able to login successfull



