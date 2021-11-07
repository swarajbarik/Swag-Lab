Feature: User enters login credentials

  Scenario Outline: Validate login details for <Pre-Conditions> should show <Message>
    Given User reloads the page
    When User enters username as "<Username>"
    And User enters password as "<Password>"
    Then User hits login button
    Then User gets "<Message>"

    Examples: 
      | Pre-Conditions               | Username | Password | Message                                                      |
      | Blank Username and Password  |          |          | Username5 is required                                        |
      | Invalid user name & password | tester   | test123  | Username5 and password do not match any user in this service |
      #| Invalid user name &  blank password                    | tester            |                | Password is required                                          |
      #| Blank user name &  invalid password                    |                   | test123        | Username is required                                          |
      #| Valid user name with Uppercase Letter & valid password | Standard_user     | secret_sauce   | Username and password do not match any user in this service   |
      #| Valid user name & valid password with Uppercase Letter | standard_user     | Secret_saUcE   | Username and password do not match any user in this service |
      #| Space before/after user name & password                | ' standard_user ' | secret_sauce | Username and password do not match any user in this service   |
