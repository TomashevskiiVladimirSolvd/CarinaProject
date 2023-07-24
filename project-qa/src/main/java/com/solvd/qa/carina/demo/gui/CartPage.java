package com.solvd.qa.carina.demo.gui;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CartPage extends AbstractUIObject {

    @FindBy (xpath = "//span[contains(text(),'Neoprene Dumbbell')][2]")
    private ExtendedWebElement dumbbellsInCartText;

    @FindBy(xpath =  "//h1[contains(.,'empty')]")
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
