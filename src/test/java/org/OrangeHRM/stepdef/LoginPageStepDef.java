package org.OrangeHRM.stepdef;

import base.BaseClass;
import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.opencart.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

public class LoginPageStepDef extends BaseClass {
     private LoginPage page;
     //private WebDriver driver;

   /* @Before
    public void setup(){
        page = new LoginPage(driver);
    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }

    }*/

    @Given("I am on the Orange login page")
    public void i_am_on_the_orange_login_page() {
        launchApplication();
        page = new LoginPage(DriverManager.getDriver());
         System.out.println("login page opened");

    }
    @Given("I have entered valid username and password")
    public void i_have_entered_valid_username_and_password() throws InterruptedException {
        Thread.sleep(2000);
        page.enterUserName(ConfigReader.getProperty("username"));
       page.enterPassword(ConfigReader.getProperty("password"));
        System.out.println("Username and Password entered successfully");
    }
    @When("I click the login button")
    public void i_click_the_login_button() {
       page.clickOnLoggin();
        System.out.println("login button clicked");

    }
    @Then("I should able to login successfull")
    public void i_should_able_to_login_successfull() {
        System.out.println("Page title : "+page.title());
    }

}
