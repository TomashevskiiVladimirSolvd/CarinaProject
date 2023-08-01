package com.solvd.qa.carina.demo.gui.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomePageAbstract extends AbstractPage {

    public HomePageAbstract(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open() {
        super.open();
    }
}
