package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends BasePage{

    private By searchfiled = By.id("search_product");
    private By searchbutton = By.id("submit_search");
    private By searsheditem = By.xpath("(//div[@class=\"overlay-content\"]/p)[1]");

    private By allsearcheditem = By.xpath("//h2[@class=\"title text-center\"]");

    private By allproduct = By.xpath("//h2[@class=\"title text-center\"]");

    private By allProductTitles = By.cssSelector(".productinfo>p");


    public SearchPage(WebDriver driver) {
        super(driver);
    }


    public SearchPage searchProfuctbyname (String searchproduct)
    {
        typeOnInputField(searchfiled, searchproduct);
        clickElement(searchbutton);
        return new SearchPage(driver);
    }
    public String allProducatShown ()
    {

        String alProduct= getTextOfElement(allproduct);
      //  Assert.assertEquals(alProduct,alproducat,"The All Products should Be Shown");
        return alProduct;
    }

    public String AllSharedDisplayed()
    {

        String allshared= getTextOfElement(allsearcheditem);
        //Assert.assertEquals(allshared,searchproduct,"The All SEARCHED PRODUCTS should Be Shown");
        return allshared;
    }

    public String SearchItem ()
    {

      String Myshered= getTextOfElement(searsheditem);
        return Myshered;
    }
    public boolean isKeyWordInProducatTitles (String keyword) {
        List<WebElement> productTitles = locateListOfElement(allProductTitles);

        List<String> titles = new ArrayList<>();
        for (int i = 0; i < productTitles.size(); i++) {
            if (productTitles.get(i).getText().contains(keyword) == false) {
                return false;
            }
            }
            return true;
        }
    }
