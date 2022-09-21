package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CardPage extends BasePage {
    By allCartRows = By.className("cart_product");
    private By firstproduct = By.xpath("//a[@href=\"/product_details/2\"]");
    private By secondproduct = By.xpath("//a[@href=\"/product_details/6\"]");
    private By firstprice = By.xpath("(//td[@class=\"cart_price\"]/p)[1]");

    private By secondprice = By.xpath("(//td[@class=\"cart_price\"]/p)[2]");

    private By firsttot = By.xpath("(//p[@class=\"cart_total_price\"])[1]");
    private By secondtot = By.xpath("(//p[@class=\"cart_total_price\"])[2]");
    private By firstquen = By.xpath("(//button[@class=\"disabled\"])[1]");
    private By secondquen = By.xpath("(//button[@class=\"disabled\"])[2]");
    public CardPage(WebDriver driver) {
        super(driver);
    }
    public int getSizeOfAddedProducts ()
    {
        return locateListOfElement(allCartRows).size();
    }
    public void getFirstProdu (String first)
    {

        String firstproducat= getTextOfElement(firstproduct);
        Assert.assertEquals(first,firstproducat,"The First Product should be Men Tshirt T");
    }

    public void getSeconProdu (String second)
    {

        String secondproducat= getTextOfElement(secondproduct);
        Assert.assertEquals(second,secondproducat,"The Second Product should be Summer White Top");
    }
    public void getFirstPrice (String fprice)
    {

        String firsprice= getTextOfElement(firstprice);
        Assert.assertEquals(fprice,firsprice,"The First Price should be Rs. 400");
    }
    public void getsecondPrice (String sp)
    {

        String serpr= getTextOfElement(secondprice);
        Assert.assertEquals(sp,serpr,"The Second Price should be Rs. 400");
    }
    public void getFirsttot (String firsttotal)
    {

        String firsttoal= getTextOfElement(firsttot);
        Assert.assertEquals(firsttotal,firsttoal,"The  First Total  should be Rs. 400");
    }
    public void getSecontot(String secondtotal)
    {

        String secondto= getTextOfElement(secondtot);
        Assert.assertEquals(secondtotal,secondtotal,"The Second Total should be Rs. 400");
    }
    public void getFirQu (String firsqu)
    {

        String firstquintiy= getTextOfElement(firstquen);
        Assert.assertEquals(firsqu,firstquintiy,"The First Quinty should be 1");
    }

    public void getsecondQU (String secondqu)
    {

        String secondquintiy= getTextOfElement(secondquen);
        Assert.assertEquals(secondqu,secondquintiy,"The First Quint should be 1");
    }

}
