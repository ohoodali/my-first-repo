package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NavigationBarPage extends BasePage{
    private By Producat = By.cssSelector("li>a[href=\"/products\"]");







    public NavigationBarPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage clickProducat ()

    {
        clickElement(Producat);
        return new LoginPage(driver);
    }








}
