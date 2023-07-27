package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.SignInPageCommon;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SignInPageCommon.class)
public class SignInPage extends SignInPageCommon {
    public SignInPage(WebDriver driver){
        super(driver);
    }
}
