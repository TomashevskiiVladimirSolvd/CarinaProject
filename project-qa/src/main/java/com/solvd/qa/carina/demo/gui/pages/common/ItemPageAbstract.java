package com.solvd.qa.carina.demo.gui.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ItemPageAbstract extends AbstractPage {
    public ItemPageAbstract(WebDriver driver) {
        super(driver);
    }

    protected abstract AddedToCartPageAbstract addItemToCart();
}
