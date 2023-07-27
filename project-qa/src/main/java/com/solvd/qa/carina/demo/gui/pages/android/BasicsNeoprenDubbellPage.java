package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.BasicsNeoprenDubbellPageCommon;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = BasicsNeoprenDubbellPageCommon.class)
public class BasicsNeoprenDubbellPage extends BasicsNeoprenDubbellPageCommon {
    BasicsNeoprenDubbellPage(WebDriver driver){
        super(driver);
    }
}
