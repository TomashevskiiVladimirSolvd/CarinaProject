package com.solvd.qa.carina.demo.gui;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends AbstractUIObject {

    @FindBy(xpath = "//div[@class=\'a-row a-spacing-base\']/h1")
    private ExtendedWebElement yourAccoutTitle;

    public AccountPage(WebDriver driver){
        super(driver);
    }

    public String getAccountTitle(){
       return yourAccoutTitle.getText();
    }


}
