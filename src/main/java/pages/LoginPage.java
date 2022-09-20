package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    // Locators
    By emailField = By.id("email_create");
   // By passwordField = By.id("Password");
    By loginBtn = By.id("SubmitCreate");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Operations on locators
    // successful login
    public HomePage loginToAppWithValidCredentials (String email)
    {
        typeOnInputField(emailField, email);
        clickElement(loginBtn);
        return new HomePage(driver);
    }
    public LoginPage loginToAppWithInvalidCredentials (String invalidEmail)
    {
        typeOnInputField(emailField, invalidEmail);
        clickElement(loginBtn);
        return new LoginPage(driver);
    }


}
