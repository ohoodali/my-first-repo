package tests;

import org.testng.annotations.Test;
import pages.*;

public class SearchTests extends BaseTests_Parent{

    @Test(priority = 1)
    public void chekHomePage ()
    {
        HomePage base=new HomePage(driver);
        base.clickHome("Signup / Login");
    }
    @Test(priority = 2)
    public void ClickProducat ()
    {
        SearchPage search = new SearchPage(driver);
        search.clickProducat();
    }

    @Test(priority = 3)
    public void AllProducatShown ()
    {
        SearchPage search = new SearchPage(driver);
        search.clickProducat();
        search.allProducatShown("ALL PRODUCTS");
    }
    @Test(priority = 4)
    public void SearchedProducat ()
    {
        SearchPage search = new SearchPage(driver);
        search.clickProducat();
        search.searchProfuct("Blue");
    }

    @Test(priority = 5)
    public void ShowSharedProduct ()
    {
        SearchPage search = new SearchPage(driver);
        search.clickProducat();
        search.searchProfuct("Blue");
        search.searchProducat("SEARCHED PRODUCTS");

    }
    @Test(priority = 6)
    public void SearchForBlueProducts ()
    {
        SearchPage search = new SearchPage(driver);
        search.clickProducat();
        search.searchProfuct("Blue");
        search.isKeyWordInProducatTitles("Blue");
        //  search.success( "Blue Top");

    }

}
