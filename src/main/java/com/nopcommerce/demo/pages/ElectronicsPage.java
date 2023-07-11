package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    By electronicsLink = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By cellPhonesLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    By cellPhonesText = By.xpath("//h1[text()='Cell phones']");
    By listViewTab = By.xpath("//a[@class='viewmode-icon list']");
    By nokiaLumis1020 = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    By nokiaLumiaText = By.xpath("//a[contains(text(),'Nokia Lumia 1020')]");
    By price$349 = By.xpath("//span[text()='$349.00']");
    By clearQuantity = By.xpath("//input[@value='1']");
    By addQuantity = By.xpath("//input[@value='1']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");
//    By addToCart = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/button[1]");
    By productAddedToShopping = By.xpath("//p[@class='content']");
    By closeBar = By.xpath("//span[@class='close']");
    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
      By termsOfService = By.xpath("//input[@id='termsofservice']");
      By checkoutButton = By.xpath("//button[@id='checkout']");
      By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
      By registerTab = By.xpath("//button[contains(text(),'Register')]");
      By registerText = By.xpath("//h1[contains(text(),'Register')]");
      By gender = By.xpath("//input[@id='gender-male']");
      By firstName = By.id("FirstName");
      By lastName = By.id("LastName");
      By emailaddress = By.id("Email");
      By password = By.id("Password");
      By confirmPassword = By.id("ConfirmPassword");
      By registerButton = By.xpath("//button[@id='register-button']");
      By registrationComplete = By.xpath("//div[contains(text(),'Your registration completed')]");
      By continueTab = By.xpath("//a[@class='button-1 register-continue-button']");
      By shoppingCartDisplay = By.xpath("//h1[contains(text(),'Shopping cart')]");
      By termsOfServices = By.xpath("//input[@id='termsofservice']");
      By checkOutBtn = By.xpath("//button[@id='checkout']");
      By firstNames = By.xpath("//input[@name='BillingNewAddress.FirstName']");
      By lastNames = By.xpath("//input[@name='BillingNewAddress.LastName']");
      By eEmails = By.xpath("//input[@name='BillingNewAddress.Email']");
      By country = By.xpath("//option[contains(text(),'United Kingdom')]");
      By city = By.xpath("//input[@id='BillingNewAddress_City']");
      By postalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
      By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
      By continueTxt = By.xpath("//button[text()='Continue']");
      By button2ndDayAir = By.xpath("//label[contains(text(),'2nd Day Air ($0.00)')]");
      By continueBtn = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
      By creditcard = By.xpath("//label[@for='paymentmethod_1']");
      By visa = By.id("name");
      By cardHolder = By.xpath("//input[@id='CardholderName']");
      By cardNumber = By.xpath("//input[@name='CardNumber']");
      By expiryDate = By.id("value");
      By expiryMonth = By.id("value");
      By cardCode = By.xpath("//input[@id='CardCode']");
      By continueNext = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
      By paymentCreditVerify = By.xpath("li[class='payment-method'] span[class='value']");
      By shipping2ndDayAirVerify = By.xpath("//span[normalize-space()='2nd Day Air']");
      By confirmButton = By.xpath("//button[@class=button-1 confirm-order-next-step-button]");
      By thankYouVerify = By.xpath("//h1[contains(text(),'Thank you')]");
      By orderSuccessfullyProceedVerify = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
      By clickContinue = By.xpath("//button[contains(text(),'Continue')]");
      By welcomeStoreVerify = By.xpath("//h2[text()='Welcome to our store']");
      By logOutLink = By.xpath("//a[contains(text(),'Log out')]");

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void clickOnElectronics(){clickOnElement(electronicsLink);}
    public void clickOnCellPhones(){mouseHoverToElement(cellPhonesLink);}
    public String getVerifyCellPhonesText(){return getTextFromElement(cellPhonesText);}
    public void clickOnListViewTab(){clickOnElement(listViewTab);}
    public void clickOnNokiaLumia1020(){mouseHoverToElementAndClick(nokiaLumis1020);}
    public String getVerifyNokiaLumia1020(){return getTextFromElement(nokiaLumiaText);}
    public String getVerifyPrice$349(){return getTextFromElement(price$349);}
    public void clearQuantity(){clickOnElement(clearQuantity);}
    public void addQuantity(){sendTextToElement(addQuantity,"2");}
    public void clickOnAddToCart(){clickOnElement(addToCart);}
//    public void clickOnAddToCart(){clickOnElement(addToCart);}
    public String clickOnProductAddedToShopping(){return getTextFromElement(productAddedToShopping);}
    public void clickOnCloseBar(){clickOnElement(closeBar);}
    public void clickOnShoppingCart(){mouseHoverToElementAndClick(shoppingCart);}
    public void clickOnGoToCart(){clickOnElement(goToCart);}
    public String getVerifyShoppingCart(){return getTextFromElement(shoppingCartText);}
//    public void clickOnQuantity(String itemquantity11251){sendTextToElement(quantity2,itemquantity11251);}
//    public void clickOnUpdateShoppingcart(){clickOnElement(updateShoppingCart);}
    public void clickOnTermsOfService(){clickOnElement(termsOfService);}
    public void clickOnCheckoutButton(){clickOnElement(checkoutButton);}
    public String getVerifyWelcomeText(){return getTextFromElement(welcomeText);}
    public void clickOnregisterTab(){clickOnElement(registerTab);}
    public String getVerifyRegisterText(){return getTextFromElement(registerText);}
    public void clickOnGender(){clickOnElement(gender);}
    public void sendTextToFirstName(String name){sendTextToElement(firstName,name);}
    public void sendTextToLastName(String name){sendTextToElement(lastName,name);}
    public void sendTextToEmail(String email){sendTextToElement(emailaddress,email);}
    public void sendTextToPassword(String passwordtxt){sendTextToElement(password,passwordtxt);}
    public void sendTextToConfirmPassword(String confpassword){sendTextToElement(confirmPassword,confpassword);}
    public void clickOnRegisterButton(){clickOnElement(registerButton);}
    public String getVerifyRegistrationComplete(){return getTextFromElement(registrationComplete);}
    public void clickOnContinueTab(){clickOnElement(continueTab);}
    public String getVerifyShoppingCartDisplay(){return getTextFromElement(shoppingCartDisplay);}
    public void clickOnTermsOfServices(){clickOnElement(termsOfServices);}
    public void clickOnCheckOut(){clickOnElement(checkOutBtn);}
    public void clickOnFirstNames(String names ){sendTextToElement(firstNames,names);}
    public void clickOnLastNames(String names ){sendTextToElement(firstNames,names);}
    public void clickOnEmails(String emails){sendTextToElement(eEmails,emails);}
    public void clickOnCountry(){mouseHoverToElementAndClick(country);}
    public void clickOnCity(String cities){sendTextToElement(city,cities);}
    public void clickOnPostalCode(String postcode){sendTextToElement(postalCode,postcode);}
    public void clickOnPhoneNumber(String number){sendTextToElement(phoneNumber,number);}
    public void clickOnContinueTxt(){clickOnElement(continueTxt);}
    public void clickOnButton2ndDay(){clickOnElement(button2ndDayAir);}
    public void clickOnContinueBtn(){clickOnElement(continueBtn);}
    public void clickOnCreditCard(){clickOnElement(creditcard);}
    public void clickOnVisa(String vi){selectByVisibleTextFromDropDown(visa,vi);}
    public void clickOnCardHolder(String holdername){sendTextToElement(cardHolder,holdername);}
    public void clickOnCardNumber(String cardNum){sendTextToElement(cardNumber,cardNum);}
    public void clickOnExpiryDate(String date){selectByValueFromDropDown(expiryDate,date);}
    public void clickOnExpiryMonth(String year){selectByValueFromDropDown(expiryMonth,year);}
    public void clickOnCardCode(String code){sendTextToElement(cardCode,code);}
    public void clickOnContinueNext(){clickOnElement(continueNext);}
    public String getPaymentMethodVerify(){return getTextFromElement(paymentCreditVerify);}
    public String getShippingMethodVerify(){return getTextFromElement(shipping2ndDayAirVerify);}
    public void clickOnConfirmButton(){clickOnElement(confirmButton);}
    public String getThankYouVerify(){return getTextFromElement(thankYouVerify);}
    public String getOrderSuccessfullyProcessedVerify(){return getTextFromElement(orderSuccessfullyProceedVerify);}
    public void clickOnContinue(){clickOnElement(clickContinue);}
    public String getVerifyWelcomeMessage(){return getTextFromElement(welcomeStoreVerify);}
    public void clickOnLogOut(){clickOnElement(logOutLink);}
    public String getCurrentUrl(){return driver.getCurrentUrl();}

}
