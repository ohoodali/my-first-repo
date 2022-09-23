package pages2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterUser extends BasePage{

    public RegisterUser(WebDriver driver) {
        super(driver);
    }


    private By signuplogin = By.xpath("//a[@href='/login']");
    private By newusersignup = By.xpath("//div[@class=\"signup-form\"]/h2");
    private By name = By.xpath("//input[@data-qa=\"signup-name\"]");
    private By email = By.xpath("//input[@data-qa=\"signup-email\"]");
    private By signupbutton = By.xpath("//button[@data-qa=\"signup-button\"]");
    private By accountinformatiom = By.xpath("(//h2[@class=\"title text-center\"]/b)[1]");









    public RegisterUser clickSignup ()

    {
        clickElement(signuplogin);
        return new RegisterUser(driver);
    }
    public void NewUserSignupVisible (String newuser)
    {

        String newuse= getTextOfElement(newusersignup);
        Assert.assertEquals(newuse,newuser,"New User Signup! Shown");
    }
    public RegisterUser enternameemail (String uname,String uemail)

    {
        typeOnInputField(name,uname);
        typeOnInputField(email,uemail);
        clickElement(signupbutton);
        return new RegisterUser(driver);
    }
    public void AccountInformation (String info)
    {

        String acoountinfo= getTextOfElement(accountinformatiom);
        Assert.assertEquals(acoountinfo,info,"ENTER ACCOUNT INFORMATION Shoud Be Shown");
    }
}
