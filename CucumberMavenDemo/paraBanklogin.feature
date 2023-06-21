Feature: To test the customer login for para bank aplication

  Scenario: Test the login using valid credential
    Given to navigate the url
    When enter the user name and password
    And click the login button
    Then display the user homepage
    Then logout of the application
    And close the url
