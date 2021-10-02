Feature: My log in page
  Scenario: Mounika
  Given openbrowser
    When enter the url "http://practice.automationtesting.in/"
    And click on my account
    And enter rigister user name and password
    And click on login button
    Then user mustbe sucessesfully login to the webpage