package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.HomePageCommon;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageCommon.class)
public class HomePage extends HomePageCommon {
    public HomePage(WebDriver driver){
        super(driver);
    }
}
