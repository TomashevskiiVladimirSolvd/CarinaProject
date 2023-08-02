package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.AddedToCartPageAbstract;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AddedToCartPageAbstract.class)
public class AddedToCartPage extends AddedToCartPageAbstract {
    @FindBy(xpath = "//div[@id='NATC_MWEB_FULL_PAGE_CONF_MSG_SUCCESS']/span")
    private ExtendedWebElement addedToCartText;
    public AddedToCartPage(WebDriver driver){
        super(driver);
    }

    @Override
    public String getAddedToCartText() {
        return addedToCartText.getText();
    }
}
