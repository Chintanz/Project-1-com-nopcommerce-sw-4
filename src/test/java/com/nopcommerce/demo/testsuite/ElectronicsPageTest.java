package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsPageTest extends BaseTest {
ElectronicsPage electronicsPage = new ElectronicsPage();
HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {
    homePage.clickOnElectronics();
    homePage.clickOnCellPhones();
    String exCellPhones = "Cell phones";
    String acCellPhones = electronicsPage.getVerifyCellPhonesText();
    Assert.assertEquals(exCellPhones,acCellPhones,"Cell Phones not displayed");
    Thread.sleep(1000);
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException{
        homePage.clickOnElectronics();
        homePage.clickOnCellPhones();
        String exCellPhones = "Cell phones";
        String acCellPhones = electronicsPage.getVerifyCellPhonesText();
        Assert.assertEquals(exCellPhones,acCellPhones,"Cell Phones not displayed");
        Thread.sleep(1000);
        electronicsPage.clickOnListViewTab();
        electronicsPage.clickOnNokiaLumia1020();
        String exNokiaLumia1020 = "Nokia Lumia 1020";
        String acNokiaLumia1020 = electronicsPage.getVerifyNokiaLumia1020();
        Assert.assertEquals(exNokiaLumia1020,acNokiaLumia1020,"Nokia Lumia 1020 not displayed");
        Thread.sleep(1000);
        String exPrice$349 = "$349.00";
        String acPrice$349 = electronicsPage.getVerifyPrice$349();
        Assert.assertEquals(exPrice$349,acPrice$349,"$349.00 not displayed");
        Thread.sleep(1000);
        electronicsPage.clearQuantity();
        electronicsPage.addQuantity();
        electronicsPage.clickOnAddToCart();
        String exProductAdd = "The product has been added to your";
        String acProductAdd = electronicsPage.clickOnProductAddedToShopping();
        String[] act = exProductAdd.split("shopping cart");
        Assert.assertEquals(act[0],exProductAdd);
        Thread.sleep(1000);
        electronicsPage.clickOnCloseBar();
        electronicsPage.clickOnShoppingCart();
        electronicsPage.clickOnGoToCart();
        Thread.sleep(1000);
        electronicsPage.getVerifyShoppingCart();
        String exShoppingCart = "Shopping cart";
        String acShoppingCart = electronicsPage.getVerifyShoppingCart();
        Assert.assertEquals(exShoppingCart,acShoppingCart,"Shopping cart not displayed");
        Thread.sleep(1000);
//        electronicsPage.clickOnQuantity("2");
//        electronicsPage.clickOnUpdateShoppingcart();
        electronicsPage.clickOnTermsOfService();
        electronicsPage.clickOnCheckoutButton();
        Thread.sleep(1000);
        electronicsPage.getVerifyWelcomeText();
        String exWelcomeText = "Welcome, Please Sign In!";
        String acWelcomeText = electronicsPage.getVerifyWelcomeText();
        Assert.assertEquals(exWelcomeText,acWelcomeText,"Welcome, PleaseSign In is not displayed");
        Thread.sleep(1000);
        electronicsPage.clickOnregisterTab();
        electronicsPage.getVerifyRegisterText();
        String exRegister = "Register";
        String acRegister = electronicsPage.getVerifyRegisterText();
        Assert.assertEquals(exRegister,acRegister,"Register not displayed");
        Thread.sleep(1000);
        electronicsPage.clickOnGender();
        electronicsPage.sendTextToFirstName("Selenium");
        electronicsPage.sendTextToLastName("Java");
        electronicsPage.sendTextToEmail("api@gmail.com");
        Thread.sleep(1000);
        electronicsPage.sendTextToPassword("coreJava");
        electronicsPage.sendTextToConfirmPassword("coreJava");
        electronicsPage.clickOnRegisterButton();
        Thread.sleep(1000);
        String exRegisterComplete = "Your registration completed";
        String acRegisterComplete = electronicsPage.getVerifyRegistrationComplete();
        Assert.assertEquals(exRegisterComplete,acRegisterComplete,"Your registration completed is not displayed");
        Thread.sleep(1000);
        electronicsPage.clickOnContinueTab();
        electronicsPage.getVerifyShoppingCartDisplay();
        String exShoppingDisplay = "Shopping cart";
        String acShoppingDisplay = electronicsPage.getVerifyShoppingCartDisplay();
        Assert.assertEquals(exShoppingDisplay,acShoppingDisplay,"Shopping cart not displayed");
        Thread.sleep(1000);
        electronicsPage.clickOnTermsOfServices();
        electronicsPage.clickOnCheckOut();
        electronicsPage.clickOnFirstNames("Paython");
        Thread.sleep(1000);
        electronicsPage.clickOnLastNames("Mysql");
        electronicsPage.clickOnEmails("ruby@outlook.com");
        electronicsPage.clickOnCountry();
        Thread.sleep(1000);
        electronicsPage.clickOnCity("Wembley");
        electronicsPage.clickOnPostalCode("HA11HA");
        electronicsPage.clickOnPhoneNumber("01234567891");
        Thread.sleep(1000);
        electronicsPage.clickOnContinueTxt();
        electronicsPage.clickOnButton2ndDay();
        electronicsPage.clickOnContinueBtn();
        Thread.sleep(1000);
        electronicsPage.clickOnCreditCard();
        electronicsPage.clickOnVisa("visa");
        electronicsPage.clickOnCardHolder("Jason");
        Thread.sleep(1000);

        electronicsPage.clickOnCardNumber("5555 4444 3333 1111");
        electronicsPage.clickOnExpiryDate("3");
        electronicsPage.clickOnExpiryMonth("2030");
        Thread.sleep(1000);

        electronicsPage.clickOnCardCode("737");
        electronicsPage.clickOnContinueNext();
        Thread.sleep(1000);
        electronicsPage.getPaymentMethodVerify();
        String exPaymentMethod = "Credit Card";
        String acPaymentMethod = electronicsPage.getPaymentMethodVerify();
        Assert.assertEquals(exPaymentMethod,acPaymentMethod,"Payment Method not displayed");
        Thread.sleep(1000);
        electronicsPage.getShippingMethodVerify();
        String exShipping = "2nd Day Air";
        String acShipping = electronicsPage.getShippingMethodVerify();
        Assert.assertEquals(exShipping,acShipping,"2nd Day Air not displayed");
        Thread.sleep(1000);
        electronicsPage.clickOnConfirmButton();
        electronicsPage.getThankYouVerify();
        String exThankYou = "Thank you";
        String acThankYou = electronicsPage.getThankYouVerify();
        Assert.assertEquals(exThankYou,acThankYou,"Thank You message not displayed");
        Thread.sleep(1000);
        electronicsPage.getOrderSuccessfullyProcessedVerify();
        String acSuccessfullyProcessed = "Your order has been successfully processed";
        String exSuccessfullyProcessed = electronicsPage.getOrderSuccessfullyProcessedVerify();
        Assert.assertEquals(exSuccessfullyProcessed,acSuccessfullyProcessed,"Your order has been successfully processed not displayed");
        Thread.sleep(1000);
        electronicsPage.clickOnContinue();
        electronicsPage.getVerifyWelcomeMessage();
        String acWelcome = "Welcome to our store";
        String exWelcome = electronicsPage.getVerifyWelcomeMessage();
        Assert.assertEquals(acWelcome,exWelcome,"Welcome to our store not displayed");
        Thread.sleep(1000);
        electronicsPage.clickOnLogOut();
        electronicsPage.getCurrentUrl();
    }













}
