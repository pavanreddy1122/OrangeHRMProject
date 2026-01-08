package org.opencart.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtils;

public class LoginPage {
 private WaitUtils wait;
 private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait = new WaitUtils(driver);
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

    @FindBy(xpath = "//img[@class='oxd-userdropdown-img' and @alt='profile picture']")
    private WebElement profileICON;

    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logout;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//h5[text()='Login']")
    private WebElement loginPage;



  public void enterUsernameAndPassword(String uname, String pwd){
      wait.waitForVisibility(username);
      username.sendKeys(uname);
      password.sendKeys(pwd);
  }

  public String getPasswordAttribute(){
      return passwordField.getAttribute("type");
  }
  public String getLoginPage(){
      wait.waitForVisibility(loginPage);
      return loginPage.getText();
  }
  public void clickTheProfileIcon(){
      wait.waitForClick(profileICON);
      profileICON.click();
  }

  public void clickTheLogout(){
      wait.waitForClick(logout);
      logout.click();
  }

 public String getTitleOfForgotPage(){
      wait.waitForVisibility(getTheResetPasswordTitle);
      return getTheResetPasswordTitle.getText();
 }

    public String getTitleOfDashBoardPage(){
        wait.waitForVisibility(getTheDashBoardTitle);
        return getTheDashBoardTitle.getText();
    }
  public void clickOnForgotPassword(){
      wait.waitForClick(forgotPwd);
      forgotPwd.click();
  }
    public void enterUserName(String uname){
        wait.waitForVisibility(username);
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
      wait.waitForVisibility(usernameErrorMassage);
        return usernameErrorMassage.getText();
    }

    public String getPwdErrorMassage(){
        return pwdErrorMassage.getText();
    }

    public String getErrorMassage(){
      wait.waitForVisibility(errorMsg);
        return errorMsg.getText();
    }


}
