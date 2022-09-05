Feature: To test the customer login gor the parabank applcation

  Scenario: Login using valid credentials
    Given User is able to navigating the login page
    When username and password are entered
    And click on the loging button
    Then Display the user home page
    And logout the application
    * close the application
