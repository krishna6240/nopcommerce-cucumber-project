package com.nopcommerce.demo.pages;

import com.cucumber.listener.Reporter;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;



    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersTab;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']")
    WebElement desktopUnderComputers;


    public void clickOnLoginLink() {
        log.info("Clicking on login link");
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        log.info("Clicking on register link ");
        clickOnElement(registerLink);

    }

    public String verifyLogInLinkIsDisplayed() {
        String txt = getTextFromElement(loginLink);
        log.info("verify login Link ");
        return txt;
    }

    public void clickOnComputersTab() {
        log.info("Clicking on Computers tab");
        clickOnElement(computersTab);
    }

    public void mouseHoverOnComputer() {
        log.info("MouseHover on Computer link : ");
        mouseHoverToElement(computersTab);
    }
    public void mouseHoverAndClickOnDesktopUnderComputers(){
        log.info("MouseHover and click on Desktop link ");
        mouseHoverToElementAndClick(desktopUnderComputers);
    }



}
