package com.solvd.qa.carina.demo.gui.pages.android;

import com.solvd.qa.carina.demo.gui.pages.common.CreateAccountPageAbstract;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CreateAccountPageAbstract.class)
public class CreateAccountPage extends CreateAccountPageAbstract {
    @FindBy(xpath = "//input[@id='ap_customer_name']")
    private ExtendedWebElement yourNameTextBox;

    @FindBy(xpath = "//input[@id='ap_email']")
    private ExtendedWebElement emailTextBox;

    @FindBy(xpath = "//input[@id='ap_password']")
    private ExtendedWebElement passwordTextBox;

    @FindBy(xpath = "//form[@id='ap_register_form']//input[@id='continue']")
    private ExtendedWebElement continueRegisterButton;

    @FindBy(xpath = "//div[@class='a-box-inner a-alert-container']//div[contains(.,'Wrong or Invalid email')]")
    private ExtendedWebElement invalidEmailText;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeName(String name) {
        yourNameTextBox.type(name);
    }

    @Override
    public void setEmail(String email) {
        emailTextBox.type(email);

    }

    @Override
    public void setPassword(String password) {
        passwordTextBox.type(password);
    }

    public void clickOnContinueButton() {
        continueRegisterButton.click();
    }

    @Override
    public String getInvalidEmailText() {
        return invalidEmailText.getText();
    }

}
