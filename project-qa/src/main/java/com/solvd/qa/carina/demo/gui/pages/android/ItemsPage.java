package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.ItemsPageAbstract;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ItemsPageAbstract.class)
public class ItemsPage extends ItemsPageAbstract {
    public ItemsPage(WebDriver driver){
        super(driver);
    }
}
