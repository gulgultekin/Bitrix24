package com.Bitrix.pages;

import com.Bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {

    public LoginPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement userName;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberMe;

    @FindBy(className = "login-btn")
    public WebElement loginButton;

    @FindBy(xpath = "(//*[text()='Activity Stream'])[2]")
    public WebElement activityStreamLogo;


    public void login(String username, String passWord){

        userName.sendKeys(username);
        password.sendKeys(passWord);
        loginButton.click();

    }


}
