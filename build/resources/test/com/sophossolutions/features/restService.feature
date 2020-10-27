@Api
Feature: Register user through api

  Scenario Outline: Registration user
    Given Sebastian create a user with the post method in https://gorest.co.in/
    When Candidate provide information the post method with public-api/users
      | <first_name> | <last_name> | <gender> | <dob> | <email> | <status> |
    Then Candidate verify the creation of this user with the get method public-api/users/


    Examples:
      | first_name | last_name | gender | dob       | email           | status |
      | Sebastian  | Londono   | Male   | Candidate | sebasl02296@email.com | Active |
