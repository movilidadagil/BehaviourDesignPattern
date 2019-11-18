package behaviours;

import data.ClientLoginInfo;
import data.ClientPurchaseInfo;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-13  */
public class PurchaseTestContext {

    public static String itemUrl;
    public static String itemPrice;
    public static ClientLoginInfo clientLoginInfo;
    public static ClientPurchaseInfo clientPurchaseInfo;

    public static String getItemUrl() {
        return itemUrl;
    }

    public static void setItemUrl(String itemUrl) {
        PurchaseTestContext.itemUrl = itemUrl;
    }

    public static String getItemPrice() {
        return itemPrice;
    }

    public static void setItemPrice(String itemPrice) {
        PurchaseTestContext.itemPrice = itemPrice;
    }

    public static ClientLoginInfo getClientLoginInfo() {
        return clientLoginInfo;
    }

    public static void setClientLoginInfo(ClientLoginInfo clientLoginInfo) {
        PurchaseTestContext.clientLoginInfo = clientLoginInfo;
    }

    public static ClientPurchaseInfo getClientPurchaseInfo() {
        return clientPurchaseInfo;
    }

    public static void setClientPurchaseInfo(ClientPurchaseInfo clientPurchaseInfo) {
        PurchaseTestContext.clientPurchaseInfo = clientPurchaseInfo;
    }

}
