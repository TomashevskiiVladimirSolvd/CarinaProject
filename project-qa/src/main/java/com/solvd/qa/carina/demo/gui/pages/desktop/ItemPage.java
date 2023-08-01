package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.solvd.qa.carina.demo.gui.pages.common.ItemPageAbstract;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ItemPageAbstract.class)
public class ItemPage extends ItemPageAbstract {

    @FindBy (xpath = "//span[@id='productTitle']")
    private ExtendedWebElement dumbellTitle;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    private ExtendedWebElement addToCartButton;

    ItemPage(WebDriver driver){
        super(driver);
    }

    public AddedToCartPage addItemToCart(){
        addToCartButton.click();
        return new AddedToCartPage(driver);
    }


}
