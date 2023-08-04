package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.solvd.qa.carina.demo.gui.pages.common.HomePageAbstract;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageAbstract.class)
public class HomePage extends HomePageAbstract {

    @FindBy(xpath = "//div[@id='nav-belt']")
    public ExtendedWebElement globalHeader;
    public HomePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(globalHeader);
    }

}
