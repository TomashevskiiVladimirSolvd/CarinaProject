package com.solvd.qa.carina.demo.gui;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BasicsNeoprenDubbellPage extends AbstractUIObject {

    @FindBy (xpath = "//span[@id='productTitle']")
    private ExtendedWebElement dumbellTitle;

    BasicsNeoprenDubbellPage(WebDriver driver){
        super(driver);
    }


}
