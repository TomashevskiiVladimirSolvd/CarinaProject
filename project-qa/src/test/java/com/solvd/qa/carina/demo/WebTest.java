package com.solvd.qa.carina.demo;

import com.solvd.qa.carina.demo.gui.pages.desktop.*;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebTest implements IAbstractTest {
    @Test
    @MethodOwner(owner = "vtomashevskii")

    public void testAddingItemToTheCart(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.isPageOpened(),"Amazon Home page is not opened");
        DumbbellsPage dumbbellsPage = homePage.searhItem("dumbbells");
        BasicsNeoprenDubbellPage basicsNeoprenDubbellPage = dumbbellsPage.clickOnPinkDumbells();
        AddedToCartPage addedToCartPage = basicsNeoprenDubbellPage.addItemToCart();
        CartPage cartPage = addedToCartPage.goToCartButton();
        softAssert.assertEquals(cartPage.getDumbbellsName(),
                "Yes4All Exercise amp Fitness Ibs Yes4All Non Slip Hexagon 2lbs Neoprene " +
                        "Dumbbell Set for Muscle Toning Stren, A-Purple-2 lbs , 2 Pair US",
                "Dumbbells are not in the cart.");
        softAssert.assertAll();
    }

    public void testAccountPage(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        homePage.hoverAccountListSigninButton();
        AccountPage accountPage = homePage.clickOnAccountLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(accountPage.getAccountTitle(),"Your Account",
                "You are not on the AccountPage");
        softAssert.assertAll();
    }

    public void testNegativeSignIn(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        homePage.hoverAccountListSigninButton();
        SignInPage signInPage = homePage.clickOnSignInButton();
        signInPage.clickAndInputEmail("tomalli1234@mail.ru");
        signInPage.clickOnContinueButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(signInPage.getErrorText(),"There was a problem",
                "Error text in not found.");
        softAssert.assertAll();
    }

    public void testAmazonBestSellers(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        homePage.clickOnAllMenuButton();
        BestSellersPage bestSellersPage= homePage.clickOnBestSellerLink();
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(bestSellersPage.getBestSellersText(),"Amazon Best Sellers","Best Sellers text is not found");
        softAssert.assertAll();
    }

}