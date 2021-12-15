$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginPageTest",
  "description": "As a user I want to login on website",
  "id": "loginpagetest",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7384577500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User Should Navigate To LoginPage SuccessFully.",
  "description": "",
  "id": "loginpagetest;user-should-navigate-to-loginpage-successfully.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    },
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I Click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I verify that \"Welcome, Please Sign In!\" message display",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 197826200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 1193077500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome, Please Sign In!",
      "offset": 15
    }
  ],
  "location": "LoginSteps.iVerifyThatMessageDisplay(String)"
});
formatter.result({
  "duration": 55477400,
  "status": "passed"
});
formatter.after({
  "duration": 796742800,
  "status": "passed"
});
formatter.before({
  "duration": 3614303500,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify The Error Message With  InValidCredentials.",
  "description": "",
  "id": "loginpagetest;verify-the-error-message-with--invalidcredentials.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Smoke"
    },
    {
      "line": 10,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I am on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I Click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter EmailId \"Test1234@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter Password \"password123\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I Verify that Error message displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 155700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 1463695100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test1234@gmail.com",
      "offset": 17
    }
  ],
  "location": "LoginSteps.iEnterEmailId(String)"
});
formatter.result({
  "duration": 124858800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password123",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 112820600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 442353400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iVerifyThatErrorMessageDisplayed()"
});
formatter.result({
  "duration": 3058126300,
  "status": "passed"
});
formatter.after({
  "duration": 839711200,
  "status": "passed"
});
formatter.before({
  "duration": 3258190300,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Verify That User Should LogIn SuccessFully With ValidCredentials.",
  "description": "",
  "id": "loginpagetest;verify-that-user-should-login-successfully-with-validcredentials.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@Sanity"
    },
    {
      "line": 19,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I am on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I Click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I enter valid EmailId \"abcdef@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I enter valid Password \"abcd123\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I Verify that LogOut link is display.",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 79500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 1226552100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcdef@gmail.com",
      "offset": 23
    }
  ],
  "location": "LoginSteps.iEnterValidEmailId(String)"
});
formatter.result({
  "duration": 115875400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd123",
      "offset": 24
    }
  ],
  "location": "LoginSteps.iEnterValidPassword(String)"
});
formatter.result({
  "duration": 106943100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 449448600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iVerifyThatLogOutLinkIsDisplay()"
});
