package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.solvd.qa.carina.demo.gui.pages.common.AccountPageAbstract;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = AccountPageAbstract.class)
public class AccountPage extends AccountPageAbstract {

    @FindBy(xpath = "//div[@id='a-page']/descendant::h1")
    private ExtendedWebElement yourAccoutTitle;

    public AccountPage(WebDriver driver){
        super(driver);
    }

    public String getAccountTitle(){
       return yourAccoutTitle.getText();
    }


}
