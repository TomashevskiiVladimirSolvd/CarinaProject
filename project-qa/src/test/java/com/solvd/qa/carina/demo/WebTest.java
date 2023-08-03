package com.solvd.qa.carina.demo;

import com.solvd.qa.carina.demo.gui.components.header.HeaderComponent;
import com.solvd.qa.carina.demo.gui.components.navigation.NavigationComponent;
import com.solvd.qa.carina.demo.gui.pages.common.HomePageAbstract;
import com.solvd.qa.carina.demo.gui.pages.desktop.*;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class WebTest implements IAbstractTest {
    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testAddingItemToTheCart() {
        HomePageAbstract homePage = initPage(getDriver(), HomePageAbstract.class);
        homePage.open();
        assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        HeaderComponent headerComponent = homePage.getHeader();
        ItemsPage itemsPage = headerComponent.searhItem("dumbbells");
        ItemPage basicsNeoprenDubbellPage = itemsPage.clickOnPinkDumbells();
        AddedToCartPage addedToCartPage = basicsNeoprenDubbellPage.addItemToCart();
        assertEquals(addedToCartPage.getAddedToCartText(), "Added to Cart", "added to cart text is not found");
    }

    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testAccountPage() {
        HomePageAbstract homePage = initPage(getDriver(), HomePageAbstract.class);
        homePage.open();
        assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        HeaderComponent headerComponent = homePage.getHeader();
        headerComponent.hoverAccountListSigninButton();
        AccountPage accountPage = headerComponent.clickOnAccountLink();
        assertEquals(accountPage.getAccountTitle(), "Your Account",
                "You are not on the AccountPage");
    }

    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testNegativeSignIn() {
        HomePageAbstract homePage = initPage(getDriver(), HomePageAbstract.class);
        homePage.open();
        assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        HeaderComponent headerComponent = homePage.getHeader();
        SignInPage signInPage = headerComponent.clickOnAccountListSigninButton();
        signInPage.setEmail("tomalli1234@mail.ru");
        signInPage.clickOnContinueButton();
        assertEquals(signInPage.getErrorText(), "There was a problem",
                "Error text in not found.");
    }

    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testAmazonBestSellers() {
        HomePageAbstract homePage = initPage(getDriver(), HomePageAbstract.class);
        homePage.open();
        assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        NavigationComponent navigationComponent = homePage.getNavigation();
        navigationComponent.clickOnAllMenuButton();
        BestSellersPage bestSellersPage = navigationComponent.clickOnBestSellerLink();
        assertEquals(bestSellersPage.getBestSellersText(), "Amazon Best Sellers",
                "Best Sellers text is not found");
    }

    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testCreateAccountWithWrongEmail() {
        HomePageAbstract homePage = initPage(getDriver(), HomePageAbstract.class);
        homePage.open();
        assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        HeaderComponent headerComponent = homePage.getHeader();
        headerComponent.hoverAccountListSigninButton();
        CreateAccountPage createAccountPage = headerComponent.clickOnStartNewCustomerLink();
        createAccountPage.typeName("Name");
        createAccountPage.setEmail("email@mail.ru");
        createAccountPage.setPassword("123456");
        createAccountPage.setRePassword("123456");
        createAccountPage.clickOnContinueButton();
        assertTrue(createAccountPage.isContinueButtonPresented(), "ContinueButton is not presented");
        Assert.assertEquals(createAccountPage.getInvalidEmailText().trim(),
                "Wrong or Invalid email address or mobile phone number. Please correct and try again.",
                "wrong email text is not found");
    }
}
