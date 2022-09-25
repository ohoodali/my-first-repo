package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage{
    // Locators
    By emailField = By.xpath("//input[@data-qa=\"login-email\"]");
    By passwordField = By.xpath("//input[@data-qa=\"login-password\"]");
    By loginBtn = By.xpath("//button[@data-qa=\"login-button\"]");
    By logintoaccount = By.xpath("//div[@class=\"login-form\"]/h2");
    By incorrect = By.xpath("//p[ contains (text(), \"Your email or password \" )]");



    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage loginToAppWithValidCredentials (String email,String pass)
    {
        typeOnInputField(emailField, email);
        typeOnInputField(passwordField, pass);
        clickElement(loginBtn);
        return new LoginPage(driver);
    }
    public void logintoyouraccountVisible (String newlogin)
    {

        String loginaccount= getTextOfElement(logintoaccount);
        Assert.assertEquals(loginaccount,newlogin,"Login to your account Shown");
    }
    public LoginPage loginToAppWithInvalidCredentials (String invalidEmail,String pass)
    {
        typeOnInputField(emailField, invalidEmail);
        typeOnInputField(passwordField, pass);
        clickElement(loginBtn);
        return new LoginPage(driver);
    }

    public void incorrectEmailorpassword (String lincorrect)
    {

        String loginaccount= getTextOfElement(incorrect);
        Assert.assertEquals(loginaccount,lincorrect,"Your email or password is incorrect! Shown");
    }
}
