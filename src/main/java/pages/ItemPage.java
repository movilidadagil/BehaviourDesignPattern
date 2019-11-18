package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-14  */
public class ItemPage extends BasePage {
    ItemPageMap itemPageMap;
    public ItemPage(WebDriver driver){
        super(driver);
        itemPageMap=new ItemPageMap();
    }
    public final String url="http://www.amazon.com";

    public void clickBuyNowButton(){
         itemPageMap.addToCartButton().click();
    }
    public void navigate(String part){
        open(part);
    }
}
