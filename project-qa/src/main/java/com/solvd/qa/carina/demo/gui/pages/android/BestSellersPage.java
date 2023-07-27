package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.BestSellersPageCommon;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass =BestSellersPageCommon.class)
public class BestSellersPage extends BestSellersPageCommon {
    public BestSellersPage(WebDriver driver){
        super(driver);
    }
}
