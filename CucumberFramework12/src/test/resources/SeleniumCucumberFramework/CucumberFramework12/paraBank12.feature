Feature: To test the customer login for Para Bank Application

  Scenario: Login using valid credentials
    Given User is able to navigating the login page
    When User name and Password is entered
    And Click on the login button
    Then Display the log in homeage
    And logout the application
    And close the applicaton
