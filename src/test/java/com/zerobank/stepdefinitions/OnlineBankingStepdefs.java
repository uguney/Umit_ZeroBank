package com.zerobank.stepdefinitions;

import com.zerobank.pages.DashboardPage;
import com.zerobank.pages.OnlineBankingPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class OnlineBankingStepdefs {


    @When("the user navigates to {string} tab")
    public void theUserNavigatesToTab(String tabName) {

        new DashboardPage().navigateToTab(tabName);

    }


    @And("the user goes to {string} header")
    public void theUserGoesToHeader(String headerName) {

        new OnlineBankingPage().goToHeaderFromOnlineBanking(headerName);

    }

    @Then("Page should have the title {string}")
    public void pageShouldHaveTheTitle(String title) {

        Assert.assertEquals(title, Driver.get().getTitle());

    }
}
