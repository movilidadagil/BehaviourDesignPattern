package pages;

import org.testng.Assert;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-14  */
public class ItemPageAsserter {
    public static void productTitle(ItemPageMap page, String expectedTitle){
        Assert.assertEquals(expectedTitle,page.productTitle().toString());
    }
}
