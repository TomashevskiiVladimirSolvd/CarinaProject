package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.solvd.qa.carina.demo.gui.pages.common.BestSellersPageAbstract;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = BestSellersPageAbstract.class)
public class BestSellersPage extends BestSellersPageAbstract {

    @FindBy(xpath = "//span[@id='zg_banner_text']")
    private ExtendedWebElement bestSellersText;

    public BestSellersPage(WebDriver driver) {
        super(driver);
    }

    public String getBestSellersText() {
        return bestSellersText.getText();
    }
}
