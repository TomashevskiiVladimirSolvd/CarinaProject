package com.solvd.qa.carina.demo.gui;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePageAmazon {
    @FindBy(xpath = "//a[@id='nav-cart']")
    private ExtendedWebElement cart;


    public HomePageAmazon(WebDriver driver){
        super();
    }
}
