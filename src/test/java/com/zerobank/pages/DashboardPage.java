package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "(//a[@class=\"dropdown-toggle\"])[2]")
    public WebElement usernameProfile;

    @FindBy(xpath = "//strong[.='Online Banking']")
    public WebElement onlineBankingTab;


    public void navigateToTab (String tabName){
        String tabLocator = "//strong[contains(.,'" + tabName + "')]";

        WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));

        tabElement.click();
    }


}
