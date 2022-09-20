package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CardPage extends BasePage {
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
    public void getFirstProdu (String first)
    {

        String firstproducat= getTextOfElement(firstproduct);
        Assert.assertEquals(first,firstproducat);
    }

    public void getSeconProdu (String second)
    {

        String secondproducat= getTextOfElement(secondproduct);
        Assert.assertEquals(second,secondproducat);
    }
    public void getFirstPrice (String fprice)
    {

        String firsprice= getTextOfElement(firstprice);
        Assert.assertEquals(fprice,firsprice);
    }
    public void getsecondPrice (String sp)
    {

        String serpr= getTextOfElement(secondprice);
        Assert.assertEquals(sp,serpr);
    }
    public void getFirsttot (String firsttotal)
    {

        String firsttoal= getTextOfElement(firsttot);
        Assert.assertEquals(firsttotal,firsttoal);
    }
    public void getSecontot(String secondtotal)
    {

        String secondto= getTextOfElement(secondtot);
        Assert.assertEquals(secondtotal,secondtotal);
    }
    public void getFirQu (String firsqu)
    {

        String firstquintiy= getTextOfElement(firstquen);
        Assert.assertEquals(firsqu,firstquintiy);
    }

    public void getsecondQU (String secondqu)
    {

        String secondquintiy= getTextOfElement(secondquen);
        Assert.assertEquals(secondqu,secondquintiy);
    }

}
