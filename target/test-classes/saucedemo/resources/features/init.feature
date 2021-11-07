Feature: User opens WebBrowser

  Scenario: Init WebBrowser
    Given User opens "chrome" Browser
    And User maximises browser
    Then User hits url
