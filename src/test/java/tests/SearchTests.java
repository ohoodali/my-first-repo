package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class SearchTests extends BaseTests_Parent{

    @Test
    public void testSearceProducatWithBlueKeyword ()
    {
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        HomePage base=new HomePage(driver);
        Assert.assertEquals( base.VeryHome(),"Signup / Login","The Sigin Sign Out");
        navigationBarPage.clickProducat();
        SearchPage search = new SearchPage(driver);
        Assert.assertEquals(search.allProducatShown(),"ALL PRODUCTS","ALL PRODUCTS should be shown");
        search.searchProductbyname("Blue");
        Assert.assertEquals( search.AllSharedDisplayed(),"SEARCHED PRODUCTS","SEARCHED PRODUCTS should be shown");
        search.isKeyWordInProducatTitles("Blue");
      // Assert.assertEquals(search.SearchItem(),"The  SEARCHED Item ");




    }



}
