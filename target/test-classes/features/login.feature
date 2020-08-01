
  Feature: :As a user, I should be able to login with correct credentials to different accounts.
    Accounts are helpdesk, marketing, hr

  Scenario:helpdesk login scenario
    Given User is in the login page
    When User logs in as helpdesk
    Then User should see ActivityStream

    @login
    Scenario:marketing login scenario
      Given User is in the login page
      When User logs in as marketing
      Then User should see ActivityStream

    Scenario:hr login scenario
      Given User is in the login page
      When User logs in as hr
      Then User should see ActivityStream