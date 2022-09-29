package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterUser extends BasePage {

    public RegisterUser(WebDriver driver) {
        super(driver);
    }


    private By signuplogin = By.xpath("//a[@href='/login']");
    private By newusersignup = By.xpath("//div[@class=\"signup-form\"]/h2");
    private By name = By.xpath("//input[@data-qa=\"signup-name\"]");
    private By email = By.xpath("//input[@data-qa=\"signup-email\"]");
    private By signupbutton = By.xpath("//button[@data-qa=\"signup-button\"]");

    private By accountinformatiom = By.xpath("(//h2[@class=\"title text-center\"]/b)[1]");
    private By title = By.id("id_gender1");
    private By pass = By.id("password");
    private By days = By.id("days");
    private By months = By.id("months");
    private By years = By.id("years");
    private By newsletter = By.id("newsletter");
    private By spoffer = By.id("optin");
    private By firstname = By.id("first_name");
    private By lastnmae = By.id("last_name");
    private By company = By.id("company");
    private By address1 = By.id("address1");
    private By address2 = By.id("address2");
    private By country = By.id("country");
    private By state = By.id("state");
    private By city = By.id("city");
    private By zipcode = By.id("zipcode");
    private By mobile_number = By.id("mobile_number");
    private By createaccpuntbutt = By.xpath("//button[@data-qa=\"create-account\"]");

    private By accountCreated = By.xpath("//h2[@data-qa=\"account-created\"]/b");
    private By continubutton = By.xpath("//a[@data-qa=\"continue-button\"]");
    private By loggedin = By.xpath("//i[@class=\"fa fa-user\"]");

    private By deletedshown = By.xpath("//div[@class=\"page-header\"]");

    private By deleteaccount = By.xpath("//a[@href=\"/delete_account\"]");
    private By deletebutton = By.xpath("//button[@class=\"btn btn-danger\"]");


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

    public String AccountInformation ()
    {
        String acoountinfo= getTextOfElement(accountinformatiom);

        return acoountinfo;
    }
    public RegisterUser RegistNewUser (String password ,String day,String month, String year, String fname,String lname,String ycompay,String adddressond,String adddresstwo, String ycounty,
    String ystate,String ycity,String zip,String mobil)
    {

        clickElement(title);
        typeOnInputField(pass,password);
        typeOnInputField(days,day);
        typeOnInputField(months,month);
        typeOnInputField(years,year);
        clickElement(newsletter);
        clickElement(spoffer);
        clickElement(spoffer);
        typeOnInputField(firstname,fname);
        typeOnInputField(lastnmae,lname);
        typeOnInputField(company,ycompay);
        typeOnInputField(address1,adddressond);
        typeOnInputField(address2,adddresstwo);
        typeOnInputField(country,ycounty);
        typeOnInputField(state,ystate);
        typeOnInputField(city,ycity);
        typeOnInputField(zipcode,zip);
        typeOnInputField(mobile_number,mobil);

       return new RegisterUser(driver);

    }
      public RegisterUser CreateAccount ()

    {
        clickElement(createaccpuntbutt);
        return new RegisterUser(driver);
    }
    public String AccountCreated ()

    {
        String accountcrea= getTextOfElement(accountCreated);
        return  accountcrea;
    }

    public String CheckLoggedIn ()

    {
        String loggedinacc= getTextOfElement(loggedin);
        return loggedinacc;
    }
    public RegisterUser ClickCountinButton ()

    {
        clickElement(continubutton);
        return new RegisterUser(driver);
    }

    public RegisterUser ClickDeleteButton ()

    {
        clickElement(deleteaccount);
        return new RegisterUser(driver);
    }
    public RegisterUser ClickDelete ()

    {
        clickElement(deletebutton);
        return new RegisterUser(driver);
    }
    public String CheckDeelteAccount()

    {
        String deleted= getTextOfElement(deletedshown);
        return deleted;
    }
}
