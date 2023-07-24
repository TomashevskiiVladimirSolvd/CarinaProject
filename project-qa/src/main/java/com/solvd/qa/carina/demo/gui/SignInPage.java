package com.solvd.qa.carina.demo.gui;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends AbstractUIObject {

    @FindBy(xpath = "//input[@id='ap_email']")
    private ExtendedWebElement emailTextBox;

    public SignInPage(WebDriver driver){
        super(driver);
    }

    public void clickAndInputWrongEmail(String wrongEmail){
        emailTextBox.click();
        emailTextBox.setName(wrongEmail);
    }
}
