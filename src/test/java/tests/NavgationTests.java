package tests;

import org.testng.annotations.Test;
import pages.*;

public class NavgationTests extends BaseTests_Parent{

    @Test(priority = 1)
    public void chekHomePage ()
    {
        HomePage base=new HomePage(driver);
        base.clickHome("Signup / Login");
    }

    @Test(priority = 2)
    public void ClickProducat ()
    {
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        navigationBarPage.clickProducat();
    }

    @Test(priority = 3)
    public void hoverFirstProducat ()
    {
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        navigationBarPage.hoverOverPro();
        navigationBarPage.clickLAddTocard();
        navigationBarPage.clickLShopping();
    }
    @Test(priority = 4)
    public void clickContinuButton ()
    {
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        navigationBarPage.hoverOverPro();
        navigationBarPage.clickLAddTocard();
        navigationBarPage.clickLShopping();
    }
    @Test(priority = 5)
    public void hoveSecondProducat ()
    {
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
         navigationBarPage.hoverOverPro();
         navigationBarPage.clickLAddTocard();
         navigationBarPage.clickLShopping();
         navigationBarPage.hoverOverPro2();
         navigationBarPage.clickLAddTocard2();
    }
    @Test(priority = 6)
    public void showCart ()
    {
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
         navigationBarPage.hoverOverPro();
         navigationBarPage.clickLAddTocard();
         navigationBarPage.clickLShopping();
         navigationBarPage.hoverOverPro2();
         navigationBarPage.clickLAddTocard2();
         navigationBarPage.clickLView();

    }
    @Test(priority = 7)
    public void checkTwoProducat ()
    {
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
         navigationBarPage.hoverOverPro();
         navigationBarPage.clickLAddTocard();
         navigationBarPage.clickLShopping();
         navigationBarPage.hoverOverPro2();
         navigationBarPage.clickLAddTocard2();
         navigationBarPage.clickLView();
         navigationBarPage.getFirstProdu("Men Tshirt");
         navigationBarPage.getSeconProdu("Summer White Top");


    }


    @Test(priority =8 )
    public void checkPricesQuTotalProducat ()
    {

        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        navigationBarPage.hoverOverPro();
        navigationBarPage.clickLAddTocard();
        navigationBarPage.clickLShopping();
        navigationBarPage.hoverOverPro2();
        navigationBarPage.clickLAddTocard2();
        navigationBarPage.clickLView();
        navigationBarPage.getFirstPrice("Rs. 400");
        navigationBarPage.getFirQu("1");
        navigationBarPage.getFirsttot("Rs. 400");
        navigationBarPage.getsecondPrice("Rs. 400");
        navigationBarPage.getSecontot("Rs. 400");
        navigationBarPage.getsecondQU("1");

    }




}
