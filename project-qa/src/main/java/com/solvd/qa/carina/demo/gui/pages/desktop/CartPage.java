package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.solvd.qa.carina.demo.gui.pages.common.CartPageCommon;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = CartPageCommon.class)
public class CartPage extends CartPageCommon {

    @FindBy (xpath = "//form[@id='activeCartViewForm']/descendant::span[@class='a-truncate-cut']")
    private ExtendedWebElement dumbbellsInCartText;

    @FindBy(xpath =  "///div[@id='sc-active-cart']/descendant::h1")
    private ExtendedWebElement cartEmptyText;

    @FindBy(xpath = "//span[@data-action='delete']")
    private ExtendedWebElement deleteButton;

    public CartPage(WebDriver driver){
        super(driver);
    }

    public String getDumbbellsName(){
        return dumbbellsInCartText.getText();
    }

    public void clickOnDeleteButton(){
        deleteButton.click();
    }

    public String getEmtyTextName(){
        return cartEmptyText.getText();
    }


}
