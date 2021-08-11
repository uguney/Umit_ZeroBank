package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends BasePage{

    @FindBy(css = "#alert_content>span")
    public WebElement successfulPaymentMessage;

    @FindBy(id = "sp_payee")
    public WebElement payeeDropdown;

    @FindBy(id = "sp_account")
    public WebElement accountDropdown;

    @FindBy(id = "sp_amount")
    public WebElement amountInput;

    @FindBy(id = "sp_date")
    public WebElement dateInput;

    @FindBy(xpath = "(//table//td)[26]")
    public WebElement dateInput2;

    @FindBy(id = "sp_description")
    public WebElement descriptionInput;

    @FindBy(id = "pay_saved_payees")
    public WebElement payButton;



}
