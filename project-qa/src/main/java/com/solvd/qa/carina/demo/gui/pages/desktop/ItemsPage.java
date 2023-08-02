package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.solvd.qa.carina.demo.gui.pages.common.ItemsPageAbstract;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ItemsPageAbstract.class)
public class ItemsPage extends ItemsPageAbstract {

    @FindBy(xpath = "//div[@class='a-section aok-relative s-image-square-aspect']")
    private ExtendedWebElement smallPinkDumbells;

    public ItemsPage(WebDriver driver){
        super(driver);
    }

    @Override
    public ItemPage clickOnPinkDumbells(){
        smallPinkDumbells.click();
        return new ItemPage(driver);
    }
}
