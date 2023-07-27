package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SignInPageDesktop extends AbstractUIObject {

    @FindBy(xpath = "//input[@id='ap_email']")
    private ExtendedWebElement emailTextBox;

    @FindBy(xpath="//input[@id='continue']")
    private ExtendedWebElement continueButton;

    @FindBy(xpath = "//div[@id='auth-error-message-box']/descendant::h4")
    private ExtendedWebElement errorText;

    public SignInPageDesktop(WebDriver driver){
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
