package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.AddedToCartPageCommon;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AddedToCartPageCommon.class)
public class AddedToCartPage extends AddedToCartPageCommon {
    public AddedToCartPage(WebDriver driver){
        super(driver);
    }
}
