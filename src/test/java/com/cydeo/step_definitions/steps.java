package com.cydeo.step_definitions;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class steps {

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }

    @When("user enter username")
    public void user_enter_username() {

        Driver.getDriver().findElement(By.xpath("//input[@id = 'user']"))
                .sendKeys(ConfigurationReader.getProperty("username_1"));

    }

    @When("user enter passcode")
    public void user_enter_passcode() {

        Driver.getDriver().findElement(By.xpath("//input[@id = 'password']"))
                .sendKeys(ConfigurationReader.getProperty("password"));
    }

    @When("user click the login button")
    public void user_click_the_login_button() {
Driver.getDriver().findElement(By.xpath("//input[@id = 'submit-form']")).click();

    }
}