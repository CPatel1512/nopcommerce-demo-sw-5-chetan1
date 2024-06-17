package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    /**
     * Register Text, male female radio, Firstname, lastname, Date of Birth drop down, email, Password,
     * Confirm Password, Register Button, "First name is required.","Last name is required.",
     * "Email is required.","Password is required.", "Password is required." error message,
     * "Your registration completed" message, "CONTINUE" button
     * Locators and it's actions
     */
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement genderMaleRadio;

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement genderFemaleRadio;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthDayDropdown;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement dateOfBirthMonthDropdown;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement dateOfBirthYearDropdown;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//span[text()='First name is required.']")
    WebElement firstNameErrorMessage;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Last name is required.']")
    WebElement lastNameErrorMessage;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Email is required.']")
    WebElement emailErrorMessage;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Password is required.']")
    WebElement passwordErrorMessage;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Password is required.']")
    WebElement confirmPasswordErrorMessage;

    @CacheLookup
    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement registrationSuccessMessage;

    @CacheLookup
    @FindBy(xpath = "//a[@class='button-1 register-continue-button']")
    WebElement continueButton;

    public boolean isRegisterTextDisplayed() {
        return registerText.isDisplayed();
    }

    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("Male")) {
            genderMaleRadio.click();
        } else if (gender.equalsIgnoreCase("Female")) {
            genderFemaleRadio.click();
        }
    }

    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void selectDateOfBirth(String day, String month, String year) {
        dateOfBirthDayDropdown.sendKeys(day);
        dateOfBirthMonthDropdown.sendKeys(month);
        dateOfBirthYearDropdown.sendKeys(year);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public boolean isFirstNameErrorMessageDisplayed() {
        return firstNameErrorMessage.isDisplayed();
    }

    public boolean isLastNameErrorMessageDisplayed() {
        return lastNameErrorMessage.isDisplayed();
    }

    public boolean isEmailErrorMessageDisplayed() {
        return emailErrorMessage.isDisplayed();
    }

    public boolean isPasswordErrorMessageDisplayed() {
        return passwordErrorMessage.isDisplayed();
    }

    public boolean isConfirmPasswordErrorMessageDisplayed() {
        return confirmPasswordErrorMessage.isDisplayed();
    }

    public boolean isRegistrationSuccessMessageDisplayed() {
        return registrationSuccessMessage.isDisplayed();
    }

    public void clickContinueButton() {
        continueButton.click();
    }

}
