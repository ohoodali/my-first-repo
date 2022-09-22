package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class AddProductToCardTests extends BaseTests_Parent{


    @Test
    public void cheekInOneTest ()
    {
        ProductsPage checkpricesquentotal = new ProductsPage(driver);
        CardPage cardpage= new CardPage(driver);
         checkpricesquentotal.hoverOverPro();
        checkpricesquentotal.clickLAddTocard();
        checkpricesquentotal.clickLShopping();
        checkpricesquentotal.hoverOverPro2();
        checkpricesquentotal.clickLAddTocard2();
        checkpricesquentotal.clickLView();
        Assert.assertEquals(cardpage.getSizeOfAddedProducts(), 2, "The added products should be 2");
        cardpage.getFirstProdu("Men Tshirt");
        cardpage.getSeconProdu("Summer White Top");
        cardpage.getFirstPrice("Rs. 400");
        cardpage.getFirQu("1");
        cardpage.getFirsttot("Rs. 400");
        cardpage.getsecondPrice("Rs. 400");
        cardpage.getSecontot("Rs. 400");
        cardpage.getsecondQU("1");

    }




}
