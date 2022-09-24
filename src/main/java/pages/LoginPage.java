package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    // Locators
    By emailField = By.xpath("//input[@data-qa=\"login-email\"]");
    By passwordField = By.xpath("//input[@data-qa=\"login-password\"]");
    By loginBtn = By.xpath("//button[@data-qa=\"login-button\"]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

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
