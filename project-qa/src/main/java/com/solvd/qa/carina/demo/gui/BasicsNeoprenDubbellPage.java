package com.solvd.qa.carina.demo.gui;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BasicsNeoprenDubbellPage extends AbstractUIObject {

    @FindBy (xpath = "//span[@id='productTitle']")
    private ExtendedWebElement dumbellTitle;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    private ExtendedWebElement addToCartButton;

    BasicsNeoprenDubbellPage(WebDriver driver){
        super(driver);
    }

    public AddedToCartPage addItemToCart(){
        addToCartButton.click();
        return new AddedToCartPage(driver);
    }


}
