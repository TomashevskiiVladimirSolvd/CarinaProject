package com.solvd.qa.carina.demo;

import com.solvd.qa.carina.demo.gui.components.header.HeaderComponent;
import com.solvd.qa.carina.demo.gui.components.navigation.NavigationComponent;
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
       HeaderComponent headerComponent =new HeaderComponent(getDriver());
       SearchItemsPage itemsPage = headerComponent.searhItem("dumbbells");
       ItemPage basicsNeoprenDubbellPage = itemsPage.clickOnPinkDumbells();
       AddedToCartPage addedToCartPage = basicsNeoprenDubbellPage.addItemToCart();
       assertEquals(addedToCartPage.getAddedToCartText(),"Added to Cart","added to cart text is not found");
    }

    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testAccountPage(){
      HomePage homePage=new HomePage(getDriver());
       homePage.open();
       assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        HeaderComponent headerComponent =new HeaderComponent(getDriver());
        headerComponent.hoverAccountListSigninButton();
        AccountPage accountPage = headerComponent.clickOnAccountLink();
       assertEquals(accountPage.getAccountTitle(),"Your Account",
                "You are not on the AccountPage");
    }

    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testNegativeSignIn(){
      HomePage homePage=new HomePage(getDriver());
      homePage.open();
      assertTrue(homePage.isPageOpened(), "Home page is not opened!");
      HeaderComponent headerComponent =new HeaderComponent(getDriver());
      SignInPage signInPage = headerComponent.clickOnAccountListSigninButton();
      signInPage.setEmail("tomalli1234@mail.ru");
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
     NavigationComponent navigationComponent = new NavigationComponent(getDriver());
     navigationComponent.clickOnAllMenuButton();
     BestSellersPage bestSellersPage= navigationComponent.clickOnBestSellerLink();
     assertEquals(bestSellersPage.getBestSellersText(),"Amazon Best Sellers",
                "Best Sellers text is not found");
    }

    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testCreateAccountWithWrongEmail(){
       HomePage homePage=new HomePage(getDriver());
       homePage.open();
       assertTrue(homePage.isPageOpened(), "Home page is not opened!");
       HeaderComponent headerComponent =new HeaderComponent(getDriver());
       headerComponent.hoverAccountListSigninButton();
       CreateAccountPage createAccountPage= headerComponent.clickOnStartNewCustomerLink();
       createAccountPage.setName("Name");
       createAccountPage.setEmail("email@mail.ru");
       createAccountPage.setPassword("123456");
       createAccountPage.setRePassword("123456");
       createAccountPage.clickOnContinueButton();
       assertTrue(createAccountPage.isContinueButtonPresented(),"ContinueButton is not presented");
    }
}
