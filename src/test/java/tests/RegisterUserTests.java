package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterUser;

public class RegisterUserTests extends BaseTests_Parent {


    @Test
public void testRegisteNewUser ()
{


    RegisterUser regist = new RegisterUser(driver);
    regist.clickSignup();
    regist.NewUserSignupVisible("New User Signup!");
    regist.enternameemail("ohood","kij@gmail.com");
    Assert.assertEquals(regist.AccountInformation(),"ENTER ACCOUNT INFORMATION","ENTER ACCOUNT INFORMATION Shoud Be Shown");
    regist.RegistNewUser("111111","12","01","2022","Ohood","Ali","SSS",
    "Fashen","BeniSuef", "India","sded","weed","00000","012144200");
    regist.CreateAccount();
    Assert.assertEquals(regist.AccountCreated(),"ACCOUNT CREATED!","ACCOUNT CREATED! Shoud Be Shown");
    regist.ClickCountinButton();
 //  Assert.assertEquals(  regist.CheckLoggedIn(),"Ohood","Ohood Shoud Be Shown");
    regist.ClickDeleteButton();
    regist.ClickDelete();
    Assert.assertEquals( regist.CheckDeelteAccount(),"Delete Account","Delete Account Shoud Be Shown");


}

}
