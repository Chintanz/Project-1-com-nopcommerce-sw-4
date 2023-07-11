package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputersPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputersTest extends BaseTest {
        ComputersPage computersPage = new ComputersPage();
    HomePage homePage = new HomePage();
    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
        homePage.clickOnComputersLink();
        homePage.clickOnDesktopsLink();
        homePage.clickOnNameZtoALink();
         }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        computersPage.clickOnAddToCartButton();
        computersPage.getBuildYourComputerText();
        String expectedText = "Build your own computer";
        String actualText = computersPage.getBuildYourComputerText();
        Assert.assertEquals(actualText, expectedText, "Build your own computer not displayed");
        Thread.sleep(1000);
        computersPage.clickOn22GHzIntelPentiumDualCoreE2200();
        computersPage.clickOnSelect8GB();
        Thread.sleep(1000);
        computersPage.clickOnHddRadio400GB();
        computersPage.clickOnOsRadioVistaPremium();
//        computersPage.clickOnMicrosoftOffice();
        computersPage.clickOnTotalCommander();
        Thread.sleep(1000);
        computersPage.getVerifyThePrice$1475();
        String expText = "$1,475.00";
        String actText = computersPage.getVerifyThePrice$1475();
        Assert.assertEquals(expText, actText, "$1,475.00 not displayed");
        Thread.sleep(1000);
        computersPage.clickOnAdCartToButton();
        computersPage.clickOnVerifyTheProductHasBeenAddedToYourShoppingCart();
        String exProductText = "The product has been added to your shopping cart";
        String acProductText = computersPage.clickOnVerifyTheProductHasBeenAddedToYourShoppingCart();
        Assert.assertEquals(exProductText,acProductText,"Product is not added to shopping cart");
        Thread.sleep(1000);
        computersPage.clickOnCloseButton();
        computersPage.clickOnGoToCart();
        Thread.sleep(1000);
        computersPage.getVerifyShoppingCart();
        String exShoppingCart = "Shopping cart";
        String acShoppingCart = computersPage.getVerifyShoppingCart();
        Assert.assertEquals(exShoppingCart,acShoppingCart,"Shopping cart not displayed");
        Thread.sleep(1000);
        computersPage.changeQuantityTo2("2");
        computersPage.clickOnUpdateShoppingCart();
        Thread.sleep(1000);
        computersPage.getVerifyAmount$2950();
        String exAmount = "$2950.00";
        String acAmount = computersPage.getVerifyAmount$2950();
        Assert.assertEquals(exAmount,acAmount,"$2950 not displayed");
        Thread.sleep(1000);
        computersPage.clickOnTermsOfService();
        computersPage.clickOnCheckOut();
        Thread.sleep(1000);
        computersPage.getVerifyWelcomePleaseSignIn();
        String exWelcomeIn = "Welcome, Please Sign In!";
        String acWelcomeIn = computersPage.getVerifyWelcomePleaseSignIn();
        Assert.assertEquals(exWelcomeIn,acWelcomeIn,"Welcome, Please Sign In! not displayed");
        Thread.sleep(1000);
        computersPage.clickOnGuestCheckOut();
        computersPage.clickOnFirstName("Yahoo");
        computersPage.clickOnLastName("Hotmail");
        computersPage.clickOnEmail("java@outlook.com");
        Thread.sleep(1000);
        computersPage.clickOnCountry();
        computersPage.sendTextToCity("London");
        computersPage.sendTextToAddress("Wembley");
        computersPage.sendTextToPhoneNumber("01234567891");
        Thread.sleep(1000);
        computersPage.clickOnContinueButton();
        computersPage.clickOnNextDayAir();
        computersPage.clickOnContinueBtn();
        Thread.sleep(1000);
        computersPage.clickOnCreditCard();
        computersPage.selectCreditCard();
        computersPage.sendTextToCrdHolderName();
        Thread.sleep(1000);
        computersPage.sendTextToCardNumber();
        computersPage.selectExpiryMonth();
        computersPage.selectExpiryYear();
        Thread.sleep(1000);
        computersPage.sendTextToCardCode();
        computersPage.clickOnContinue();
        computersPage.verifyPaymentMethod();
        String exPaymentMethod = "Credit Card";
        String acPaymentMethod = computersPage.verifyPaymentMethod();
        Assert.assertEquals(exPaymentMethod,acPaymentMethod,"Payment Method not displayed");
        Thread.sleep(1000);
        computersPage.verifyShippingMethod();
        String exShippingMethod = "Next Day Air";
        String acShippingMethod = computersPage.verifyShippingMethod();
        Assert.assertEquals(exShippingMethod,acShippingMethod,"Shipping Method not displayed");
        Thread.sleep(1000);
        computersPage.verifyProductTotal();
        String exProductTotal = "$2950.00";
        String acProductTotal = computersPage.verifyProductTotal();
        Assert.assertEquals(exProductTotal,acProductTotal,"$2950.00 Product total not displayed");
        Thread.sleep(1000);
        computersPage.clickOnConfirm();
        String exThankYou = "Thank you";
        String acThankyou = computersPage.verifyThankYou();
        Assert.assertEquals(exThankYou,acThankyou,"Thank you not displayed");
        Thread.sleep(1000);
        computersPage.verifyOrderSuccessfullyProcessed();
        String exOrder = "Your order has been successfully processed!";
        String acOrder = computersPage.verifyOrderSuccessfullyProcessed();
        Assert.assertEquals(exOrder,acOrder,"Your order has been successfully processed! not displayed");
        Thread.sleep(1000);
        computersPage.clickOnContinueAhead();
        computersPage.verifyWelcomeMessage();
        String exWelcome = "Welcome to our store";
        String acWelcome = computersPage.verifyWelcomeMessage();
        Assert.assertEquals(exWelcomeIn,acWelcome,"Welcome to our store not displayed");

    }

}
