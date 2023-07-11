package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class WishListPage extends Utility {
    By wishlistLink = By.linkText("Wishlist");
    By wishlistEmpty = By.xpath("//div[contains(text(),'The wishlist is empty!')]");

    public void clickOnWishListLik(){
        clickOnElement(wishlistLink);
    }
    public String getWishListEmptyMessage(){
        return getTextFromElement(wishlistEmpty);
    }


}
