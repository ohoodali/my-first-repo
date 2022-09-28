package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class AddProductToCardTests extends BaseTests_Parent{


    @Test
    public void testAddProductsToCart ()
    {
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        HomePage base=new HomePage(driver);
        Assert.assertEquals( base.VeryHome(),"Signup / Login","The Sigin Sign Out");
        navigationBarPage.clickProducat();
        ProductsPage productpage = new ProductsPage(driver);
        CardPage cardpage= new CardPage(driver);
        productpage.hoverOverFirstProduct();
        productpage.clickLAddTocardFirstProduct();
        productpage.clickLShopping();
        productpage.hoverOverSecondProduct();
        productpage.clickLAddTocardSecondProduct();
        productpage.clickLView();
        Assert.assertEquals(cardpage.getSizeOfAddedProducts(), 2, "The added products should be 2");
        Assert.assertEquals( cardpage.getFirstProduct(),"Men Tshirt","The First Product should be Men Tshirt");
        Assert.assertEquals( cardpage.getSeconProduct(),"Summer White Top","The Second Product should be Summer White Top");
        Assert.assertEquals( cardpage.getFirstPrice(),"Rs. 400","The First Product Price should be Rs. 400");
        Assert.assertEquals( cardpage.getFirstquantity(),1,"The First Product Quintty should be 1");
        Assert.assertEquals( cardpage.getFirsttotal(),"Rs. 400","The Frist Product Totol should be Rs. 400");
        Assert.assertEquals( cardpage.getsecondPrice(),"Rs. 400","The Second Product Price should be Rs. 400");
        Assert.assertEquals( cardpage.getSecondQuantity(),1,"The Second Product Qunity should be 1");
        Assert.assertEquals( cardpage.getSecontotal(),"Rs. 400","The Second Product Totol should be Rs. 400");



    }




}
