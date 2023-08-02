package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.SignInPageAbstract;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SignInPageAbstract.class)
public class SignInPage extends SignInPageAbstract {
    @FindBy(xpath = "//input[@id='ap_email_login']")
    private ExtendedWebElement emailTextBox;

    @FindBy(xpath ="//form[@id='ap_login_form']//input[@id='continue'] ")
    private ExtendedWebElement continueButton;

    @FindBy(xpath ="//div[@id='auth-warning-message-box']//h4 ")
    private ExtendedWebElement errorText;

    @FindBy(xpath = "//a[@id='register_accordion_header']/i ")
    private ExtendedWebElement createAccountButton;


    public SignInPage(WebDriver driver){
        super(driver);
    }


    @Override
    public void setEmail(String email){
        emailTextBox.type(email);
    }
    @Override
    public void clickOnContinueButton(){
        continueButton.click();
    }

    @Override
    public String getErrorText(){
        return errorText.getText();
    }

    public CreateAccountPage clickOnCreateAccountButton(){
        createAccountButton.click();
        return new CreateAccountPage(driver);
    }

}
