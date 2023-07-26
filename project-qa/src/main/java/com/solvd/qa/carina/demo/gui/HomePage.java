package com.solvd.qa.carina.demo.gui;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractUIObject {
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

   @FindBy(xpath = "//a[@class='nav-a nav-a-2   nav-progressive-attribute']")
    private ExtendedWebElement accountListSigninButton;

   @FindBy(xpath ="//div[@id='nav-al-your-account']/a[1]/span")
   private ExtendedWebElement accountLink;

    @FindBy(xpath = "//div[@id='nav-flyout-ya-signin']/a/span[contains(.,'Sign')]")
    private ExtendedWebElement signInButton;

    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    private ExtendedWebElement allMenuButton;


    public HomePage(WebDriver driver){
        super(driver);
    }

    public AddedToCartPage clickOnCartButton(){
        cartButton.click();
        return new AddedToCartPage(driver);
    }

    public boolean isPageOpened() {
        return logo.isElementPresent();
    }

    public DumbbellsPageAmazon searhDumbells(){
        searchTextBox.click();
        searchTextBox.type("dumbbells");
        searhButton.click();
        return new DumbbellsPageAmazon(driver);
    }

    public void hoverAccountListSigninButton(){
        accountListSigninButton.hover();
    }

    public AccountPage clickOnAccountLink(){
        accountLink.click();
        return new AccountPage(driver);
    }

    public SignInPage clickOnSignInButton(){
        signinButton.click();
        return new SignInPage(driver);
    }

    public void clickOnAllMenuButton(){
        allMenuButton.click();
    }

}
