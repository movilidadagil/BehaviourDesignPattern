package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-13  */
public class BasePage {

    protected WebDriver Driver;
    protected WebDriverWait DriverWait;
    public String url;

    public BasePage(WebDriver driver){
        Driver = driver;
        DriverWait = new WebDriverWait(driver, TimeUnit.SECONDS.toSeconds(30));
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void open(String part){

        if(url.isEmpty()){
            throw new IllegalArgumentException("The main URL can not be null or empty");
        }

        Driver.navigate().to(url.concat(part));
    }
}
