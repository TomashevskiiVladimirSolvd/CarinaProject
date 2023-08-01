package com.solvd.qa.carina.demo.gui.components.navigator;

import com.solvd.qa.carina.demo.gui.pages.desktop.AccountPage;
import com.solvd.qa.carina.demo.gui.pages.desktop.CreateAccountPage;
import com.solvd.qa.carina.demo.gui.pages.desktop.SearchItemsPage;
import com.solvd.qa.carina.demo.gui.pages.desktop.SignInPage;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class HeaderCommon extends AbstractUIObject {
    public HeaderCommon(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public HeaderCommon(WebDriver driver) {
        super(driver);
    }

    protected abstract SearchItemsPage searhItem(String item);

    public abstract boolean isPageOpened();
    protected abstract void hoverAccountListSigninButton();
    protected abstract CreateAccountPage clickOnStartNewCustomerLink();
    protected abstract AccountPage clickOnAccountLink();
    protected abstract SignInPage clickOnAccountListSigninButton();

}