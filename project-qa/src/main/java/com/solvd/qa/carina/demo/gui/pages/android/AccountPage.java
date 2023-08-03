package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.AccountPageAbstract;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AccountPageAbstract.class)
public class AccountPage extends AccountPageAbstract {
    public AccountPage(WebDriver driver) {
        super(driver);
    }
}
