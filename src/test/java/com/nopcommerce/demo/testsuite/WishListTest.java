package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.WishListPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WishListTest extends BaseTest {
    WishListPage wishListPage = new WishListPage();
    HomePage homePage = new HomePage();
    @Test
    public void verifyWishlistIsEmpty(){
        homePage.clickOnWishListLik();
        String exptText = "The wishlist is empty!";
        String acttext = wishListPage.getWishListEmptyMessage();
        Assert.assertEquals(acttext,exptText,"Empty list not Displayed");
    }
}
