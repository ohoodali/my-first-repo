package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTests_Parent{
    @Test
    public void testLoginPage () {

        LoginPage loginpage=new LoginPage(driver);
        Assert.assertEquals(loginpage.logintoyouraccountVisible(),"Login to your account","Login to your account Shown");
        //log with valid email and password
      // loginpage.loginToAppWithValidCredentials("ertr@gmail.com","111111");
       //log with Invalid email and password you must run one by one you can't run two together
        loginpage.loginToAppWithInvalidCredentials("msohood@gmail.com","111111");
        Assert.assertEquals(loginpage.incorrectEmailorpassword("msohood@gmail.com","111111"),"Your email or password is incorrect!","Your email or password is incorrect! Shown");



    }

    }
