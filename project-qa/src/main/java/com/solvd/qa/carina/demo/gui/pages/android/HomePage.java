package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.HomePageCommon;
import com.solvd.qa.carina.demo.gui.pages.desktop.*;
import com.solvd.qa.carina.demo.gui.pages.desktop.AccountPage;
import com.solvd.qa.carina.demo.gui.pages.desktop.AddedToCartPage;
import com.solvd.qa.carina.demo.gui.pages.desktop.BestSellersPage;
import com.solvd.qa.carina.demo.gui.pages.desktop.SearchItemsPage;
import com.solvd.qa.carina.demo.gui.pages.desktop.SignInPage;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageCommon.class)
public class HomePage extends HomePageCommon {
    public HomePage(WebDriver driver){
        super(driver);
    }
}
