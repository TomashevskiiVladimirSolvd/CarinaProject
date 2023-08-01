package com.solvd.qa.carina.demo;

import com.solvd.qa.carina.demo.gui.components.navigator.Header;
import com.solvd.qa.carina.demo.gui.components.top.NavigationBar;
import com.solvd.qa.carina.demo.gui.pages.desktop.*;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class WebTest implements IAbstractTest {
    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testAddingItemToTheCart(){
       HomePage homePage=new HomePage(getDriver());
       homePage.open();
       assertTrue(homePage.isPageOpened(), "Home page is not opened!");
       Header header=new Header(getDriver());
       SearchItemsPage itemsPage = header.searhItem("dumbbells");
       BasicsNeoprenDubbellPage basicsNeoprenDubbellPage = itemsPage.clickOnPinkDumbells();
       AddedToCartPage addedToCartPage = basicsNeoprenDubbellPage.addItemToCart();
       assertEquals(addedToCartPage.getAddedToCartText(),"Added to Cart","added to cart text is not found");
    }

    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testAccountPage(){
      HomePage homePage=new HomePage(getDriver());
       homePage.open();
       assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        Header header=new Header(getDriver());
        header.hoverAccountListSigninButton();
        AccountPage accountPage = header.clickOnAccountLink();
       assertEquals(accountPage.getAccountTitle(),"Your Account",
                "You are not on the AccountPage");
    }

    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testNegativeSignIn(){
      HomePage homePage=new HomePage(getDriver());
      homePage.open();
      assertTrue(homePage.isPageOpened(), "Home page is not opened!");
      Header header=new Header(getDriver());
      SignInPage signInPage = header.clickOnAccountListSigninButton();
      signInPage.clickAndInputEmail("tomalli1234@mail.ru");
      signInPage.clickOnContinueButton();
      assertEquals(signInPage.getErrorText(),"There was a problem",
               "Error text in not found.");
    }

    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testAmazonBestSellers(){
     HomePage homePage=new HomePage(getDriver());
     homePage.open();
     assertTrue(homePage.isPageOpened(), "Home page is not opened!");
     NavigationBar navigationBar = new NavigationBar(getDriver());
     navigationBar.clickOnAllMenuButton();
     BestSellersPage bestSellersPage= navigationBar.clickOnBestSellerLink();
     assertEquals(bestSellersPage.getBestSellersText(),"Amazon Best Sellers",
                "Best Sellers text is not found");
    }

    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testCreateAccountWithWrongEmail(){
       HomePage homePage=new HomePage(getDriver());
       homePage.open();
       assertTrue(homePage.isPageOpened(), "Home page is not opened!");
       Header header=new Header(getDriver());
       header.hoverAccountListSigninButton();
       CreateAccountPage createAccountPage=header.clickOnStartNewCustomerLink();
       createAccountPage.clickAndInputName("Name");
       createAccountPage.clickAndInputEmail("email@mail.ru");
       createAccountPage.clickAndInputPassword("123456");
       createAccountPage.clickAndInputRePassword("123456");
       createAccountPage.clickOnContinueButton();
       assertTrue(createAccountPage.isContinueButtonPresented(),"ContinueButton is not presented");
    }
}
