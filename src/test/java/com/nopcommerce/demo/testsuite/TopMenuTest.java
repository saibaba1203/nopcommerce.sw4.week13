package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.utility.Utility;
import org.junit.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends Utility {

    BooksPage booksPage = new BooksPage();
    ApparelPage apparelPage = new ApparelPage();
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    GiftCardsPage giftCardsPage = new GiftCardsPage();
    JewelryPage jewelryPage = new JewelryPage();

    @Test
    public void verifyClickOnComputer() {
        homePage.clickOnComputerLink();
        //  homePage.clickOnDesktopMenuLink();
        String expectedText = "Computers";
        String actualText = computerPage.getComputerPageTitle();
        Assert.assertEquals(actualText, expectedText, "you are not on Computers Page");

    }

    @Test
    public void verifyClickOnApparel() {
        homePage.clickOnApparelLink();
        String expectedText = "Apparel";
        String actualText = apparelPage.getApparelPageTitle();
        Assert.assertEquals(actualText, expectedText, "you are not on Computer Page");
    }

    @Test
    public void verifyClickOnBooks() {
        homePage.clickOnBooksLink();
        String expectedText = "Books";
        String actualText = booksPage.getBooksTitleText();
        Assert.assertEquals(actualText, expectedText, "you are not on Books Page");
    }
    @Test
    public void verifyClickOnElectronicsPage() {
        homePage.clickOnElectronicsLink();
        String expectedText = "Electronics";
        String actualText = electronicsPage.getElectronicsPageTitle();
        Assert.assertEquals(actualText, expectedText, "you are not on Electronics Page");
    }
    @Test
    public void verifyClickOnJewelryPage() {
        homePage.clickOnJewleryLink();
        String expectedText = "Jewelry";
        String actualText = jewelryPage.getJewelryPageTitle();
        Assert.assertEquals(actualText, expectedText, "you are not on Jewelry Page");
    }
    @Test
    public void verifyClickOnDigitalDownloadsPage() {
        homePage.clickOnDigitalDownloadsLink();
        String expectedText = "Digital downloads";
        String actualText =digitalDownloadsPage.getDigitalDownloadPageTitle();
        Assert.assertEquals(actualText, expectedText, "you are not on Digital Downloads Page");
    }

    @Test
    public void verifyClickOnGiftCardsPagePage() {
        homePage.clickOnGiftCardsLink();
        String expectedText = "Gift Cards";
        String actualText = giftCardsPage.getGiftPageTitle();
        Assert.assertEquals(actualText, expectedText, "you are not on Gift Cards Page");
    }
}