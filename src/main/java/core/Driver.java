package core;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-13  */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.util.TimeUtils;

import java.util.concurrent.TimeUnit;

public  class Driver {


    private static WebDriverWait browserWait;
    private static WebDriver  browser;

    public static WebDriver getBrowser() {
        if(browser==null){
            throw new NullPointerException("The WebDriver browser instance was not initialized. You should first call the method Start.");
        }
        return browser;
    }

    public static void setBrowser(WebDriver browser) {
        Driver.browser = browser;
    }

    public static WebDriverWait getBrowserWait() {
        if (browserWait == null || browser == null)
        {
            throw new NullPointerException("The WebDriver browser wait instance was not initialized. You should first call the method Start.");
        }
        return browserWait;
    }

    public static void setBrowserWait(WebDriverWait browserWait) {
        Driver.browserWait = browserWait;
    }


    public static void StartBrowser(BrowserTypes browserType , int defaultTimeOut )
    {


        switch (browserType)
        {
            case Firefox:
                browser = new FirefoxDriver();
                break;
            case InternetExplorer:
                break;
            case Chrome:
                break;
            default:
                break;
        }
        browserWait = new WebDriverWait(browser, TimeUnit.SECONDS.toSeconds(defaultTimeOut));
    }

    public static void StopBrowser()
    {
        browser.quit();
        browser = null;
        browserWait = null;
    }
}
