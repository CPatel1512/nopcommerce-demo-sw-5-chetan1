package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * All Menu (Seven menu), LoginLink, registerLink, nopcommerce logo, My account link and LogOut link locators and create appropriate methods for it.
 */
public class HomePage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(css = "img[alt='nopCommerce demo store']")
    WebElement nopcommerceLogo;

    @CacheLookup
    @FindBy(linkText = "My account")
    WebElement myAccountLink;

    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement logOutLink;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computerTab;

    public void clickComputerTab(){
    clickOnElement(computerTab);
    }

    public void clickLoginLink() {
        loginLink.click();
    }

    public void clickRegisterLink() {
        registerLink.click();
    }

    public boolean isNopcommerceLogoDisplayed() {
        return nopcommerceLogo.isDisplayed();
    }

    public boolean isMyAccountLinkDisplayed() {
        return myAccountLink.isDisplayed();
    }

    public boolean isLogOutLinkDisplayed() {
        return logOutLink.isDisplayed();
    }

    public void clickLogOutLink() {
        logOutLink.click();
    }
}
