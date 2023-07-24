package com.solvd.qa.carina.demo.gui;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AddedToCartPage extends AbstractUIObject {

    @FindBy(xpath = "//span[contains(@id,'sw-gtc')]//a[contains(.,'Go to Cart')]")
    private  ExtendedWebElement goToCartButton;

    public AddedToCartPage(WebDriver driver){
        super(driver);
    }

    public CartPage goToCartButton(){
        goToCartButton.click();
        return new CartPage(driver);
    }


}
