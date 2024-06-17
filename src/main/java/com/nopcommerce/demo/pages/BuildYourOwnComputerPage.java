package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Build your own computer Text, Processor Drop Down, Ram drop down, HDD radios, os radio,
 * software check boxes, Add To Card button,
 * "The product has been added to your shopping cart" message locators and it's actions
 */
public class BuildYourOwnComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Build your own computer']")
    WebElement buildYourOwnComputerText;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processorDropdown;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ramDropdown;

    @CacheLookup
    @FindBy(id = "product_attribute_3_6")
    WebElement hddRadio320GB;

    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hddRadio400GB;

    @CacheLookup
    @FindBy(id = "product_attribute_4_8")
    WebElement osRadioVistaHome;

    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement osRadioVistaPremium;

    @CacheLookup
    @FindBy(id = "product_attribute_5_10")
    WebElement softwareCheckboxMicrosoftOffice;

    @CacheLookup
    @FindBy(id = "product_attribute_5_11")
    WebElement softwareCheckboxAcrobatReader;

    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement softwareCheckboxTotalCommander;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement successMessagetxt;

    public void buildYourOwnComputerApplication(String processor,String ram,String hdd, String os, String software) {
        selectHdd(hdd);
        selectOs(os);
        selectSoftware(software);

    }


    public String getBuildYourOwnComputerText() {
        String message = getTextFromElement(buildYourOwnComputerText);
        return message;
    }

    public void selectProcessor(String processor) {
        processorDropdown.sendKeys(processor);
    }

    public void selectRam(String ram) {
        ramDropdown.sendKeys(ram);
    }

    public void selectHdd(String hdd) {
        if (hdd.equals("320 GB")) {
            hddRadio320GB.click();
        } else if (hdd.equals("400 GB")) {
            hddRadio400GB.click();
        }
    }

    public void selectOs(String os) {
        if (os.equals("Vista Home [+$50.00]")) {
            osRadioVistaHome.click();
        } else if (os.equals("Vista Premium [+$60.00]")) {
            osRadioVistaPremium.click();
        }
    }

    public void selectSoftware(String software) {
        if (software.contains("Microsoft Office [+$50.00]")) {
            softwareCheckboxMicrosoftOffice.click();
        }
        if (software.contains("Acrobat Reader [+$10.00]")) {
            softwareCheckboxAcrobatReader.click();
        }
        if (software.contains("Total Commander [+$5.00]")) {
            softwareCheckboxTotalCommander.click();
        }
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public Boolean isSuccessMessageDisplayed() {

        return successMessagetxt.isDisplayed();
    }
}
