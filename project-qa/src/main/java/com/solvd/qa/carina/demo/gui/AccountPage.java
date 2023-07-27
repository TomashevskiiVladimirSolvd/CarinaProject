package com.solvd.qa.carina.demo.gui;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends AbstractUIObject {

    @FindBy(xpath = "//div[@id='a-page']/descendant::h1")
    private ExtendedWebElement yourAccoutTitle;

    public AccountPage(WebDriver driver){
        super(driver);
    }

    public String getAccountTitle(){
       return yourAccoutTitle.getText();
    }


}
