package com.solvd.qa.carina.demo;

import com.solvd.qa.carina.demo.gui.pages.android.*;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileTest implements IAbstractTest, IMobileUtils {
    @Test()
    @MethodOwner(owner="vtomashevskii")
    public void testAddingItemToTheCart(){
        HomePage homePage= new HomePage(getDriver());
        homePage.open();
        homePage.clickOnSearchTextBox();
        homePage.typeSearchTextBox("dumbells");
        ItemsPage itemsPage = homePage.clickOnSearchButton();
        ItemPage itemPage=itemsPage.clickOnPinkDumbells();
        AddedToCartPage addedToCartPage = itemPage.addItemToCart();
        Assert.assertEquals(addedToCartPage.getAddedToCartText(),"Added to Cart","added to cart text is not found");
    }

    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testMenuButton() {
        HomePage homePage= new HomePage(getDriver());
        homePage.open();
        homePage.clickOnMenuButton();
        Assert.assertEquals(homePage.getMenuText(), "Amazon Home", "menu text is not found");
    }

    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testAmazonBestSellers() {
        HomePage homePage= new HomePage(getDriver());
        homePage.open();
        homePage.clickOnMenuButton();
        BestSellersPage bestSellersPage = homePage.clickOnBestSellersLink();
        Assert.assertEquals(bestSellersPage.getBestSellersTitle(), "Amazon Best Sellers", "Best Sellers Title is not found");
    }

    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testCreateAccountWithWrongEmail() {
        HomePage homePage= new HomePage(getDriver());
        homePage.open();
        SignInPage signInPage = homePage.clickOnSignInButton();
        CreateAccountPage createAccountPage=signInPage.clickOnCreateAccountButton();
        createAccountPage.typeName("Name");
        createAccountPage.setEmail("asd");
        createAccountPage.setPassword("123456");
        createAccountPage.clickOnContinueButton();
        Assert.assertEquals(createAccountPage.getInvalidEmailText().trim(),
                "Wrong or Invalid email address or mobile phone number. Please correct and try again",
                "Error text is no found");
    }

    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testNegativeSignIn() {
        HomePage homePage= new HomePage(getDriver());
        homePage.open();
        SignInPage signInPage = homePage.clickOnSignInButton();
        signInPage.setEmail("dguj");
        signInPage.clickOnContinueButton();
        Assert.assertEquals(signInPage.getErrorText(),"No account found with email address",
                "Error text in not found.");
    }
}
