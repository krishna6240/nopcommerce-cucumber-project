Feature: Registration Feature
  As a user I want to register an account on nop commerce website

  Scenario: User should navigate to Register page successfully
    Given   I am on Home page
    When    I click on Register Link
    Then    I should navigate to Register page successfully


  Scenario: User should Register and create an account successfully
    Given   I am on Home page
    When    I click on Register Link
    And     I enter first name "krishna"
    And     I enter last name "Patel"
    And     I enter day "18"
    And     I enter month "May"
    And     I enter year "1979"
    And     I enter random email address
    And     I enter company name "Prime"
    And     I enter register password "abcd123"
    And     I enter register confirm password "abcd123"
    And     I click on Register button
    Then    I should be able to Register and create an account successfully

  Scenario Outline: Verify error message when user tries to register account without entering first name
    Given   I am on Home page
    When    I click on Register Link
    And     I enter last name "<last name>"
    And     I enter day "<day>"
    And     I enter month "<month>"
    And     I enter year "<year>"
    And     I enter email address "<email>"
    And     I enter company name "<company name>"
    And     I enter register password "<password>"
    And     I enter register confirm password "<confirm password>"
    And     I click on Register button
    Then    I should see the error message "<errorMessage>"
    Examples:
      | last name | day | month    | year | email         | company name        | password | confirm password | errorMessage            |
      | A         | 1   | February | 2008 | abc@gmail.com | Prime               | abc123   | abc123           | First name is required. |
      | B         | 1   | May      | 2009 | def@gmail.com | Testing             | def123   | def123           | First name is required. |
      | C         | 1   | November | 2010 | ghi@gmail.com | Square1             | ghi123   | ghi123           | First name is required. |
      | D         | 1   | February | 2014 | jkl@gmail.com | Interior Collection | jkl123   | jkl123           | First name is required. |
      | E         | 1   | January  | 2020 | mno@gmail.com | HarrowGS            | mno123   | mno123           | First name is required. |