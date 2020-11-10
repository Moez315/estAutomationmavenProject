package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
public class LoginStepDefinitions {


    @Given("user is  on the Landing")
    public void user_is_on_the_landing() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user Logs in")
    public void user_logs_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should see dashboard page")
    public void user_should_see_dashboard_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
   }
*/
    // so when we using this our code is run normail
    // after we using it and elete some this and using to with webdriver
public class LoginStepDefinitions {
     WebDriver driver;

    @Given("user is  on the Landing")
    public void user_is_on_the_landing() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://qa1.vytrack.com");
    }
    @When("user Logs in")
    public void user_logs_in() throws InterruptedException {
     driver.findElement(By.id("prependedInput")).sendKeys("salesmanager110");
     driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123", Keys.ENTER);
       Thread.sleep(3000);
        }


    @Then("user should see dashboard page")
    public void user_should_see_dashboard_page() {
        String expected ="Dashboard";
        String actual = driver.findElement(By.className("oro-subtitle")).getText().trim();

        Assert.assertEquals("Title is not correct!",expected,actual);
        System.out.println("I see the dashboard page!");
        driver.quit();
    }
}
