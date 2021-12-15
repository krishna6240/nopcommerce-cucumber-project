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

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());
    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement pageTitle;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopLink;
    @CacheLookup
    @FindBy(xpath = "//div[@class='category-grid sub-category-grid']//h2/a")
    List<WebElement> subMenuLinks;
    public String getPageTitleText() {
        String message = getTextFromElement(pageTitle);
        log.info("Get pageTitle text : " + pageTitle.getText());
        return message;
    }
    public void clickOnDesktopLink(){
        clickOnElement(desktopLink);
    }

    public void clickOnSubMenu(String subTab) {
        for (WebElement menu : subMenuLinks) {
            if (menu.getText().contains(subTab)) {
                log.info("Click on '" + subTab + "' link");
                clickOnElement(menu);
                break;
            }
        }
    }
}