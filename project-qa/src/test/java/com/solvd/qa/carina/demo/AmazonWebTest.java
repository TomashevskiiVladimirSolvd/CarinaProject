package com.solvd.qa.carina.demo;

import com.solvd.qa.carina.demo.gui.*;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AmazonWebTest implements IAbstractTest {
    @Test
    @MethodOwner(owner = "vtomashevskii")

    public void testAddingItemToTheCart(){
        HomePageAmazon homePageAmazon = new HomePageAmazon(getDriver());
        homePageAmazon.open();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePageAmazon.isPageOpened(),"Amazon Home page is not opened");
        DumbbellsPageAmazon dumbbellsPageAmazon=homePageAmazon.searhDumbells();
        BasicsNeoprenDubbellPage basicsNeoprenDubbellPage=dumbbellsPageAmazon.clickOnPinkDumbells();
        AddedToCartPage addedToCartPage = basicsNeoprenDubbellPage.addItemToCart();
        CartPage cartPage = addedToCartPage.goToCartButton();
        softAssert.assertEquals(cartPage.getDumbbellsName(),
                "Yes4All Exercise amp Fitness Ibs Yes4All Non Slip Hexagon 2lbs Neoprene " +
                        "Dumbbell Set for Muscle Toning Stren, A-Purple-2 lbs , 2 Pair US",
                "Dumbbells are not in the cart.");
    }

    public void testAccountPage(){
        HomePageAmazon homePageAmazon = new HomePageAmazon(getDriver());
        homePageAmazon.open();
        homePageAmazon.hoverAccountListSigninButton();
        AccountPage accountPage=homePageAmazon.clickOnAccountLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(accountPage.getAccountTitle(),"Your Account","You are not on the AccountPage");
    }

    public void testNegativeSignIn(){
        HomePageAmazon homePageAmazon = new HomePageAmazon(getDriver());
        homePageAmazon.open();
        homePageAmazon.hoverAccountListSigninButton();
        SignInPage signInPage= homePageAmazon.clickOnSignInButton();
        signInPage.clickAndInputWrongEmail("tomalli1234@mail.ru");
    }


}
