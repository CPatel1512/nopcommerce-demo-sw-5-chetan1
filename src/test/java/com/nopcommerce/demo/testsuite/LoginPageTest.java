package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 */

public class LoginPageTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    /**
     * verifyTheErrorMessageWithInValidCredentials().
     * Click on login link
     * Enter EmailId
     * Enter Password
     * Click on Login Button
     * Verify that the Error message
     */

    @Test(groups = {"sanity","regression"})
    public void verifyTheErrorMessageWithInValidCredentials() {

        homePage.clickLoginLink();
        loginPage.enterEmail("hetan123@gmail.com");
        loginPage.enterPassword("Chetan1234546");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isWelcomeMessageDisplayed(), "Error message is not displayed");

    }

    /**
     * 1.userShouldNavigateToLoginPageSuccessFully().
     * Click on login link
     * verify that "Welcome, Please Sign In!" message display
     */
    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickLoginLink();
        Assert.assertTrue(loginPage.isWelcomeMessageDisplayed(), "Welcome message is not displayed");
    }

    /**
     * verifyThatUserShouldLogInSuccessFullyWithValidCredentials.
     * Click on login link
     * Enter EmailId
     * Enter Password
     * Click on Login Button
     * Verify that LogOut link is display
     */
    @Test(groups = {"smoke","regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {


        homePage.clickLoginLink();
        loginPage.enterEmail("chetan123@gmail.com");
        loginPage.enterPassword("Chetan123");
        loginPage.clickLoginButton();

        Assert.assertTrue(homePage.isLogOutLinkDisplayed(), "Log out link is not displayed");
    }

    /**
     * verifyThatUserShouldLogOutSuccessFully()
     * Click on login link
     * Enter EmailId
     * Enter Password
     * Click on Login Button
     * Click on LogOut Link
     * Verify that LogIn Link Display
     */

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogOutSuccessFully() {


        homePage.clickLoginLink();
        loginPage.enterEmail("chetan123@gmail.com");
        loginPage.enterPassword("Chetan123");
        loginPage.clickLoginButton();
        homePage.clickLogOutLink();

        Assert.assertTrue(homePage.isNopcommerceLogoDisplayed(), "Login link is not displayed");


    }
}
