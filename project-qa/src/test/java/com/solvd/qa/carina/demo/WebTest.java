package com.solvd.qa.carina.demo;

import com.solvd.qa.carina.demo.gui.pages.desktop.*;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebTest implements IAbstractTest {

    static WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        System.setProperty("webdriver.chrome.driver", "/Users/virasamarska/Downloads/chromedriver");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }


    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testAddingItemToTheCart(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
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

    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testAccountPage(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        homePage.hoverAccountListSigninButton();
        AccountPage accountPage = homePage.clickOnAccountLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(accountPage.getAccountTitle(),"Your Account",
                "You are not on the AccountPage");
        softAssert.assertAll();
    }

    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testNegativeSignIn(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        homePage.hoverAccountListSigninButton();
        SignInPage signInPage = homePage.clickOnSignInButton();
        signInPage.clickAndInputEmail("tomalli1234@mail.ru");
        signInPage.clickOnContinueButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(signInPage.getErrorText(),"There was a problem",
                "Error text in not found.");
        softAssert.assertAll();
    }

    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testAmazonBestSellers(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        homePage.clickOnAllMenuButton();
        BestSellersPage bestSellersPage= homePage.clickOnBestSellerLink();
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(bestSellersPage.getBestSellersText(),"Amazon Best Sellers","Best Sellers text is not found");
        softAssert.assertAll();
    }

    @Test
    @MethodOwner(owner = "vtomashevskii")
    public void testCreateAccountWithWrongEmail(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        homePage.hoverAccountListSigninButton();
        CreateAccountPage createAccountPage=homePage.clickOnStartNewCustomerLink();
        createAccountPage.clickAndInputName("Name");
        createAccountPage.clickAndInputEmail("email@mail.ru");
        createAccountPage.clickAndInputPassword("123456");
        createAccountPage.clickAndInputRePassword("123456");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(createAccountPage.getWrongEmailText(),
                "Wrong or Invalid email address or mobile phone number. Please correct and try again.",
                "Wrong email is not found");
        softAssert.assertAll();
    }

}
