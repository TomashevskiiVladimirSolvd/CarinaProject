package com.solvd.qa.carina.demo.gui.components.header;

import com.solvd.qa.carina.demo.gui.pages.desktop.AccountPage;
import com.solvd.qa.carina.demo.gui.pages.desktop.CreateAccountPage;
import com.solvd.qa.carina.demo.gui.pages.desktop.ItemsPage;
import com.solvd.qa.carina.demo.gui.pages.desktop.SignInPage;
import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class HeaderComponentAbstract extends AbstractUIObject implements ICustomTypePageFactory {
    public HeaderComponentAbstract(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public HeaderComponentAbstract(WebDriver driver) {
        super(driver);
    }

    protected abstract ItemsPage searhItem(String item);

    public abstract boolean isPageOpened();

    protected abstract void hoverAccountListSigninButton();

    protected abstract CreateAccountPage clickOnStartNewCustomerLink();

    protected abstract AccountPage clickOnAccountLink();

    protected abstract SignInPage clickOnAccountListSigninButton();

}
