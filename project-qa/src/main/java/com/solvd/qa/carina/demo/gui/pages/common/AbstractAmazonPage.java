package com.solvd.qa.carina.demo.gui.pages.common;

import com.solvd.qa.carina.demo.gui.components.header.HeaderComponent;
import com.solvd.qa.carina.demo.gui.components.navigation.NavigationComponent;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AbstractAmazonPage extends AbstractPage {
    @FindBy(xpath = "//div[@id='nav-belt']")
    private HeaderComponent header;

    @FindBy(xpath = "//div[@id='nav-main']")
    private NavigationComponent navigationComponent;

    public AbstractAmazonPage(WebDriver driver) {
        super(driver);
    }

    public HeaderComponent getHeader() {
        return header;
    }

    public NavigationComponent getNavigation() {
        return navigationComponent;
    }

    @Override
    public void open() {
        super.open();
    }
}
