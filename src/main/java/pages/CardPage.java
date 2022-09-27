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
    public String getFirstProdu ()
    {

        String firstproducat= getTextOfElement(firstproduct);
        return firstproducat;
    }

    public String getSeconProdu ()
    {

        String secondproducat= getTextOfElement(secondproduct);
        return secondproducat;
    }
    public String getFirstPrice ()
    {

        String firsprice= getTextOfElement(firstprice);
        return firsprice;
    }
    public String getsecondPrice ()
    {

        String serpr= getTextOfElement(secondprice);
        return serpr;
    }
    public String getFirsttot ()
    {

        String firsttoal= getTextOfElement(firsttot);
        return firsttoal;
    }
    public String getSecontot()
    {

        String secondto= getTextOfElement(secondtot);
        return secondto;
    }
    public int getFirQu ()
    {

        int firstquintiy= Integer.parseInt(getTextOfElement(firstquen));
        return firstquintiy;
    }

    public int getsecondQU ()
    {
        int secondquintiy= Integer.parseInt(getTextOfElement(secondquen));
        return secondquintiy;
    }

}
