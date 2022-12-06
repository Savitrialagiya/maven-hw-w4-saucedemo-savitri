package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends Utility {
    By usernameField = By.id("user-name");
    By passwordField = By.name("password");
    By loginButton = By.id("login-button");
    By productText = By.xpath("//span[contains(text(),'Products')]");
    By sixProduct = By.xpath("//div[@class='inventory_item']");

    public void enterUsername(String user){
        sendTextToElement(usernameField,user);
    }
   public void enterPassword(String password){
        sendTextToElement(passwordField,password);
   }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getProductText(){
        return getTextFromElement(productText);
    }
    public int getNumberOfProductPerPage(){
        List<WebElement> list = driver.findElements(sixProduct);
        return list.size();
    }


}
