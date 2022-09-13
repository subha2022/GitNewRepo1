Feature: To test the customer login for para bank aplication

  Scenario: login using valid credentials
    Given lunch the application
    When valid user name and passwordare entered
    And click the login button
    Then display the user homepage
    Then logout of the application
    And close the url

  Scenario: login using invalid credentials
    Given lunch the application
    When invalid user name and password are entered
    And click the login button
    Then unable to login
    And close the url
