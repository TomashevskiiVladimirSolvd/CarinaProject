package com.solvd.qa.carina.demo.gui.pages.common;

import com.solvd.qa.carina.demo.gui.pages.desktop.*;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomePageCommon extends AbstractPage {

    public HomePageCommon(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
    }

    public abstract AddedToCartPage clickOnCartButton();

    public abstract boolean isPageOpened();

    public abstract DumbbellsPage searhItem(String item);

    public  abstract void hoverAccountListSigninButton();

    public abstract AccountPage clickOnAccountLink();

    public abstract  SignInPage clickOnSignInButton();

    public abstract void clickOnAllMenuButton();


    public abstract BestSellersPage clickOnBestSellerLink();

    public abstract CreateAccountPage clickOnStartNewCustomerLink();
}
