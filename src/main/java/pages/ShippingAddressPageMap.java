package pages;

import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-13  */
public class ShippingAddressPageMap {

    public Select countryDropDown;
    public Select deliveryPreferenceDropDown;
    public WebElement fullNameInput;
    public WebElement address1Input;
    public WebElement cityInput;
    public WebElement zipInput;
    public WebElement continueButton;
    public WebElement phoneInput;
    public WebElement shipToThisAddress;
    public WebElement differentFromBillingCheckbox;

    public Select getCountryDropDown() {

        Driver.getBrowserWait().until((d) -> {return d.findElement(By.name("enterAddressCountryCode"));});
        return new Select(Driver.getBrowser().findElement(By.name("enterAddressCountryCode")));
    }

    public void setCountryDropDown(Select countryDropDown) {
        this.countryDropDown = countryDropDown;
    }

    public Select getDeliveryPreferenceDropDown() {
        return new Select(Driver.getBrowser().findElement(By.name("AddressType")));
    }

    public void setDeliveryPreferenceDropDown(Select deliveryPreferenceDropDown) {
        this.deliveryPreferenceDropDown = deliveryPreferenceDropDown;
    }

    public WebElement getFullNameInput() {
        return Driver.getBrowser().findElement(By.id("enterAddressFullName"));
    }

    public void setFullNameInput(WebElement fullNameInput) {
        this.fullNameInput = fullNameInput;
    }

    public WebElement getAddress1Input() {
        return Driver.getBrowser().findElement(By.id("enterAddressAddressLine1"));
    }

    public void setAddress1Input(WebElement address1Input) {
        this.address1Input = address1Input;
    }

    public WebElement getCityInput() {
        return Driver.getBrowser().findElement(By.id("enterAddressCity"));
    }

    public void setCityInput(WebElement cityInput) {
        this.cityInput = cityInput;
    }

    public WebElement getZipInput() {
        return Driver.getBrowser().findElement(By.id("enterAddressPostalCode"));
    }

    public void setZipInput(WebElement zipInput) {
        this.zipInput = zipInput;
    }

    public WebElement getContinueButton() {
        return Driver.getBrowser().findElement(By.xpath("//input[@value='Continue']"));
    }

    public void setContinueButton(WebElement continueButton) {
        this.continueButton = continueButton;
    }

    public WebElement getPhoneInput() {
        return Driver.getBrowser().findElement(By.id("enterAddressPhoneNumber"));
    }

    public void setPhoneInput(WebElement phoneInput) {
        this.phoneInput = phoneInput;
    }

    public WebElement getShipToThisAddress() {
        return Driver.getBrowser().findElement(By.cssSelector("input.a-button-text"));
    }

    public void setShipToThisAddress(WebElement shipToThisAddress) {
        this.shipToThisAddress = shipToThisAddress;
    }

    public WebElement getDifferentFromBillingCheckbox() {
        return Driver.getBrowser().findElement(By.id("isBillingAddress"));
    }

    public void setDifferentFromBillingCheckbox(WebElement differentFromBillingCheckbox) {
        this.differentFromBillingCheckbox = differentFromBillingCheckbox;
    }
}
