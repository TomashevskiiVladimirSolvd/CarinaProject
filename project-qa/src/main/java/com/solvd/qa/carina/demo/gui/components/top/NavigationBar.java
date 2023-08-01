package com.solvd.qa.carina.demo.gui.components.top;

import com.solvd.qa.carina.demo.gui.pages.desktop.BestSellersPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends NavigationBarCommon {
    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    private ExtendedWebElement allMenuButton;

    @FindBy(xpath = "//div[@id='hmenu-content']//a[@class='hmenu-item']")
    private ExtendedWebElement bestSellerLink;
    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickOnAllMenuButton(){
        allMenuButton.click();
    }

    @Override
    public BestSellersPage clickOnBestSellerLink(){
        bestSellerLink.click();
        return new BestSellersPage(driver);
    }
}
