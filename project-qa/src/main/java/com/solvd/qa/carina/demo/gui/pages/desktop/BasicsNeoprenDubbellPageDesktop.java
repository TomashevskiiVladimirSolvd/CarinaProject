package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.solvd.qa.carina.demo.gui.pages.common.BasicsNeoprenDubbellPageCommon;
import com.solvd.qa.carina.demo.gui.pages.common.HomePageCommon;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = BasicsNeoprenDubbellPageCommon.class)
public class BasicsNeoprenDubbellPageDesktop extends BasicsNeoprenDubbellPageCommon {

    @FindBy (xpath = "//span[@id='productTitle']")
    private ExtendedWebElement dumbellTitle;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    private ExtendedWebElement addToCartButton;

    BasicsNeoprenDubbellPageDesktop(WebDriver driver){
        super(driver);
    }

    public AddedToCartPageDesktop addItemToCart(){
        addToCartButton.click();
        return new AddedToCartPageDesktop(driver);
    }


}
