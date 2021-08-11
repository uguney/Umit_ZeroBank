package com.zerobank.stepdefinitions;

import com.zerobank.pages.DashboardPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepdefs {
    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {

        // codes are inside @Before
    }

    @When("the user enters user information")
    public void theUserEntersUserInformation() {

        LoginPage loginPage = new LoginPage();

        loginPage.login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));

        loginPage.backToSafetyButton.click();

    }


    @And("the user should be able to login")
    public void theUserShouldBeAbleToLogin() {

        Assert.assertTrue(new DashboardPage().usernameProfile.isDisplayed());

    }

    @When("the user enters {string} and {string}")
    public void theUserEntersAnd(String user_name, String pass_word) {
        new LoginPage().login(user_name, pass_word);

    }

    @And("the user should not be able to login")
    public void theUserShouldNotBeAbleToLogin() {

        Assert.assertTrue(new LoginPage().errorMessage.isDisplayed());
    }
}
