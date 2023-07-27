package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.AccountPageCommon;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AccountPageCommon.class)
public class AccountPage extends AccountPageCommon {
    public AccountPage(WebDriver driver){
        super(driver);
    }
}
