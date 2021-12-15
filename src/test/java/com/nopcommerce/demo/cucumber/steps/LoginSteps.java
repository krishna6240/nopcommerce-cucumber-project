package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    @Given("^I am on HomePage$")
    public void iAmOnHomePage() {
        System.out.println("I am on HomePage");
    }

    @When("^I Click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I verify that \"([^\"]*)\" message display$")
    public void iVerifyThatMessageDisplay(String message) {
        String actualText = new LoginPage().getWelcomeText();
        Assert.assertEquals("Welcome Text not Displayed", message, actualText);
    }


    @And("^I enter EmailId \"([^\"]*)\"$")
    public void iEnterEmailId(String message) {
        new LoginPage().enterEmailId(message);
    }

    @And("^I enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String message) {
        new LoginPage().enterPassword(message);
    }

    @And("^I click on Login Button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }


    @And("^I enter valid EmailId \"([^\"]*)\"$")
    public void iEnterValidEmailId(String message) {
        new LoginPage().enterEmailId(message);
    }

    @And("^I enter valid Password \"([^\"]*)\"$")
    public void iEnterValidPassword(String message) {
        new LoginPage().enterPassword(message);
    }

    @Then("^I Verify that LogOut link is display\\.$")
    public void iVerifyThatLogOutLinkIsDisplay() {
        String message = "Log out";
        String actualText = new LoginPage().verifyLogoutLinkIsDisplayedAfterLogin();
        Assert.assertEquals("Log out", message, actualText);
    }


    @Then("^I Verify that Error message displayed\\.$")
    public void iVerifyThatErrorMessageDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = new LoginPage().verifyErrorMessage();
        Assert.assertEquals("Error message not displayed", expectedMessage, actualMessage);
    }


    @And("^I click on LogOut Link$")
    public void iClickOnLogOutLink() {
        new LoginPage().clickOnLogOutLink();
    }

    @Then("^Verify that LogIn Link Display$")
    public void verifyThatLogInLinkDisplay() throws InterruptedException {
        Thread.sleep(2000);
        String expectedMessage = "Log in";
        String actualMessage = new HomePage().verifyLogInLinkIsDisplayed();
        org.testng.Assert.assertEquals("Log in", expectedMessage, actualMessage);
    }
}