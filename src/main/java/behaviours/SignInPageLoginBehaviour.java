package behaviours;

import pages.ShippingAddressPage;
import pages.SignInPage;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-13  */
public class SignInPageLoginBehaviour extends  Behaviour{

    private final SignInPage signInPage;
    private final ShippingAddressPage shippingAddressPage;
    PurchaseTestContext purchaseTestContext;
    public SignInPageLoginBehaviour(SignInPage signInPage, ShippingAddressPage shippingAddressPage){
        this.signInPage=signInPage;
        this.shippingAddressPage=shippingAddressPage;
        purchaseTestContext=new PurchaseTestContext();
    }
    public void PerformAct(){
        signInPage.login(PurchaseTestContext.clientLoginInfo.email, PurchaseTestContext.clientLoginInfo.password);
    }

    public void PerformPostAct(){
        shippingAddressPage.waitForPageToLoad();
    }
}

