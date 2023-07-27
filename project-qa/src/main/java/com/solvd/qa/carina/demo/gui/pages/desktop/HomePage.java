package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.solvd.qa.carina.demo.gui.pages.common.HomePageCommon;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageCommon.class)
public class HomePage extends HomePageCommon {
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

   @FindBy(xpath ="//div[@id='nav-al-your-account']/descendant::span[1]")
   private ExtendedWebElement accountLink;

    @FindBy(xpath = "//div[@id='nav-flyout-ya-signin']//descendant::span")
    private ExtendedWebElement signInButton;

    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    private ExtendedWebElement allMenuButton;

    @FindBy(xpath = "//div[@id='hmenu-content']/descendant::a[1]")
    private ExtendedWebElement bestSellerLink;

    @FindBy(xpath="//div[@id='nav-flyout-ya-newCust']/a")
    private ExtendedWebElement startNewCustomerLink;


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

    public DumbbellsPage searhItem(String item){
        searchTextBox.click();
        searchTextBox.type(item);
        searhButton.click();
        return new DumbbellsPage(driver);
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

    public BestSellersPage clickOnBestSellerLink(){
        bestSellerLink.click();
        return new BestSellersPage(driver);
    }
}
