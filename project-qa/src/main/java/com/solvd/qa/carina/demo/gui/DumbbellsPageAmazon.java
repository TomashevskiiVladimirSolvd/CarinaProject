package com.solvd.qa.carina.demo.gui;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DumbbellsPageAmazon extends AbstractUIObject {

    @FindBy(xpath = "//div[@data-component-id='2']")
    private ExtendedWebElement smallPinkDumbells;




    public DumbbellsPageAmazon(WebDriver driver){
        super(driver);
    }

    public BasicsNeoprenDubbellPage clickOnPinkDumbells(){
        smallPinkDumbells.click();
        return new BasicsNeoprenDubbellPage(driver);
    }
}
