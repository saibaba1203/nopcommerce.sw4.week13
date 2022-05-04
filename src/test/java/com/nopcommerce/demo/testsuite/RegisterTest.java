package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    RegisterPage registerPage = new RegisterPage();
@Test
public void userShouldRegisterAccountSuccessfully(){
    registerPage.verifyRegisterText();
    registerPage.clickOnGenderRadioButton();
    registerPage.inputFirstName();
    registerPage.inputLastName();
    registerPage.inputEmail();
    registerPage.clickOnNewsletterCheckbox();
    registerPage.inputPassword();
    registerPage.inputConfirmPassword();
    registerPage.clickRegisterButton();
    registerPage.verifyRegistrationCompleteText();
    registerPage.clickOnContinueButton();
}
}
