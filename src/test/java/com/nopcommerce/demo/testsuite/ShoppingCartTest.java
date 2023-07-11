package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.ShoppingCartPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest extends BaseTest {
    HomePage homePage = new HomePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    @Test
    public void verifyShoppingCartEmpty(){
        homePage.clickOnShoppingCartLink();
        String exptText = "Your Shopping Cart is empty!";
        String acttext = shoppingCartPage.getShoppingCartEmptyMessage();
        Assert.assertEquals(acttext,exptText,"Empty list not Displayed");
    }

}
