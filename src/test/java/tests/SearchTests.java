package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class SearchTests extends BaseTests_Parent{

    @Test
    public void SearchBlueProducat ()
    {

        SearchPage search = new SearchPage(driver);
        String Allprod=search.allProducatShown();
        Assert.assertEquals(Allprod,"ALL PRODUCTS");
        search.searchProfuctbyname("Blue");
        String Allsher=  search.AllSharedDisplayed();
        Assert.assertEquals(Allsher,"SEARCHED PRODUCTS");
        search.isKeyWordInProducatTitles("Blue");
       // String searchitem=  search.SearchItem();
        //Assert.assertEquals(searchitem,"The  SEARCHED Item ");




    }



}
