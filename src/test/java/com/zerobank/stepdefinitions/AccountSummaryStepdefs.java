package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.OnlineBankingPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountSummaryStepdefs {


    @Then("Page should have the following options")
    public void pageShouldHaveTheFollowingOptions(List<String> expectedOptions) {

        BrowserUtils.waitFor(2);
        List<String> actualTypes = BrowserUtils.getElementsText(new OnlineBankingPage().subHeadersOfOnlineBanking);

        Assert.assertEquals(expectedOptions, actualTypes);

        System.out.println("expectedAccountTypes = " + expectedOptions);
        System.out.println("actualTypes = " + actualTypes);


    }

    @Then("Table should have the following column names")
    public void tableShouldHaveTheFollowingColumnNames(List<String> expectedColumnNames) {

        List<String> actualColumnNames = BrowserUtils.getElementsText(new AccountSummaryPage().getColumnNamesOfTables(3));

        Assert.assertEquals(expectedColumnNames, actualColumnNames);


    }
}
