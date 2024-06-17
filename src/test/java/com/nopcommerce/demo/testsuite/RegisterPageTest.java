package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 */

public class RegisterPageTest extends BaseTest {

    HomePage homePage;
    RegisterPage registerPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }

    /**
     * verifyUserShouldNavigateToRegisterPageSuccessfully()
     * Click on Register Link
     * Verify "Register" text
     */

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {

        homePage.clickRegisterLink();
        Assert.assertTrue(registerPage.isRegisterTextDisplayed(), "Register text is not displayed");
    }

    /**
     * verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory()
     * Click on Register Link
     * Click on "REGISTER" button
     * Verify the error message "First name is required."
     * Verify the error message "Last name is required."
     * Verify the error message "Email is required."
     * Verify the error message "Password is required."
     * Verify the error message "Password is required."
     */

    @Test(groups = {"smoke","regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {


        homePage.clickRegisterLink();
        registerPage.clickRegisterButton();

        Assert.assertTrue(registerPage.isFirstNameErrorMessageDisplayed(), "First name error message is not displayed");
        Assert.assertTrue(registerPage.isLastNameErrorMessageDisplayed(), "Last name error message is not displayed");
        Assert.assertTrue(registerPage.isEmailErrorMessageDisplayed(), "Email error message is not displayed");
        Assert.assertTrue(registerPage.isPasswordErrorMessageDisplayed(), "Password error message is not displayed");
        Assert.assertTrue(registerPage.isConfirmPasswordErrorMessageDisplayed(), "Confirm password error message is not displayed");
    }

    /**
     * verifyThatUserShouldCreateAccountSuccessfully()
     * Click on Register Link
     * Select gender "Female"
     * Enter firstname
     * Enter lastname
     * Select day
     * Select month
     * Select year
     * Enter email
     * Enter password
     * Enter Confirm Password
     * Click on "REGISTER" button
     * Verify message "Your registration completed
     */
    @Test(groups = {"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully() {


        homePage.clickRegisterLink();
        registerPage.selectGender("Male");
        registerPage.enterFirstName("Chetan");
        registerPage.enterLastName("Patel");
        registerPage.selectDateOfBirth("15", "December", "1981");
        registerPage.enterEmail("chetan123@gmail.com");
        registerPage.enterPassword("Chetan123");
        registerPage.enterConfirmPassword("Chetan123");
        registerPage.clickRegisterButton();

        Assert.assertTrue(registerPage.isRegistrationSuccessMessageDisplayed(), "Registration success message is not displayed");
    }

}