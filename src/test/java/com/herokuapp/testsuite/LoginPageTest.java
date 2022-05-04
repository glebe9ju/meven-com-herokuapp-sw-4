package com.herokuapp.testsuite;

import com.herokuapp.pages.LogInPage;
import com.herokuapp.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LogInPage logIn = new LogInPage();

    @Test
    public void userShouldLogInWithValidCredential() {
        logIn.enterUserName("tomsmith");
        logIn.enterPassWord("SuperSecretPassword!");
        logIn.clickOnLogInButton();
        String expectedMessage = "Secure Area";
        String actualMessage = logIn.verifySecureTextDisplay();
        Assert.assertEquals(actualMessage, expectedMessage, "text is incorrect");
    }

    @Test
    public void verifyTheUsernameErrorMessage() {
        logIn.enterUserName("tomsmith1");
        logIn.enterPassWord("SuperSecretPassword!");
        logIn.clickOnLogInButton();
        String expectedMessage = "Your username is invalid!\n×";
        String actualMessage = logIn.invalidUserName();
        Assert.assertEquals(actualMessage, expectedMessage, "text is incorrect");
    }
@Test
    public void verifyThePasswordErrorMessage(){
    logIn.enterUserName("tomsmith");
    logIn.enterPassWord("SuperSecretPassword");
    logIn.clickOnLogInButton();
    String expectedMessage = "Your password is invalid!\n×";
    String actualMessage = logIn.invalidUserName();
    Assert.assertEquals(actualMessage, expectedMessage, "text is incorrect");

}


}

