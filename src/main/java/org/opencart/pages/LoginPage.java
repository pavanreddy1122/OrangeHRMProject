package org.opencart.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

 private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "username")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath = "//i/following-sibling::p[text()='Invalid credentials']")
    private WebElement errorMsg;

    @FindBy(xpath = "//button[normalize-space(text()='Login')]")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@name='username']/parent::div/following-sibling::span")
    private WebElement usernameErrorMassage;

    @FindBy(xpath = "//input[@name='password']/parent::div/following-sibling::span")
    private WebElement pwdErrorMassage;

    @FindBy(xpath = "//p[text()='Forgot your password? ']")
    private WebElement forgotPwd;

    @FindBy(xpath = "//h6[text()='Reset Password']")
    private WebElement getTheResetPasswordTitle;

    @FindBy(xpath = "//h6[text()='Dashboard']")
    private WebElement getTheDashBoardTitle;



  public void enterUsernameAndPassword(String uname, String pwd){
      username.sendKeys(uname);
      password.sendKeys(pwd);
  }

 public String getTitleOfForgotPage(){
      return getTheResetPasswordTitle.getText();
 }

    public String getTitleOfDashBoardPage(){
        return getTheDashBoardTitle.getText();
    }
  public void clickOnForgotPassword(){
      forgotPwd.click();
  }
    public void enterUserName(String uname){
        username.sendKeys(uname);

    }
    public void enterPassword(String pwd){
        password.sendKeys(pwd);
    }
    public void clickOnLoggin(){
        loginButton.click();
    }

    public String title(){
        return driver.getTitle();
    }

    public String getUsernameErrorMassage(){
        return usernameErrorMassage.getText();
    }

    public String getPwdErrorMassage(){
        return pwdErrorMassage.getText();
    }

    public String getErrorMassage(){
        return errorMsg.getText();
    }


}
