package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.solvd.qa.carina.demo.gui.pages.common.ItemsPageCommon;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ItemsPageCommon.class)
public class SearchItemsPage extends ItemsPageCommon {

    @FindBy(xpath = "//div[@class='a-section aok-relative s-image-square-aspect']")
    private ExtendedWebElement smallPinkDumbells;

    public SearchItemsPage(WebDriver driver){
        super(driver);
    }

    public BasicsNeoprenDubbellPage clickOnPinkDumbells(){
        smallPinkDumbells.click();
        return new BasicsNeoprenDubbellPage(driver);
    }
}
