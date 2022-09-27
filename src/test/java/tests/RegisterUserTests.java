package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterUser;

public class RegisterUserTests extends BaseTests_Parent2 {

@Test
public void RegisteUser ()
{

    RegisterUser regist = new RegisterUser(driver);
    regist.NewUserSignupVisible("New User Signup!");
    regist.enternameemail("ohood","swes@gmail.com");
    regist.AccountInformation("ENTER ACCOUNT INFORMATION");
    regist.SelectTitle();
    regist.WritePssword("111111");
    regist.SelectDays("12");
    regist.SelectMonths("01");
    regist.SelectYears("2022");
    regist.ClickNews();
    regist.ClickSpicOffer();
    regist.WriteFirstName("Ohood");
    regist.WriteLastName("Ali");
    regist.WriteCompany("SSS");
    regist.WriteAddress1("Fashen");
    regist.WriteAddress2("BeniSuef");
    regist.SelectCounty("India");
    regist.WriteStata("sded");
    regist.Writecity("weed");
    regist.Writezeip("00000");
    regist.WriteMobile("012144200");
    regist.CreateAccount();
    Assert.assertEquals(regist.AccountCreated(),"ACCOUNT CREATED!","ACCOUNT CREATED! Shoud Be Shown");
    regist.ClickCountinButton();
 //   Assert.assertEquals(  regist.CheckLoggedIn(),"Ohood","Ohood Shoud Be Shown");
    regist.ClickDeleteButton();
    regist.ClickDelete();
    Assert.assertEquals( regist.CheckDeelteAccount(),"Delete Account","Delete Account Shoud Be Shown");





}

}
