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



/*

    @Test(priority = 1)
    public void chekHomePage ()
    {
        HomePage base=new HomePage(driver);
        base.clickHome("Signup / Login");
    }
    @Test(priority = 2)
    public void ClickProducat ()
    {
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        navigationBarPage.clickProducat();
    }

    @Test(priority = 3)
    public void AllProducatShown ()
    {
        SearchPage search = new SearchPage(driver);
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        navigationBarPage.clickProducat();
        search.allProducatShown("ALL PRODUCTS");
    }
    @Test(priority = 4)
    public void SearchedProducat ()
    {
        SearchPage search = new SearchPage(driver);
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        navigationBarPage.clickProducat();
        search.searchProfuctbyname("Blue");
    }

    @Test(priority = 5)
    public void ShowSharedProduct ()
    {
        SearchPage search = new SearchPage(driver);
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);

        navigationBarPage.clickProducat();
        search.searchProfuctbyname("Blue");
        search.searchProducat("SEARCHED PRODUCTS");

    }
    @Test(priority = 6)
    public void SearchForBlueProducts ()
    {
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);

        SearchPage search = new SearchPage(driver);
        navigationBarPage.clickProducat();
        search.searchProfuctbyname("Blue");
        search.isKeyWordInProducatTitles("Blue");
        //  search.success( "Blue Top");

    }
*/

}
