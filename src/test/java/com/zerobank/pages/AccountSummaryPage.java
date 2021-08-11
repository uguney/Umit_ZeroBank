package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class AccountSummaryPage extends BasePage {




/*
this method returns you a webElement List which includes the column names of the account type tables

    enter the table of Account type as an int num
    1 - Cash Accounts
    2 - Investment Accounts
    3 - Credit Accounts
    4 - Loan Accounts

  */
    public List<WebElement> getColumnNamesOfTables(int num){

        String columnNameLocator = "(//table/thead)[" + num + "]//th";

        List<WebElement> columnNamesOfTables = Driver.get().findElements(By.xpath(columnNameLocator));

        return columnNamesOfTables;
    }


}
