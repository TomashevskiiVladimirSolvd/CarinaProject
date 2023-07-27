package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CartPageDesktop extends AbstractUIObject {

    @FindBy (xpath = "//form[@id='activeCartViewForm']/descendant::span[@class='a-truncate-cut']")
    private ExtendedWebElement dumbbellsInCartText;

    @FindBy(xpath =  "///div[@id='sc-active-cart']/descendant::h1")
    private ExtendedWebElement cartEmptyText;

    @FindBy(xpath = "//span[@data-action='delete']")
    private ExtendedWebElement deleteButton;

    public CartPageDesktop(WebDriver driver){
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
