Feature: LoginPageTest
  As a user I want to login on website

  @Sanity @Regression
  Scenario: User Should Navigate To LoginPage SuccessFully.
    Given I am on HomePage
    When I Click on login link
    Then I verify that "Welcome, Please Sign In!" message display

  @Smoke @Regression
  Scenario: Verify The Error Message With  InValidCredentials.
    Given I am on HomePage
    When I Click on login link
    And I enter EmailId "Test1234@gmail.com"
    And I enter Password "password123"
    And I click on Login Button
    Then I Verify that Error message displayed.

  @Sanity @Regression
  Scenario: Verify That User Should LogIn SuccessFully With ValidCredentials.
    Given I am on HomePage
    When I Click on login link
    And I enter valid EmailId "abcde@gmail.com"
    And I enter valid Password "abcd123"
    And I click on Login Button
    Then I Verify that LogOut link is display.

  @Smoke @Regression
  Scenario: Verify That User Should LogOut SuccessFully()
    Given I am on HomePage
    When I Click on login link
    And I enter valid EmailId "abcde@gmail.com"
    And I enter valid Password "abcd123"
    And I click on Login Button
    And I click on LogOut Link
    Then Verify that LogIn Link Display