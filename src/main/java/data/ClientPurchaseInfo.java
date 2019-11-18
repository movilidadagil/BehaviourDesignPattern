package data;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-13  */
public class ClientPurchaseInfo {

    public ClientAddressInfo billingInfo;
    public ClientAddressInfo shippingInfo;
    public String couponCode;

    public ClientPurchaseInfo(ClientAddressInfo addressInfo){
        billingInfo = addressInfo;
        shippingInfo = addressInfo;
    }

    public ClientAddressInfo getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(ClientAddressInfo billingInfo) {
        this.billingInfo = billingInfo;
    }

    public ClientAddressInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ClientAddressInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }
}
