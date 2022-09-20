package tests;

import org.testng.annotations.Test;
import pages.*;

public class AddProductToCardTests extends BaseTests_Parent{


    @Test
    public void cheekInOneTest ()
    {
        HomePage base=new HomePage(driver);
        ProductsPage checkpricesquentotal = new ProductsPage(driver);
        CardPage cardpage= new CardPage(driver);
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        base.clickHome("Signup / Login");
        navigationBarPage.clickProducat();
        checkpricesquentotal.hoverOverPro();
        checkpricesquentotal.clickLAddTocard();
        checkpricesquentotal.clickLShopping();
        checkpricesquentotal.hoverOverPro2();
        checkpricesquentotal.clickLAddTocard2();
        checkpricesquentotal.clickLView();
        cardpage.getFirstProdu("Men Tshirt");
        cardpage.getSeconProdu("Summer White Top");
        cardpage.getFirstPrice("Rs. 400");
        cardpage.getFirQu("1");
        cardpage.getFirsttot("Rs. 400");
        cardpage.getsecondPrice("Rs. 400");
        cardpage.getSecontot("Rs. 400");
        cardpage.getsecondQU("1");

    }

/*

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
        ProductsPage hoverclickfirstproducat = new ProductsPage(driver);
        hoverclickfirstproducat.hoverOverPro();
        hoverclickfirstproducat.clickLAddTocard();
        hoverclickfirstproducat.clickLShopping();
    }
    @Test(priority = 4)
    public void clickContinuButton ()
    {
        ProductsPage contineshoping = new ProductsPage(driver);
        contineshoping.hoverOverPro();
        contineshoping.clickLAddTocard();
        contineshoping.clickLShopping();
    }
    @Test(priority = 5)
    public void hoveSecondProducat ()
    {
        ProductsPage hoverclicksecondproducat = new ProductsPage(driver);
        hoverclicksecondproducat.hoverOverPro();
        hoverclicksecondproducat.clickLAddTocard();
        hoverclicksecondproducat.clickLShopping();
        hoverclicksecondproducat.hoverOverPro2();
        hoverclicksecondproducat.clickLAddTocard2();
    }
    @Test(priority = 6)
    public void showCart ()
    {
        ProductsPage showcard = new ProductsPage(driver);
        showcard.hoverOverPro();
        showcard.clickLAddTocard();
        showcard.clickLShopping();
        showcard.hoverOverPro2();
        showcard.clickLAddTocard2();
        showcard.clickLView();

    }
    @Test(priority = 7)
    public void checkTwoProducat ()
    {
        ProductsPage checktwoproduct = new ProductsPage(driver);
        CardPage cardpage= new CardPage(driver);
        checktwoproduct.hoverOverPro();
        checktwoproduct.clickLAddTocard();
        checktwoproduct.clickLShopping();
        checktwoproduct.hoverOverPro2();
        checktwoproduct.clickLAddTocard2();
        checktwoproduct.clickLView();
        cardpage.getFirstProdu("Men Tshirt");
        cardpage.getSeconProdu("Summer White Top");


    }


    @Test(priority =8 )
    public void checkPricesQuTotalProducat ()
    {

        ProductsPage checkpricesquentotal = new ProductsPage(driver);
        CardPage cardpage= new CardPage(driver);
        checkpricesquentotal.hoverOverPro();
        checkpricesquentotal.clickLAddTocard();
        checkpricesquentotal.clickLShopping();
        checkpricesquentotal.hoverOverPro2();
        checkpricesquentotal.clickLAddTocard2();
        checkpricesquentotal.clickLView();
        cardpage.getFirstPrice("Rs. 400");
        cardpage.getFirQu("1");
        cardpage.getFirsttot("Rs. 400");
        cardpage.getsecondPrice("Rs. 400");
        cardpage.getSecontot("Rs. 400");
        cardpage.getsecondQU("1");

    }
*/




}
