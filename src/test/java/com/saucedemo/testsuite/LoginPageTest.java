package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void  userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getProductText(),"PRODUCTS","Message not displayed");
    }
    @Test
    public void verifythatSixProductsAreDisplayedOnPage(){
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        int expected = 6;
        Assert.assertEquals(loginPage.getNumberOfProductPerPage(),expected,"Number of product not displayed");


    }




}
