@Regression @smoke @login
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts.  And dashboard should be displayed.

  Accounts are: librarian, student, admin

  Background: For the scenarios in this feature file, user is expected to be on login page
    #Background is like beforemethod in testng
  Given user is on the library login page

  @librarian @employee
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

    @student
    Scenario: Login as student
      When user enters student username
      And user enters student password
      Then user should see the dashboard

      @admin @employee
      Scenario: Login as admin
        When user enter admin username
        And user enters admin password
        Then user should see the dashboard

        #this is how we comment in feature file
  #wip means work in progress

