package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.AddedToCartPageAbstract;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AddedToCartPageAbstract.class)
public class AddedToCartPage extends AddedToCartPageAbstract {
    public AddedToCartPage(WebDriver driver){
        super(driver);
    }
}
