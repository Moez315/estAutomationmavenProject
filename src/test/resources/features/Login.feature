Feature: As user I want to be able to Login under different roles
  # we using this scenario is for the ptactice

  Scenario: Login as a sales manger
       Given user is  on the Landing
       When user Logs in
       Then user should see dashboard page
