package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OnlineBankingPage extends BasePage{


    @FindBy(className = "headers")
    public List<WebElement> onlineBankingHeaders;

    @FindBy(css = "ul.nav.nav-tabs>li")
    public List<WebElement> onlineBankingDetailedMenus;





    public void goToHeaderFromOnlineBanking (String headerName){
        String headerLocator = "//span[.='" + headerName + "']";

        WebElement headerElement = Driver.get().findElement(By.xpath(headerLocator));

        headerElement.click();
    }

}
