package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.solvd.qa.carina.demo.gui.pages.common.SignInPageCommon;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = SignInPageCommon.class)
public class SignInPageDesktop extends SignInPageCommon {

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
