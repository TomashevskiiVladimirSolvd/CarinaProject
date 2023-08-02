package com.solvd.qa.carina.demo.gui.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class AddedToCartPageAbstract extends AbstractPage {
    public AddedToCartPageAbstract(WebDriver driver) {
        super(driver);
    }

    protected abstract String getAddedToCartText();
}
