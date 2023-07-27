package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.DumbbellsPageCommon;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DumbbellsPageCommon.class)
public class DumbbellsPage extends DumbbellsPageCommon {
    public DumbbellsPage(WebDriver driver){
        super(driver);
    }
}
