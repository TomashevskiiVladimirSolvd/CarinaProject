package com.solvd.qa.carina.demo.gui.components.navigator;

import com.solvd.qa.carina.demo.gui.pages.desktop.*;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends HeaderCommon {
    @FindBy(xpath ="//input[@id='twotabsearchtextbox']")
    private ExtendedWebElement searchTextBox;

    @FindBy(xpath ="//input[@id='nav-search-submit-button']")
    private ExtendedWebElement searhButton;

    @FindBy(xpath = "//a[@id='nav-cart']")
    private ExtendedWebElement cartButton;
    @FindBy(xpath = "//a[@id='nav-logo-sprites']")
    private ExtendedWebElement logo;

    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    private ExtendedWebElement accountListSigninButton;

    @FindBy(xpath="//div[@id='nav-flyout-ya-newCust']/a")
    private ExtendedWebElement startNewCustomerLink;

    @FindBy(xpath ="//div[@id='nav-al-your-account']//span")
    private ExtendedWebElement accountLink;

    public Header(WebDriver driver) {
        super(driver);
    }


    @Override
    public SearchItemsPage searhItem(String item){
        searchTextBox.click();
        searchTextBox.type(item);
        searhButton.click();
        return new SearchItemsPage(driver);
    }

    @Override
    public boolean isPageOpened() {
        return logo.isElementPresent();
    }

    @Override
    public void hoverAccountListSigninButton(){
        accountListSigninButton.hover();
    }

    @Override
    public CreateAccountPage clickOnStartNewCustomerLink(){
        startNewCustomerLink.click();
        return new CreateAccountPage(driver);
    }

    @Override
    public AccountPage clickOnAccountLink(){
        accountLink.click();
        return new AccountPage(driver);
    }
    @Override
    public SignInPage clickOnAccountListSigninButton(){
        accountListSigninButton.click();
        return new SignInPage(driver);
    }

}
