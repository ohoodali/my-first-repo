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
        Assert.assertEquals( cardpage.getFirstProdu(),"Men Tshirt","The First Product should be Men Tshirt");
        Assert.assertEquals( cardpage.getSeconProdu(),"Summer White Top","The Second Product should be Summer White Top");
        Assert.assertEquals( cardpage.getFirstPrice(),"Rs. 400","The First Product Price should be Rs. 400");
        Assert.assertEquals( cardpage.getFirQu(),1,"The First Product Quintty should be 1");
        Assert.assertEquals( cardpage.getFirsttot(),"Rs. 400","The Frist Product Totol should be Rs. 400");
        Assert.assertEquals( cardpage.getsecondPrice(),"Rs. 400","The Second Product Price should be Rs. 400");
        Assert.assertEquals( cardpage.getsecondQU(),1,"The Second Product Qunity should be 1");
        Assert.assertEquals( cardpage.getSecontot(),"Rs. 400","The Second Product Totol should be Rs. 400");



    }




}
