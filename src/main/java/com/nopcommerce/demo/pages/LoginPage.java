package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Email, password, Login Button and "Welcome, Please Sign In!" text Locators and create appropriate methods for it.
 */
public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Log in']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    public void enterEmail(String email) {
        emailField.sendKeys(email);
        Reporter.log("Enter email " + email + " to email field " + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
        Reporter.log("Enter password " + password + " to password field " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }


    public boolean isWelcomeMessageDisplayed() {
        return welcomeText.isDisplayed();
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }



    public void clickOnLoginButton(){
        Reporter.log("Clicking on Login Button " + loginButton.toString());
        clickOnElement(loginButton);
    }
    public void loginToApplication(String username, String password) {
        enterEmail(username);
        enterPassword(password);
        clickOnLoginButton();
    }

}



