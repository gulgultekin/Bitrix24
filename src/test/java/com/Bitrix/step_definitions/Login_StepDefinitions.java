package com.Bitrix.step_definitions;

import com.Bitrix.pages.LoginPages;
import com.Bitrix.utilities.ConfigurationReader;
import com.Bitrix.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPages loginPages = new LoginPages();

    @Given("User is in the login page")
    public void user_is_in_the_login_page() {

        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);


    }


    @When("User logs in as marketing")
    public void user_logs_in_as_marketing() {
        loginPages.userName.sendKeys("marketing31@cybertekschool.com");
        loginPages.password.sendKeys("UserUser");
        loginPages.loginButton.click();
    }


    @Then("User should see ActivityStream")
    public void user_should_see_activity_stream() {
     String actualResult = loginPages.activityStreamLogo.getText();
     String expectedResult = "Activity Stream";
        Assert.assertEquals(actualResult,expectedResult);
    }


}
