package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {
    By computersLink = By.linkText("Computers ");
    By desktops = By.xpath("//a[text()=' Desktops ']");
    By productDescendingOrder = By.xpath(("//option[text()='Name: Z to A']"));
    By addToCartButton = By.xpath("(//*[@class='button-2 product-box-add-to-cart-button'])[1]");
    By buildYourComputerText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By select22GHzIntelPentiumDualCoreE2200 = By.xpath("//option[@data-attr-value=1]");
    By select8GB = By.xpath("//option[@value=5]");
    By hddRadio400GB = By.xpath("//ul[@class='option-list']/li/label[text()='400 GB [+$100.00]']");
    By osRadioVistaPremium = By.xpath("//input[@id='product_attribute_4_9']");
//    By microsoftOffice = By.xpath("//input[@id='product_attribute_5_10']");
    By totalCommander = By.xpath("//input[@id='product_attribute_5_12']");
    By verifyThePrice$1475 = By.xpath("//span[@id='price-value-1']");
    By adToCartButton = By.xpath("//button[@id='add-to-cart-button-1']");
    By verifyTheProductHasBeenAddedToYourShoppingCart = By.xpath("//p[text()='The product has been added to your ']");
    By closeButton = By.xpath("//span[@class='close']");
    By goToCart = By.xpath("//div[@class='add-to-cart-panel']/button[text()='Add to cart']");
    By verifyShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By quantity2 = By.xpath("//input[@id='itemquantity11269']");
    By updateShoppingCart = By.xpath("//button[@id='updatecart']");
    By verifyAmount$2950 = By.xpath("//tbody/tr[1]/td[6]/span[1]");
    By termsOfService = By.xpath("//input[@id='termsofservice']");
    By checkOut = By.xpath("//button[@id='checkout']");
    By verifyWelcomePleaseSignIn = By.xpath("//h1[text()='Welcome, Please Sign In!']");
    By guestCheckOut = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    By firstName = By.xpath("//input[@name='BillingNewAddress.FirstName']");
    By lastName = By.xpath("//input[@name='BillingNewAddress.LastName']");
    By emailEmail = By.xpath("//input[@name='BillingNewAddress.Email']");
    By country = By.xpath("//option[text()='United Kingdom']");
    By city = By.xpath("//input[@data-val-required='City is required']");
    By address = By.xpath("//input[@id='BillingNewAddress_City']");
    By postalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton = By.xpath("//button[text()='Continue']");
    By buttonNextDayAir = By.xpath("//label[@for='shippingoption_1']");
    By continueBtn = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By creditCardRadioBtn = By.xpath("//label[@for='paymentmethod_1']");
    By masterCard = By.xpath("//select[@id=CreditCardType]/option[text()='Master card']");
    By cardHolderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@name='CardNumber']");
    By expirationMonth = By.id("ExpireMonth");
    By expirationYear = By.id("ExpireYear");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By cliContinue = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By paymentMethod = By.xpath("li[class='payment-method'] span[class='value']");
    By shippingMethodNextDay = By.xpath("//span[normalize-space()='Next Day Air']");
    By productTotal = By.xpath("//span[@class='product-subtotal']");
    By confim = By.xpath("//button[normalize-space()='Confirm']");
    By thankYouMessage = By.xpath("//h1[text()='Thank you']");
    By orderSuccessfullyProcessed = By.xpath("//strong[text()='Your order has been successfully processed!']");
    By contContinue = By.xpath("//button[normalize-space()='Continue']");
    By welcomeText = By.xpath("//h2[text()='Welcome to our store']");





    public void clickOnComputersLink() {
        clickOnElement(computersLink);
    }
    public void clickOnDesktopsLink() {
        clickOnElement(desktops);
    }
    public String getDesktopsTextVerify() {
        return getTextFromElement(desktops);
    }
    public void clickOnAddToCartButton(){clickOnElement(addToCartButton);}
    public String getBuildYourComputerText(){
       return getTextFromElement(buildYourComputerText);    }
    public void clickOn22GHzIntelPentiumDualCoreE2200(){
        clickOnElement(select22GHzIntelPentiumDualCoreE2200);}
    public void clickOnSelect8GB(){ clickOnElement(select8GB);
    }
    public void clickOnHddRadio400GB(){ clickOnElement(hddRadio400GB);
    }
    public void clickOnOsRadioVistaPremium(){
        clickOnElement(osRadioVistaPremium);
    }
//    public void clickOnMicrosoftOffice(){clickOnElement(microsoftOffice);}
   public void clickOnTotalCommander(){ clickOnElement(totalCommander);
   }
   public String getVerifyThePrice$1475(){ return getTextFromElement(verifyThePrice$1475); }
   public void clickOnAdCartToButton (){clickOnElement(adToCartButton); }
    public String clickOnVerifyTheProductHasBeenAddedToYourShoppingCart(){
        return getTextFromElement(verifyTheProductHasBeenAddedToYourShoppingCart);
    }
    public void clickOnCloseButton(){ clickOnElement(closeButton);
    }
    public void clickOnGoToCart(){ mouseHoverToElementAndClick(goToCart);
    }
public String getVerifyShoppingCart(){ return getTextFromElement(verifyShoppingCart);
}
public void changeQuantityTo2(String itemquantity11269){sendTextToElement(quantity2,itemquantity11269);
}
public void clickOnUpdateShoppingCart(){ clickOnElement(updateShoppingCart);
}
public String getVerifyAmount$2950(){ return getTextFromElement(verifyAmount$2950);
}
public void clickOnTermsOfService(){clickOnElement(termsOfService);}
    public void clickOnCheckOut(){clickOnElement(checkOut);}
    public String getVerifyWelcomePleaseSignIn(){return getTextFromElement(verifyWelcomePleaseSignIn);}
   public void clickOnGuestCheckOut(){clickOnElement(guestCheckOut);}
   public void clickOnFirstName(String name){sendTextToElement(firstName, name);}
   public void clickOnLastName(String name){sendTextToElement(lastName, name);}
   public void clickOnEmail(String name){sendTextToElement(emailEmail, name);}
    public void clickOnCountry(){selectByVisibleTextFromDropDown(country,"United kingdom");}
    public void sendTextToCity(String id){sendTextToElement(city,"London");}
    public void sendTextToAddress(String id){sendTextToElement(city,"Wembley");}
    public void sendTextToPhoneNumber(String id){sendTextToElement(city,"01234567891");}
    public void clickOnContinueButton(){clickOnElement(continueButton);}
    public void clickOnNextDayAir(){clickOnElement(buttonNextDayAir);}
    public void clickOnContinueBtn(){clickOnElement(continueBtn);}
    public void clickOnCreditCard(){clickOnElement(creditCardRadioBtn);}
    public void selectCreditCard(){selectByVisibleTextFromDropDown(creditCardRadioBtn,"Master card");}
    public void sendTextToCrdHolderName(){sendTextToElement(cardHolderName,"Yahoomail");}
    public void sendTextToCardNumber(){sendTextToElement(cardNumber,"5555 4444 3333 1111");}
    public void selectExpiryMonth(){selectByVisibleTextFromDropDown(expirationMonth,"1");}
    public void selectExpiryYear(){selectByVisibleTextFromDropDown(expirationYear,"2024");}
    public void sendTextToCardCode(){sendTextToElement(cardCode,"737");}
    public void clickOnContinue(){clickOnElement(cliContinue);}
    public String verifyPaymentMethod(){return getTextFromElement(paymentMethod);}
    public String verifyShippingMethod(){return getTextFromElement(shippingMethodNextDay);}
    public String verifyProductTotal(){return getTextFromElement(productTotal);}
    public void clickOnConfirm(){clickOnElement(confim);}
    public String verifyThankYou(){return getTextFromElement(thankYouMessage);}
    public String verifyOrderSuccessfullyProcessed(){return getTextFromElement(orderSuccessfullyProcessed);}
    public void clickOnContinueAhead(){clickOnElement(contContinue);}
    public String verifyWelcomeMessage(){return getTextFromElement(welcomeText);}


}
