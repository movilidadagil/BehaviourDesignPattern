package pages;

import base.BasePage;
import data.ClientPurchaseInfo;
import org.openqa.selenium.WebDriver;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-13  */
public class ShippingAddressPage  extends BasePage {

    ShippingAddressPageMap shippingAddressPageMap;
    public ShippingAddressPage(WebDriver driver){
        super(driver);
        shippingAddressPageMap=new ShippingAddressPageMap();
    }

    public void clickContinueButton()
    {
         shippingAddressPageMap.getContinueButton().click();
    }

    public void fillShippingInfo(ClientPurchaseInfo clientInfo)
    {
        fillAddressInfoInternal(clientInfo);
    }

    public void clickDifferentBillingCheckBox(ClientPurchaseInfo clientInfo)
    {
        if (clientInfo.billingInfo != null)
        {
            shippingAddressPageMap.getDifferentFromBillingCheckbox().click();
        }
    }

    public void fillBillingInfo(ClientPurchaseInfo clientInfo)
    {
        if (clientInfo.billingInfo != null)
        {
            fillAddressInfoInternal(clientInfo);
        }
    }

    public void waitForPageToLoad()
    {
        // wait for a specific element to show up.
    }

    private void fillAddressInfoInternal(ClientPurchaseInfo clientInfo)
    {
        shippingAddressPageMap.getCountryDropDown().selectByValue(clientInfo.shippingInfo.country);
        shippingAddressPageMap.getFullNameInput().sendKeys(clientInfo.shippingInfo.fullName);
        shippingAddressPageMap.address1Input.sendKeys(clientInfo.shippingInfo.address1);
        shippingAddressPageMap.getCityInput().sendKeys(clientInfo.shippingInfo.city);
        shippingAddressPageMap.getZipInput().sendKeys(clientInfo.shippingInfo.zip);
        shippingAddressPageMap.getPhoneInput().sendKeys(clientInfo.shippingInfo.phone);
        shippingAddressPageMap.getShipToThisAddress().click();
    }
}
