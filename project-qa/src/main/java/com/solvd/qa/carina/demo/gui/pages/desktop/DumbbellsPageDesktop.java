package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.solvd.qa.carina.demo.gui.pages.common.DumbbellsPageCommon;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = DumbbellsPageCommon.class)
public class DumbbellsPageDesktop extends DumbbellsPageCommon {

    @FindBy(xpath = "//div[@data-component-id='2']")
    private ExtendedWebElement smallPinkDumbells;

    public DumbbellsPageDesktop(WebDriver driver){
        super(driver);
    }

    public BasicsNeoprenDubbellPageDesktop clickOnPinkDumbells(){
        smallPinkDumbells.click();
        return new BasicsNeoprenDubbellPageDesktop(driver);
    }
}
