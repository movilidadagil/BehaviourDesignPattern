import behaviours.Behaviour;
import behaviours.ItemPageNavigationBehaviour;
import behaviours.SignInPageLoginBehaviour;
import data.ClientAddressInfo;
import data.ClientLoginInfo;
import data.ClientPurchaseInfo;
import org.testng.annotations.Test;
import sun.tools.java.Parser;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-14  */
public class SimpleBehaviourEngineTests {

    @Test
    public void purchaseSimpleBehaviourEngine() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        PurchaseTestContext.itemUrl="/Selenium-Testing-Cookbook-Gundecha-Unmesh/dp/1849515743";
        PurchaseTestContext.itemPrice = "40.49";
        PurchaseTestContext.clientPurchaseInfo=new ClientPurchaseInfo(
                     ClientAddressInfo.builder()
                            .fullName("hasan")
                            .address1("address1")
                            .city("city")
                            .email("hasan@hasan.com")
                            .phone("phone")
                            .state("state")
                            .zip("zip").build()
        );
        PurchaseTestContext.clientPurchaseInfo.couponCode="99PERDIS";
        PurchaseTestContext.clientLoginInfo=ClientLoginInfo.builder()
                .email("g3984159@trbvm.com")
                .password("1234").build();




 /*       SimpleBehaviourEngine.Execute(
                Class.forName(ItemPageNavigationBehaviour.class.getTypeName()).newInstance());

*/
    }

}
