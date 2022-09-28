package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class SearchTests extends BaseTests_Parent{
    @BeforeMethod
    public void testLoginPage () {
        HomePage base=new HomePage(driver);
        Assert.assertEquals( base.VeryHome(),"Signup / Login","The Sigin Sign Out");
        LoginPage loginpage=new LoginPage(driver);
        loginpage.clickLogin();
        Assert.assertEquals(loginpage.logintoyouraccountVisible(),"Login to your account","Login to your account Shown");
        //log with valid email and password
        //loginpage.loginToAppWithValidCredentials("ertr@gmail.com","111111");
        // log with Invalid email and password you must run one by one you can't run two together
        loginpage.loginToAppWithInvalidCredentials("msohood@gmail.com","111111");
        Assert.assertEquals(loginpage.incorrectEmailorpassword("msohood@gmail.com","111111"),"Your email or password is incorrect!","Your email or password is incorrect! Shown");
        }
    @Test
    public void testSearceProducatWithBlueKeyword ()
    {
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        navigationBarPage.clickProducat();
        SearchPage search = new SearchPage(driver);
        Assert.assertEquals(search.allProducatShown(),"ALL PRODUCTS","ALL PRODUCTS should be shown");
     //   search.searchProductbyname("Blue");
        search.searchProductbyname("Blue Top");
       Assert.assertEquals( search.AllSharedDisplayed(),"SEARCHED PRODUCTS","SEARCHED PRODUCTS should be shown");
       search.isKeyWordInProducatTitles("Blue");
      Assert.assertEquals(search.searchProduct(),"Blue Top","Blue Top should be shown");

    }

    }
