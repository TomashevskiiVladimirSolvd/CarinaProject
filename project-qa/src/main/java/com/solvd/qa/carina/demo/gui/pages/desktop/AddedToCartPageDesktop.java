package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.solvd.qa.carina.demo.gui.pages.common.AddedToCartPageCommon;
import com.solvd.qa.carina.demo.gui.pages.common.HomePageCommon;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = AddedToCartPageCommon.class)
public class AddedToCartPageDesktop extends AddedToCartPageCommon {

    @FindBy(xpath = "//span[@id='sw-gtc']/descendant::a")
    private  ExtendedWebElement goToCartButton;

    public AddedToCartPageDesktop(WebDriver driver){
        super(driver);
    }

    public CartPageDesktop goToCartButton(){
        goToCartButton.click();
        return new CartPageDesktop(driver);
    }


}
