Feature: Login Functionality

  Scenario: Verify login with valid credentials
    Given user is on the login page
    When user enters valid email "testuser@example.com" and password "password123"
    And clicks login
    Then user should be redirected to the contact list page

  Scenario: Verify login with incorrect password
    Given user is on the login page
    When user enters valid email "testuser@example.com" and password "wrongpass"
    And clicks login
    Then error message "Incorrect email or password" should be displayed
