package tests;

import org.testng.annotations.Test;
import pages.*;

public class SearchTests extends BaseTests_Parent{

    @Test
    public void SearchBlueProducat ()
    {
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        HomePage base=new HomePage(driver);
        SearchPage search = new SearchPage(driver);
        base.clickHome("Signup / Login");
        navigationBarPage.clickProducat();
        search.allProducatShown("ALL PRODUCTS");
        search.searchProfuctbyname("Blue");
        search.AllSharedDisplayed("SEARCHED PRODUCTS");
        search.isKeyWordInProducatTitles("Blue");
        //  search.success( "Blue Top");

    }



}
