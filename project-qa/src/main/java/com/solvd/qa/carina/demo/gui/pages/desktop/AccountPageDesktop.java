package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.solvd.qa.carina.demo.gui.pages.common.AccountPageCommon;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = AccountPageCommon.class)
public class AccountPageDesktop extends AccountPageCommon {

    @FindBy(xpath = "//div[@id='a-page']/descendant::h1")
    private ExtendedWebElement yourAccoutTitle;

    public AccountPageDesktop(WebDriver driver){
        super(driver);
    }

    public String getAccountTitle(){
       return yourAccoutTitle.getText();
    }


}
