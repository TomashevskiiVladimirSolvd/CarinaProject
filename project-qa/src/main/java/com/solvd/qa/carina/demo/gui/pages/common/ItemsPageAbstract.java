package com.solvd.qa.carina.demo.gui.pages.common;

import com.solvd.qa.carina.demo.gui.pages.android.ItemPage;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ItemsPageAbstract extends AbstractPage {
    public ItemsPageAbstract(WebDriver driver) {
        super(driver);
    }

    protected abstract ItemPageAbstract clickOnPinkDumbells();
}
