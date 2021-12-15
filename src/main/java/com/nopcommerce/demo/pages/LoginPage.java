package com.nopcommerce.demo.pages;

import com.cucumber.listener.Reporter;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logoutLink;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement invalidLoginError;


    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailError;


    public String getWelcomeText() {
        String txt = getTextFromElement(welcomeText);
        log.info("Getting welcome text: " + welcomeText.toString());
        return txt;
    }

    public String verifyErrorMessage() {
        String txt = getTextFromElement(invalidLoginError);
        log.info("Getting welcome text: " + invalidLoginError.toString());
        return txt;
    }

    public void enterEmailId(String email) {
        log.info("Entering email address : " + email + " to email field ");
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        log.info("Entering password : " + password + " to password field");
        sendTextToElement(passwordField, password);
    }


    public void clickOnLoginButton() {
        log.info("Clicking on login button");
        clickOnElement(loginButton);
    }
    public void clickOnLogOutLink() {
        log.info("Clicking on logout link ");
        clickOnElement(logoutLink);
    }

    public String verifyLogoutLinkIsDisplayedAfterLogin() {
        String txt = getTextFromElement(logoutLink);
        log.info("verify  logout Link : " + logoutLink.toString());
        return txt;
    }

}