package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;


public class ComputerPageTest extends BaseTest {

    HomePage homePage;
    ComputerPage computerPage;
    DesktopPage desktopPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    @BeforeMethod

    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopPage = new DesktopPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

    /**
     * verifyUserShouldNavigateToComputerPageSuccessfully()
     * Click on Computer tab
     * Verify "Computer" text
     */


    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {


        homePage.clickComputerTab();
        Assert.assertTrue(computerPage.iscomputersTextDisplayed(), "Computer text is not displayed");
    }

    /**
     * verifyUserShouldNavigateToDesktopsPageSuccessfully()
     * Click on Computer tab
     * Click on Desktops link
     * Verify "Desktops" text
     */
    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {



        homePage.clickComputerTab();
        computerPage.clickDesktopsLink();
        Assert.assertTrue(desktopPage.isDesktopsTextDisplayed(), "Desktops text is not displayed");
    }

    /**
     * verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software)
     * Click on Computer tab
     * Click on Desktops link
     * Click on product name "Build your own computer"
     * Select processor "processor"
     * Select RAM "ram"
     * Select HDD "hdd"
     * Select OS "os"
     * Select Software "software"
     * Click on "ADD TO CART" Button
     * Verify message "The product has been added to your shopping cart"
     * @param processor
     * @param ram
     * @param hdd
     * @param os
     * @param software
     */


    @Test(groups = {"regression"}, dataProvider = "buildYourOwnComputerData", dataProviderClass = TestData.class)
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) {


        homePage.clickComputerTab();
        computerPage.clickDesktopsLink();
        desktopPage.selectProduct("Build your own computer");

        buildYourOwnComputerPage.selectProcessor(processor);
        buildYourOwnComputerPage.selectRam(ram);
        buildYourOwnComputerPage.selectHdd(hdd);
        buildYourOwnComputerPage.selectOs(os);
        buildYourOwnComputerPage.selectSoftware(software);
        buildYourOwnComputerPage.clickAddToCartButton();

        Assert.assertTrue(buildYourOwnComputerPage.isSuccessMessageDisplayed(), "Success message is not displayed");
    }

}
