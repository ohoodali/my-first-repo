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
    public void AccountInformation (String info)
    {

        String acoountinfo= getTextOfElement(accountinformatiom);
        Assert.assertEquals(acoountinfo,info,"ENTER ACCOUNT INFORMATION Shoud Be Shown");
    }
    public RegisterUser SelectTitle ()
    {

        clickElement(title);
        return new RegisterUser(driver);
    }
    public RegisterUser WritePssword (String password)
    {

        typeOnInputField(pass,password);
        return new RegisterUser(driver);
    } public RegisterUser SelectDays (String day)
    {

        typeOnInputField(days,day);
        return new RegisterUser(driver);
    }
    public RegisterUser SelectMonths (String month)
    {

        typeOnInputField(months,month);
        return new RegisterUser(driver);
    }
    public RegisterUser SelectYears (String year)
    {

        typeOnInputField(years,year);
        return new RegisterUser(driver);
    }
    public RegisterUser ClickNews ()

    {
        clickElement(newsletter);
        return new RegisterUser(driver);
    }
    public RegisterUser ClickSpicOffer ()

    {
        clickElement(spoffer);
        return new RegisterUser(driver);
    }
    public RegisterUser WriteFirstName (String fname)
    {

        typeOnInputField(firstname,fname);
        return new RegisterUser(driver);
    }
    public RegisterUser WriteLastName (String lname)
    {

        typeOnInputField(lastnmae,lname);
        return new RegisterUser(driver);
    }
    public RegisterUser WriteCompany (String ycompay)
    {

        typeOnInputField(company,ycompay);
        return new RegisterUser(driver);
    }
    public RegisterUser WriteAddress1 (String adddressond)
    {

        typeOnInputField(address1,adddressond);
        return new RegisterUser(driver);
    }
    public RegisterUser WriteAddress2 (String adddresstwo)
    {

        typeOnInputField(address2,adddresstwo);
        return new RegisterUser(driver);
    }
    public RegisterUser SelectCounty (String ycounty)

    {
        typeOnInputField(country,ycounty);

        return new RegisterUser(driver);
    }
    public RegisterUser WriteStata (String ystate)
    {

        typeOnInputField(state,ystate);
        return new RegisterUser(driver);
    }
    public RegisterUser Writecity (String ycity)
    {

        typeOnInputField(city,ycity);
        return new RegisterUser(driver);
    }
    public RegisterUser Writezeip (String zip)
    {

        typeOnInputField(zipcode,zip);
        return new RegisterUser(driver);
    }
    public RegisterUser WriteMobile (String mobil)
    {

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
