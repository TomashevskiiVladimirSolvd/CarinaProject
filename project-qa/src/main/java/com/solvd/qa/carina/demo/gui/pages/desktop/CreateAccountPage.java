package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.solvd.qa.carina.demo.gui.pages.common.CreateAccountPageCommon;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = CreateAccountPageCommon.class)
public class CreateAccountPage extends CreateAccountPageCommon {

    @FindBy(xpath = "//input[@id='ap_customer_name']")
    private ExtendedWebElement yourNameTextBox;

    @FindBy(xpath = "//input[@id='ap_email']")
    private ExtendedWebElement emailTextBox;

    @FindBy(xpath = "//input[@id='ap_password']")
    private ExtendedWebElement passwordTextBox;

    @FindBy(xpath = "//input[@id='ap_password_check']")
    private ExtendedWebElement reEnterPasswordTextBox;

    @FindBy(xpath = "//input[@id='continue']")
    private ExtendedWebElement continueButton;

    @FindBy(xpath = "//div[@id='auth-email-invalid-claim-alert']/descendant::div[@class='a-alert-content']")
    private ExtendedWebElement wrongEmailMessage;


    public CreateAccountPage(WebDriver driver){
        super(driver);
    }

    public void clickAndInputName(String name){
        yourNameTextBox.click();
        yourNameTextBox.setName(name);
    }
    public void clickAndInputEmail(String email){
        emailTextBox.click();
        emailTextBox.setName(email);

    }
    public void clickAndInputPassword(String password){
      passwordTextBox.click();
      passwordTextBox.setName(password);
    }
    public void clickAndInputRePassword(String rePassword){
      reEnterPasswordTextBox.click();
      reEnterPasswordTextBox.setName(rePassword);
    }

    public void clickOnContinueButton(){
        continueButton.click();
    }

    public String getWrongEmailText(){
        return wrongEmailMessage.getText();
    }

}
