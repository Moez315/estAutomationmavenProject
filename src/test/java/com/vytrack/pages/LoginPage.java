package com.vytrack.pages;

//hier we can with base page class add to loginPage class

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends basePage{
// buyarda we open vytrack webside than kilick user name and ispact we can fine buy id than
// coppe it pass too @findby id= ()this space


    @FindBy(id="prependedInput")
    private WebElement username;

    @FindBy(id="prependedInput2")
    private WebElement Password;

    public void login(String usernameValue,String PasswordValue){
        username.sendKeys(usernameValue);
        Password.sendKeys(PasswordValue, Keys.ENTER);
    }



}
