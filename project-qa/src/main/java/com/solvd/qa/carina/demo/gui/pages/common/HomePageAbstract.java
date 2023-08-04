package com.solvd.qa.carina.demo.gui.pages.common;

import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;

public abstract class HomePageAbstract extends AbstractAmazonPage {

    public HomePageAbstract(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
    }

}
