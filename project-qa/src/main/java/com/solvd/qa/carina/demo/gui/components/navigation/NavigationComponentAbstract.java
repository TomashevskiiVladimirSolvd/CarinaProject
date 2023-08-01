package com.solvd.qa.carina.demo.gui.components.navigation;

import com.solvd.qa.carina.demo.gui.pages.desktop.BestSellersPage;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class NavigationComponentAbstract extends AbstractUIObject {
    public NavigationComponentAbstract(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public NavigationComponentAbstract(WebDriver driver) {
        super(driver);
    }

    protected abstract void clickOnAllMenuButton();

    protected abstract BestSellersPage clickOnBestSellerLink();
}
