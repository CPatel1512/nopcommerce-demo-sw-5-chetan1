package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.excelutility.ExcelUtility;
import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class BuildYourOwnComputerTestWithExcelData extends BaseTest {
    public static final String FILE_PATH = System.getProperty("user.dir") + "/src/test/java/resources/testdata/ExcelData.xlsx";

    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    @BeforeClass
    public void setExcel() {
        //tell the code about the location of the Excel file
        try {
            ExcelUtility.setExcelFile(FILE_PATH, "BuildYourOwnComputerTest");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DataProvider(name = "dataFromExcel")
    public Object[][] getData(){
        return ExcelUtility.getTestData("Data_Set");
    }

    @Test(groups = {"sanity","regression"}, dataProvider = "dataFromExcel")
    public void verifyOptionsForBuildYourOwnComputer(String processor,String ram,String hdd,String os,String software) {
        homePage.clickComputerTab();
        computerPage.clickDesktopsLink();
        desktopPage.selectProduct("Build Your Own Computer");
        buildYourOwnComputerPage.buildYourOwnComputerApplication(processor,ram,hdd, os, software);
        Assert.assertTrue(buildYourOwnComputerPage.isSuccessMessageDisplayed(), "Success message is not displayed");
    }
}
