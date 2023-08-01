package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.solvd.qa.carina.demo.gui.pages.common.SignInPageAbstract;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = SignInPageAbstract.class)
public class SignInPage extends SignInPageAbstract {

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

    public void setEmail(String wrongEmail){
        emailTextBox.type(wrongEmail);
    }

    public void clickOnContinueButton(){
        continueButton.click();
    }

}
