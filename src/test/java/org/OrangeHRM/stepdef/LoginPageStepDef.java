package org.OrangeHRM.stepdef;

import base.BaseClass;
import driver.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.opencart.pages.LoginPage;
import org.testng.Assert;
import utils.ConfigReader;

public class LoginPageStepDef extends BaseClass {
     private LoginPage page;

    @Given("I am on the Orange login page")
    public void i_am_on_the_orange_login_page() {
        launchApplication();
        page = new LoginPage(DriverManager.getDriver());
         System.out.println("login page opened");

    }
    @Given("I have entered valid username and password")
    public void i_have_entered_valid_username_and_password() throws InterruptedException {
        waitForelement(2);
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
    public void i_should_able_to_login_successfull() throws InterruptedException {
        waitForelement(4);
        String title= page.getTitleOfDashBoardPage();
        System.out.println("DashBoard title : "+title);
        Assert.assertEquals(title,"Dashboard");

    }

    @Given("I have entered {string} and {string}")
    public void iHaveEnteredAnd(String username, String password) throws InterruptedException {
        waitForelement(2);
        page.enterUsernameAndPassword(username,password);
    }

    @Then("I should able to get {string}")
    public void iShouldAbleToGet(String message) throws InterruptedException {
        waitForelement(4);
        String msg=page.getErrorMassage();
        Assert.assertEquals(msg,message,"error massage matched");
    }


    @Then("I should able to get {string} and {string}")
    public void iShouldAbleToGetAnd(String message1, String message2) throws InterruptedException {
        waitForelement(4);
        String usernameMsg= page.getUsernameErrorMassage();
        String pwdMsg=page.getPwdErrorMassage();
        Assert.assertEquals(usernameMsg,message1,"error massage matched");
        Assert.assertEquals(pwdMsg,message2,"error massage matched");
    }

    @When("I click the Forgot Password Link")
    public void iClickTheForgotPasswordLink() throws InterruptedException {
        waitForelement(2);
        page.clickOnForgotPassword();

    }

    @Then("I should able to enter resetPassword Page")
    public void iShouldAbleToEnterResetPasswordPage() throws InterruptedException {
        waitForelement(4);
        String title = page.getTitleOfForgotPage();
        Assert.assertEquals(title,"Reset Password");

    }

    @Then("I should able to navigated to Dashboard")
    public void iShouldAbleToNavigatedToDashboard() throws InterruptedException {
        waitForelement(4);
        String title= page.getTitleOfDashBoardPage();
        System.out.println("DashBoard title : "+title);
        Assert.assertEquals(title,"Dashboard");
    }
}
