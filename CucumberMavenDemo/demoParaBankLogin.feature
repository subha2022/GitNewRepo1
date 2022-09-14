Feature: To test the customer login for para bank aplication

  Background: 
    Given lunch the application

  Scenario: login using valid credentials
    When valid user name and passwordare entered
    And click the login button
    Then display the user homepage
    And logout of the application
    And close the url

  Scenario: login using invalid credentials
    When invalid user name and password are entered
    And click the login button
    Then unable to login
    And close the url
