package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.BestSellersPageAbstract;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = BestSellersPageAbstract.class)
public class BestSellersPage extends BestSellersPageAbstract {
    public BestSellersPage(WebDriver driver){
        super(driver);
    }
}
