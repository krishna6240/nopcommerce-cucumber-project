package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class DesktopPageTest {
    @Then("^I Verify \"([^\"]*)\" page$")
    public void iVerifyPage(String message) {
        String actualText = new DesktopPage().getPageTitleText();
        Assert.assertEquals("you are not on Desktop Page", message, actualText);
    }


    @And("^I Click on product name \"([^\"]*)\"$")
    public void iClickOnProductName(String productName) {
        new DesktopPage().selectProduct(productName);
    }

    @And("^Select processor \"([^\"]*)\"$")
    public void selectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("^Select RAM \"([^\"]*)\"$")
    public void selectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("^Select HDD \"([^\"]*)\"$")
    public void selectHDD(String hDD) {
        new BuildYourOwnComputerPage().selectHDD(hDD);
    }

    @And("^Select OS \"([^\"]*)\"$")
    public void selectOS(String oS) {
        new BuildYourOwnComputerPage().selectOS(oS);
    }

    @And("^Select Software \"([^\"]*)\"$")
    public void selectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }


    @Then("^Verify message \"([^\"]*)\"$")
    public void verifyMessage(String message) {
        String actualMessage = new BuildYourOwnComputerPage().getProductAddedMessage();
        Assert.assertEquals("Product not added", message, actualMessage);
    }

    @And("^Click on ADD TO CART Button$")
    public void clickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }
}


