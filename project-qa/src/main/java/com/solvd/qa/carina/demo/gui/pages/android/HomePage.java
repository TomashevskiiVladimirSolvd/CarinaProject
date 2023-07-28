package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.HomePageCommon;
import com.solvd.qa.carina.demo.gui.pages.desktop.*;
import com.solvd.qa.carina.demo.gui.pages.desktop.AccountPage;
import com.solvd.qa.carina.demo.gui.pages.desktop.AddedToCartPage;
import com.solvd.qa.carina.demo.gui.pages.desktop.BestSellersPage;
import com.solvd.qa.carina.demo.gui.pages.desktop.DumbbellsPage;
import com.solvd.qa.carina.demo.gui.pages.desktop.SignInPage;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageCommon.class)
public class HomePage extends HomePageCommon {
    public HomePage(WebDriver driver){
        super(driver);
    }

    @Override
    public AddedToCartPage clickOnCartButton() {
        return null;
    }

    @Override
    public boolean isPageOpened() {
        return false;
    }

    @Override
    public DumbbellsPage searhItem(String item) {
        return null;
    }

    @Override
    public void hoverAccountListSigninButton() {

    }

    @Override
    public AccountPage clickOnAccountLink() {
        return null;
    }

    @Override
    public SignInPage clickOnSignInButton() {
        return null;
    }

    @Override
    public void clickOnAllMenuButton() {

    }

    @Override
    public BestSellersPage clickOnBestSellerLink() {
        return null;
    }

    @Override
    public CreateAccountPage clickOnStartNewCustomerLink() {
        return null;
    }

    @Override
    public <T extends AbstractPage> T initPage(Class<T> parentClass, Object... parameters) {
        return super.initPage(parentClass, parameters);
    }
}
