package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterSteps {
    @Given("^I am on Home page$")
    public void iAmOnHomePage() {

    }

    @When("^I click on Register Link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I should navigate to Register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully() {
       Assert.assertEquals(new RegisterPage().verifytextYourPersonalDetail(), "Your Personal Details");
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName) {
        new RegisterPage().enterFirstName(firstName);

    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastname) {
        new RegisterPage().enterlastName(lastname);
    }

    @And("^I enter day \"([^\"]*)\"$")
    public void iEnterDay(String dayBD) {
        new RegisterPage().enterDateField(dayBD);
    }

    @And("^I enter month \"([^\"]*)\"$")
    public void iEnterMonth(String monthBD) {
        new RegisterPage().enterDateField(monthBD);
    }

    @And("^I enter year \"([^\"]*)\"$")
    public void iEnterYear(String yearBD) {
        new RegisterPage().enterDateField(yearBD);

    }

    @And("^I enter random email address$")
    public void iEnterRandomEmailAddress() {
        new RegisterPage().enterRandomEmailId();
    }

    @And("^I enter company name \"([^\"]*)\"$")
    public void iEnterCompanyName(String comName) {
        new RegisterPage().enterCompanyName(comName);
    }

    @And("^I enter register password \"([^\"]*)\"$")
    public void iEnterRegisterPassword(String passwd) {
        new RegisterPage().enterPassword(passwd);
    }

    @And("^I enter register confirm password \"([^\"]*)\"$")
    public void iEnterRegisterConfirmPassword(String conPasswd) {
        new RegisterPage().enterConfirmPassword(conPasswd);
    }

    @And("^I click on Register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("^I should be able to Register and create an account successfully$")
    public void iShouldBeAbleToRegisterAndCreateAnAccountSuccessfully() {
        Assert.assertEquals(new RegisterPage().assertRegisterCompletedText(), "Your registration completed");
    }

    @And("^I enter email address \"([^\"]*)\"$")
    public void iEnterEmailAddress(String email) {
        new RegisterPage().enterEmailId(email);

    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String errMessg) {
        Assert.assertEquals(new RegisterPage().assertErrorText(), "First name is required.");

    }
}