package tests;

import org.testng.annotations.Test;
import pages.*;

public class SearchTests extends BaseTests_Parent{

    @Test
    public void SearchBlueProducat ()
    {

        SearchPage search = new SearchPage(driver);
        search.allProducatShown("ALL PRODUCTS");
        search.searchProfuctbyname("Blue");
        search.AllSharedDisplayed("SEARCHED PRODUCTS");
        search.isKeyWordInProducatTitles("Blue");
        //  search.success( "Blue Top");

    }



}
