package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.solvd.qa.carina.demo.gui.pages.common.BasicsNeoprenDubbellPageCommon;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = BasicsNeoprenDubbellPageCommon.class)
public class BasicsNeoprenDubbellPage extends BasicsNeoprenDubbellPageCommon {

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
