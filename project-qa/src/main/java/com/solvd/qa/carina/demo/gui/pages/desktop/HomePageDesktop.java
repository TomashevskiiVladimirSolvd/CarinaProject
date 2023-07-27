package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.solvd.qa.carina.demo.gui.pages.common.HomePageCommon;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageCommon.class)
public class HomePageDesktop extends HomePageCommon {
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


    public HomePageDesktop(WebDriver driver){
        super(driver);
    }

    public AddedToCartPageDesktop clickOnCartButton(){
        cartButton.click();
        return new AddedToCartPageDesktop(driver);
    }

    public boolean isPageOpened() {
        return logo.isElementPresent();
    }

    public DumbbellsPageAmazonDesktop searhItem(String item){
        searchTextBox.click();
        searchTextBox.type(item);
        searhButton.click();
        return new DumbbellsPageAmazonDesktop(driver);
    }

    public void hoverAccountListSigninButton(){
        accountListSigninButton.hover();
    }

    public AccountPageDesktop clickOnAccountLink(){
        accountLink.click();
        return new AccountPageDesktop(driver);
    }

    public SignInPageDesktop clickOnSignInButton(){
        signinButton.click();
        return new SignInPageDesktop(driver);
    }

    public void clickOnAllMenuButton(){
        allMenuButton.click();
    }

}
