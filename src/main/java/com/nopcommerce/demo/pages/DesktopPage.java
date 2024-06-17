package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Desktops text, Sortby, Display, selectProductList Locators and it's actions
 */
public class DesktopPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Desktops']")
    WebElement desktopsText;

    @FindBy(id = "products-orderby")
    WebElement sortByDropdown;

    @FindBy(id = "products-pagesize")
    WebElement displayDropdown;

    @FindBy(xpath = "//div[@class='product-item']")
    WebElement productList;
    public boolean isDesktopsTextDisplayed() {
        return desktopsText.isDisplayed();
    }

    public void selectSortBy(String sortBy) {
        sortByDropdown.sendKeys(sortBy);
    }

    public void selectDisplay(String display) {
        displayDropdown.sendKeys(display);
    }

    public void selectProduct(String productName) {
        productList.findElement(By.linkText(productName)).click();
    }

}
