package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AccountActivityStepdefs {


    @Then("Default option should be {string} in the Account dropdown")
    public void defaultOptionShouldBeInTheAccountDropdown(String name) {


        Select select = new Select(new AccountActivityPage().accountDropdown);

        Assert.assertEquals(name, select.getFirstSelectedOption().getText());

    }

    @Then("Account drop down should have the following options")
    public void accountDropDownShouldHaveTheFollowingOptions(List<String> expectedOptions) {

        Select select = new Select(new AccountActivityPage().accountDropdown);

        List<String> actualOptions = new ArrayList<>();

        List<WebElement> actualElement = select.getOptions();

        for (WebElement webElement : actualElement) {

            actualOptions.add(webElement.getText());
        }

        Assert.assertEquals(expectedOptions, actualOptions);

    }

    @Then("Transactions table should have the following column names")
    public void transactionsTableShouldHaveTheFollowingColumnNames(List<String> expectedColumnNames) {

        List<String> actualColumnNames = BrowserUtils.getElementsText(new AccountActivityPage().columnNamesOfShowTransactionTable);

        Assert.assertEquals(expectedColumnNames, actualColumnNames);


    }
}
