package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By shoppingCartLink = By.linkText("Shopping cart");
    By shoppingCartEmpty = By.xpath("//div[contains(text(),'Your Shopping Cart is empty!')]");
    public void clickOnShoppingCartLink(){
        clickOnElement(shoppingCartLink);
    }
    public String getShoppingCartEmptyMessage(){
        return getTextFromElement(shoppingCartEmpty);
    }
}
