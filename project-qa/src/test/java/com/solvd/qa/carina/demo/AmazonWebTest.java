package com.solvd.qa.carina.demo;

import com.solvd.qa.carina.demo.gui.pages.desktop.*;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AmazonWebTest implements IAbstractTest {
    @Test
    @MethodOwner(owner = "vtomashevskii")

    public void testAddingItemToTheCart(){
        HomePageDesktop homePageDesktop = new HomePageDesktop(getDriver());
        homePageDesktop.open();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePageDesktop.isPageOpened(),"Amazon Home page is not opened");
        DumbbellsPageAmazonDesktop dumbbellsPageAmazonDesktop = homePageDesktop.searhItem("dumbbells");
        BasicsNeoprenDubbellPageDesktop basicsNeoprenDubbellPageDesktop = dumbbellsPageAmazonDesktop.clickOnPinkDumbells();
        AddedToCartPageDesktop addedToCartPageDesktop = basicsNeoprenDubbellPageDesktop.addItemToCart();
        CartPageDesktop cartPageDesktop = addedToCartPageDesktop.goToCartButton();
        softAssert.assertEquals(cartPageDesktop.getDumbbellsName(),
                "Yes4All Exercise amp Fitness Ibs Yes4All Non Slip Hexagon 2lbs Neoprene " +
                        "Dumbbell Set for Muscle Toning Stren, A-Purple-2 lbs , 2 Pair US",
                "Dumbbells are not in the cart.");
        softAssert.assertAll();
    }

    public void testAccountPage(){
        HomePageDesktop homePageDesktop = new HomePageDesktop(getDriver());
        homePageDesktop.open();
        homePageDesktop.hoverAccountListSigninButton();
        AccountPageDesktop accountPageDesktop = homePageDesktop.clickOnAccountLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(accountPageDesktop.getAccountTitle(),"Your Account",
                "You are not on the AccountPageDesktop");
        softAssert.assertAll();
    }

    public void testNegativeSignIn(){
        HomePageDesktop homePageDesktop = new HomePageDesktop(getDriver());
        homePageDesktop.open();
        homePageDesktop.hoverAccountListSigninButton();
        SignInPageDesktop signInPageDesktop = homePageDesktop.clickOnSignInButton();
        signInPageDesktop.clickAndInputEmail("tomalli1234@mail.ru");
        signInPageDesktop.clickOnContinueButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(signInPageDesktop.getErrorText(),"There was a problem",
                "Error text in not found.");
        softAssert.assertAll();
    }

    public void testAmazonBestSellers(){
        HomePageDesktop homePageDesktop = new HomePageDesktop(getDriver());
        homePageDesktop.open();
        homePageDesktop.clickOnAllMenuButton();
    }



}
