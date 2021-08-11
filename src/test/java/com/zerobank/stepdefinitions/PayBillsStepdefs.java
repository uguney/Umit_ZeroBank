package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.time.LocalDate;

public class PayBillsStepdefs {

    PayBillsPage payBillsPage = new PayBillsPage();

    @When("the user enters {string} as dollar")
    public void theUserEntersAsDollar(String amountOfDollar) {

        payBillsPage.amountInput.sendKeys(amountOfDollar);
    }

    @And("the user click the dateInput")
    public void theUserClickTheDateInput() {

        payBillsPage.dateInput.click();

       // Scenario: User should be able to complete a successful pay operation
        //    When the user enters "16" as dollar
        //    And the user click the dateInput
        //    And the user pick a date
        //    And the user enters a "my credit payment" as description
        //    And the user clicks the pay button
        //    Then "The payment was successfully submitted." should be displayed


    }

    @And("the user pick a date")
    public void theUserPickADate() {

        payBillsPage.dateInput2.click();
    }



/*
        LocalDate firstDate = LocalDate.parse("2021-08-01");
        LocalDate secondDate = LocalDate.parse("2021-08-06");

        if(secondDate.isEqual(firstDate) || secondDate.isAfter(firstDate)){

            JavascriptExecutor jse = (JavascriptExecutor) Driver.get();

            jse.executeScript("arguments[0].click();", payBillsPage.dateInput);

            payBillsPage.dateInput.sendKeys(secondDate.toString());

        }



 */


    @And("the user enters a {string} as description")
    public void theUserEntersAAsDescription(String description) {

        payBillsPage.descriptionInput.sendKeys(description);
    }

    @And("the user clicks the pay button")
    public void theUserClicksThePayButton() {
        payBillsPage.payButton.click();
    }

    @Then("{string} should be displayed")
    public void shouldBeDisplayed(String submitMessage) {

        Assert.assertEquals(submitMessage, payBillsPage.successfulPaymentMessage.getText());

    }


    @Then("{string} message should be displayed")
    public void messageShouldBeDisplayed(String expectedMessage) {
        // "Please fill out this field."
        //this is browser msg, not html msg. So we cannot locate as an element

        String actualMsg= payBillsPage.amountInput.getAttribute("validationMessage");

        Assert.assertEquals(expectedMessage,actualMsg);

    }

    @And("the user tries to write alphabetical characters {string} into dateInput")
    public void theUserTriesToWriteAlphabeticalCharactersIntoDateInput(String str) {

        payBillsPage.dateInput.sendKeys(str);
    }

    @Then("{string} message should be displayed for dateInput")
    public void messageShouldBeDisplayedForDateInput(String expectedMessage) {

        // "Please fill out this field."
        //this is browser msg, not html msg. So we cannot locate as an element

        String actualMsg= payBillsPage.dateInput.getAttribute("validationMessage");

        Assert.assertEquals(expectedMessage,actualMsg);
    }

    @And("the user enter a date from past")
    public void theUserEnterADateFromPast() {

        String pastDate = LocalDate.now().minusDays(1).toString(); //   2021-08-09

        payBillsPage.dateInput.sendKeys(pastDate);


    }
}
