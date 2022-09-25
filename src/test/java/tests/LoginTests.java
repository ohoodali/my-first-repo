package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTests_Parent2{
    @Test
    public void LoginPage () {

        LoginPage loginpage=new LoginPage(driver);

        loginpage.logintoyouraccountVisible("Login to your account");
        //log with valid email and password
       //loginpage.loginToAppWithValidCredentials("ertr@gmail.com","111111");
       //log with Invalid email and password you must run one by one you can't run two together
        loginpage.loginToAppWithInvalidCredentials("msohood@gmail.com","111111");
        loginpage.incorrectEmailorpassword("Your email or password is incorrect!");

    }

    }
