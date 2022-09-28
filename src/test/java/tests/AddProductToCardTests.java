package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class AddProductToCardTests extends BaseTests_Parent{
    @BeforeMethod

        public void testLoginPage () {
         HomePage base=new HomePage(driver);
         Assert.assertEquals( base.VeryHome(),"Signup / Login","The Sigin Sign Out");
            LoginPage loginpage=new LoginPage(driver);
       //     Assert.assertEquals(loginpage.logintoyouraccountVisible(),"Login to your account","Login to your account Shown");
            loginpage.clickLogin();
            //log with valid email and password
            loginpage.loginToAppWithValidCredentials("ertr@gmail.com","111111");
         /* log with Invalid email and password you must run one by one you can't run two together
            loginpage.loginToAppWithInvalidCredentials("msohood@gmail.com","111111");
            Assert.assertEquals(loginpage.incorrectEmailorpassword("msohood@gmail.com","111111"),"Your email or password is incorrect!","Your email or password is incorrect! Shown");
*/

        }

    @Test
    public void testAddProductsToCart ()
    {
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
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
