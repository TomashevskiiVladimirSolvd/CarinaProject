package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.BestSellersPageAbstract;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = BestSellersPageAbstract.class)
public class BestSellersPage extends BestSellersPageAbstract {
    @FindBy(xpath = "//span[@id='zg_banner_text']")
    private ExtendedWebElement bestSellersTitle;
    public BestSellersPage(WebDriver driver){
        super(driver);
    }

    public String getBestSellersTitle() {
        return bestSellersTitle.getText();
    }
}
