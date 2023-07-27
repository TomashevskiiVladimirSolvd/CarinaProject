package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DumbbellsPageAmazonDesktop extends AbstractUIObject {

    @FindBy(xpath = "//div[@data-component-id='2']")
    private ExtendedWebElement smallPinkDumbells;




    public DumbbellsPageAmazonDesktop(WebDriver driver){
        super(driver);
    }

    public BasicsNeoprenDubbellPageDesktop clickOnPinkDumbells(){
        smallPinkDumbells.click();
        return new BasicsNeoprenDubbellPageDesktop(driver);
    }
}
