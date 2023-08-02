package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.ItemPageAbstract;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ItemPageAbstract.class)
public class ItemPage extends ItemPageAbstract {

    @FindBy(xpath = "//input[@id='add-to-cart-button'] ")
    private ExtendedWebElement addToCartButton;
    ItemPage(WebDriver driver){
        super(driver);
    }

    @Override
    public AddedToCartPage addItemToCart(){
        addToCartButton.click();
        return new AddedToCartPage(driver);
    }
}
