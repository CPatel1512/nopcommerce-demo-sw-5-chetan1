package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Computers text, DesktopsLink, NotebooksLink, SoftwareLink Locators and create appropriate methods for it.
 */
public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Computers']")
    WebElement computersText;

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopsLink;

    @CacheLookup
    @FindBy(linkText = "Notebooks")
    WebElement notebooksLink;

    @CacheLookup
    @FindBy(linkText = "Software")
    WebElement softwareLink;

    public boolean iscomputersTextDisplayed() {
        return computersText.isDisplayed();
    }

    public void clickDesktopsLink() {
        desktopsLink.click();
    }

    public void clickNotebooksLink() {
        notebooksLink.click();
    }

    public void clickSoftwareLink() {
        softwareLink.click();
    }
}
