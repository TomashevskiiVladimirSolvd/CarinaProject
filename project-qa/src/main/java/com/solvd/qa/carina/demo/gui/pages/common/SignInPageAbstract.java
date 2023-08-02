package com.solvd.qa.carina.demo.gui.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SignInPageAbstract extends AbstractPage {
    public SignInPageAbstract(WebDriver driver) {
        super(driver);
    }

    protected abstract void setEmail(String email);

    protected abstract void clickOnContinueButton();

    protected abstract String getErrorText();
}
