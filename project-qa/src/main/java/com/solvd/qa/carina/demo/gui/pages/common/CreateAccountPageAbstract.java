package com.solvd.qa.carina.demo.gui.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CreateAccountPageAbstract extends AbstractPage {
    public CreateAccountPageAbstract(WebDriver driver) {
        super(driver);
    }

    protected abstract void typeName(String name);

    protected abstract void setEmail(String email);

    protected abstract void setPassword(String password);
}
