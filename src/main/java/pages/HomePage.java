package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends BasePage{
    private By myhome = By.xpath("//a[@href='/login']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickHome (String hme)
    {
        String home= getTextOfElement(myhome);
        Assert.assertEquals(hme,home);

    }
}
