package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.CartPageCommon;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CartPageCommon.class)
public class CartPage extends CartPageCommon {
    public CartPage(WebDriver driver){
        super(driver);
    }
}
