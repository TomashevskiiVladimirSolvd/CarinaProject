package com.solvd.qa.carina.demo.gui.components.navigation;

import com.solvd.qa.carina.demo.gui.pages.desktop.BestSellersPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NavigationComponent extends NavigationComponentAbstract {
    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    private ExtendedWebElement allMenuButton;

    @FindBy(xpath = "//div[@id='hmenu-content']//a[@class='hmenu-item']")
    private ExtendedWebElement bestSellerLink;
    public NavigationComponent(WebDriver driver) {
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
