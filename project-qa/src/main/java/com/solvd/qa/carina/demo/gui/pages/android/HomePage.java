package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.HomePageAbstract;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageAbstract.class)
public class HomePage extends HomePageAbstract {
    @FindBy(xpath="//a[@id='nav-logobar-greeting']")
    private ExtendedWebElement signInButton;

    @FindBy(xpath = "//form[@id='nav-search-form']//input[@class='nav-input nav-progressive-attribute'] ")
    private ExtendedWebElement searchTextBox;

    @FindBy(xpath = "//form[@id='nav-search-form']//div[@class='nav-right'] ")
    private ExtendedWebElement searchButton;

    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    private ExtendedWebElement menuButton;

    @FindBy(xpath = "//div[@id='hmenu-home-text']")
    private ExtendedWebElement menuText;

    @FindBy(xpath = "//div[@id='nav-gwbar']//a[contains(.,'Best')]")
    private ExtendedWebElement bestSellersLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public SignInPage clickOnSignInButton(){
        signInButton.click();
        return new SignInPage(driver);
    }

    public void clickOnSearchTextBox(){
        searchTextBox.click();
    }

    public void typeSearchTextBox(String item){
        searchTextBox.type(item);
    }

    public ItemsPage clickOnSearchButton(){
        searchButton.click();
        return new ItemsPage(driver);
    }

    public void clickOnMenuButton() {
        menuButton.click();
    }

    public String getMenuText() {
        return menuText.getText();
    }

    public BestSellersPage clickOnBestSellersLink() {
        bestSellersLink.click();
        return new BestSellersPage(driver);
    }

}
