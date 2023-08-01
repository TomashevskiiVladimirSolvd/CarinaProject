package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.ItemsPageCommon;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ItemsPageCommon.class)
public class ItemsPage extends ItemsPageCommon {
    public ItemsPage(WebDriver driver){
        super(driver);
    }
}