package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.SignInPageAbstract;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SignInPageAbstract.class)
public class SignInPage extends SignInPageAbstract {
    public SignInPage(WebDriver driver){
        super(driver);
    }
}
