package org.opencart.pages;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "//button[normalize-space(text()='Login')]")
    private WebElement loginButton;

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
}
