package com.solvd.qa.carina.demo.gui;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePageAmazon extends AbstractUIObject {
    @FindBy(xpath = "//a[@id='nav-cart']")
    private ExtendedWebElement cartButton;

    @FindBy(xpath ="//input[@id='twotabsearchtextbox']")
    private ExtendedWebElement searchTextBox;

    @FindBy(xpath ="//input[@id='nav-search-submit-button']")
    private ExtendedWebElement searhButton;

    @FindBy(xpath = "//a[@id='nav-logo-sprites']")
    private ExtendedWebElement logo;

    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    private ExtendedWebElement signinButton;



    public HomePageAmazon(WebDriver driver){
        super(driver);
    }

    public CartPage clickOnCartButton(){
        cartButton.click();
        return new CartPage(driver);
    }
}
