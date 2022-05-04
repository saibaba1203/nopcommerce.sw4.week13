package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage extends TestBase {
    HomePage homePage = new HomePage();
    com.nopcommerce.demo.pages.LoginPage loginPage = new com.nopcommerce.demo.pages.LoginPage();

   // LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage(){
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");


    }

    @Test
    public void usershouldLoginWithValidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("prime123@gmail.com");
        loginPage.enterPassword("prime123");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Log in";


    }
    @Test
    public void verifyTheErrorMessage(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("prime12@gmail.com");
        loginPage.enterPassword("prime123");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again." +
                "The credentials provided are incorrect";
        String actualErrorMessage = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        Assert.assertEquals("ErrorMessage is not displayed", expectedErrorMessage, actualErrorMessage);
    }

}


