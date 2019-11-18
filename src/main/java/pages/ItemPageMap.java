package pages;

import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-14  */
public class ItemPageMap {

    public WebElement addToCartButton(){
        return Driver.getBrowser().findElement(By.id("add-to-cart-button"));
    }

    public WebElement productTitle(){
        return Driver.getBrowser().findElement(By.id("productTitle"));
    }
}
