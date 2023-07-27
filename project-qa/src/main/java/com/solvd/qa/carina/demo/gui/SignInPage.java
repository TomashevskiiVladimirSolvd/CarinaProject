package com.solvd.qa.carina.demo.gui;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends AbstractUIObject {

    @FindBy(xpath = "//input[@id='ap_email']")
    private ExtendedWebElement emailTextBox;

    @FindBy(xpath="//input[@id='continue']")
    private ExtendedWebElement continueButton;

    @FindBy(xpath = "//div[@id='auth-error-message-box']/descendant::h4")
    private ExtendedWebElement errorText;

    public SignInPage(WebDriver driver){
        super(driver);
    }

    public String getErrorText(){
       return errorText.getText();
    }

    public void clickAndInputEmail(String wrongEmail){
        emailTextBox.click();
        emailTextBox.setName(wrongEmail);
    }

    public void clickOnContinueButton(){
        continueButton.click();
    }

}
