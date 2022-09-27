package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class SearchTests extends BaseTests_Parent{

    @Test
    public void SearchBlueProducat ()
    {

        SearchPage search = new SearchPage(driver);
        Assert.assertEquals(search.allProducatShown(),"ALL PRODUCTS");
        search.searchProfuctbyname("Blue");
        Assert.assertEquals( search.AllSharedDisplayed(),"SEARCHED PRODUCTS");
        search.isKeyWordInProducatTitles("Blue");
      //  Assert.assertEquals( search.SearchItem(),"The  SEARCHED Item ");




    }



}
