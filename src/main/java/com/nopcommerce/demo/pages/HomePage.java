package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By loginLink = By.linkText("Log in");
    By electronicsLink = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By cellPhonesLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");

    By registerLink = By.linkText("Register");
    By wishlistLink = By.linkText("Wishlist");
    By shoppingCartLink = By.linkText("Shopping cart");
    By computersLink = By.linkText("Computers");
    By desktopsLink = By.linkText("Desktops");
    By NameZtoALink = By.xpath("//option[text()='Name: Z to A']");
    By productDescendingOrder = By.xpath(("//option[text()='Name: Z to A']"));
    By addToCartButton = By.xpath("(//*[@class='button-2 product-box-add-to-cart-button'])[1])");
    By buildYourComputerText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By select22GHzIntelPentiumDualCoreE2200 = By.name("product_attribute_1");
    By hddRadio400GB = By.xpath("//ul[@class='option-list']/li/label[text()='400 GB [+$100.00]'])");
    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
    public void clickOnWishListLik(){
        clickOnElement(wishlistLink);
    }
    public void clickOnShoppingCartLink(){
        clickOnElement(shoppingCartLink);
    }
    public void clickOnComputersLink(){clickOnElement(computersLink); }
    public void clickOnElectronics(){mouseHoverToElement(electronicsLink);}
    public void clickOnCellPhones(){clickOnElement(cellPhonesLink);}
    public void clickOnDesktopsLink(){clickOnElement(desktopsLink); }
    public void clickOnNameZtoALink(){clickOnElement(NameZtoALink); }
    public void clickOnProductDescendingOrder(){clickOnElement(productDescendingOrder); }
    public void clickOnAddToCartButton(){clickOnElement(addToCartButton);}
    public void clickOnBuildYourComputerText(){
        clickOnElement(buildYourComputerText);
    }
    public void clickOn22GHzIntelPentiumDualCoreE2200(){
        clickOnElement(select22GHzIntelPentiumDualCoreE2200);
    }




}
