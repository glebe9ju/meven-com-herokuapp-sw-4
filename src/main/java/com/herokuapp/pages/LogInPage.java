package com.herokuapp.pages;

import com.herokuapp.utility.Utility;
import org.openqa.selenium.By;

public class LogInPage extends Utility {
    By userName = By.xpath("//input[@id='username']");
    By passWord = By.xpath("//input[@id='password']");
    By logIn = By.xpath("//i[contains(text(),'Login')]");
    By verifyText = By.xpath("//h2[normalize-space()='Secure Area']");
    By userErrorMessage = By.xpath("//div[@id='flash']");
    By pssErrorMessage = By.xpath("//div[@id='flash']");

    public void enterUserName(String user){
        sendTextToElement(userName,user);
    }
    public void enterPassWord(String pass){
        sendTextToElement(passWord,pass);
    }
    public void clickOnLogInButton(){
        clickOnElement(logIn);
    }
    public String verifySecureTextDisplay(){
        return getTextFromElement(verifyText);
    }
    public String invalidUserName() {
        return getTextFromElement(userErrorMessage);
    }
    public String invalidPassWord(){
        return getTextFromElement(pssErrorMessage);
    }
    }




