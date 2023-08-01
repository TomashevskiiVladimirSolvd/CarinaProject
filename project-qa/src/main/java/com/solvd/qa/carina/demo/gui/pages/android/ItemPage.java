package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.ItemPageAbstract;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ItemPageAbstract.class)
public class ItemPage extends ItemPageAbstract {
    ItemPage(WebDriver driver){
        super(driver);
    }
}
